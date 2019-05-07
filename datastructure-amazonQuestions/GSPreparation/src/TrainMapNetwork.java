/* Problem Name is &&& Train Map &&& PLEASE DO NOT REMOVE THIS LINE. */

/**
 * Instructions to candidate.
 * 1) Run this code in the REPL to observe its behaviour. The
 * execution entry point is main().
 * 2) Consider adding some additional tests in doTestsPass().
 * 3) Implement def shortestPath(self, fromStationName, toStationName)
 * method to find shortest path between 2 stations
 * 4) If time permits, some possible follow-ups.
 */

/*
 *      Visual representation of the Train map used
 *
 *      King's Cross St Pancras --- Angel ---- Old Street
 *      |                   \                            |
 *      |                    \                            |
 *      |                     \                            |
 *      Russell Square         Farringdon --- Barbican --- Moorgate
 *      |                                                  /
 *      |                                                 /
 *      |                                                /
 *      Holborn --- Chancery Lane --- St Paul's --- Bank
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.Stack;

/**
 * class TrainMap
 * <p>
 * Respresents whole rail network - consists of number of the Station objects.
 * Stations in the map are bi-directionally connected. Distance between any 2 stations
 * is of same constant distance unit. This implies that shortest distance between any
 * 2 stations depends only on number of stations in between
 */
 public class TrainMapNetwork {
  /**
   * class Station
   * <p>
   * Respresents Station in the rail network. Each station is identified by
   * unique name. Station is connected with other stations - this information
   * is stored in the 'neighbours' field. Two station objects with the same name are
   * equal therefore they are considered to be same station.
   */
  private static class Station {
    private String name;
    private List<Station> neighbours;

    public Station(String name) {
      this.name = name;
      this.neighbours = new ArrayList<>(3);
    }

    String getName() {
      return name;
    }

    void addNeighbour(Station v) {
      this.neighbours.add(v);
    }

    List<Station> getNeighbours() {
      return this.neighbours;
    }

    @Override
    public boolean equals(Object obj) {
      return obj instanceof Station && this.name.equals(((Station) obj).getName());
    }

    @Override
    public int hashCode() {
      return Objects.hash(this.name);
    }
  }

  /**
   * class TrainMap
   * <p>
   * Respresents whole rail network - consists of number of the Station objects.
   * Stations in the map are bi-directionally connected. Distance between any 2 stations
   * is of same constant distance unit. This implies that shortest distance between any
   * 2 stations depends only on number of stations in between
   */
  private static class TrainMap {

    private HashMap<String, Station> stations;

    public TrainMap() {
      this.stations = new HashMap<>();
    }

    public TrainMap addStation(String name) {
      Station s = new Station(name);
      this.stations.putIfAbsent(name, s);
      return this;
    }

    public Station getStation(String name) {
      return this.stations.get(name);
    }

    public TrainMap connectStations(Station fromStation, Station toStation) {
      if (fromStation == null) {
        throw new IllegalArgumentException("From station is null");
      }
      if (toStation == null) {
        throw new IllegalArgumentException("From station is null");
      }
      fromStation.addNeighbour(toStation);
      toStation.addNeighbour(fromStation);
      return this;
    }

    public List<Station> shortestPathBFS(String from, String to) {
      Station root = this.stations.get(from);
      if (root == null) {
        throw new IllegalArgumentException("Start station is not present in the map");
      }
      Station goalNode = this.stations.get(to);
      if (goalNode == null) {
        throw new IllegalArgumentException("Goal station is not present in the map");
      }
      LinkedList<Station> searchSpace = new LinkedList<>();
      Map<Station, Station> parentOfTheNode = new HashMap<>();
      Set<Station> visited = new HashSet<>();

      searchSpace.add(root);
      while (!searchSpace.isEmpty()) {
        Station curr = searchSpace.poll();
        if (!visited.contains(curr)) {
          visited.add(curr);
          if (curr.equals(goalNode)) {
            break;
          } else {
            curr.getNeighbours().stream().forEach(station -> {
              parentOfTheNode.putIfAbsent(station, curr);
              searchSpace.addLast(station);
            });
          }
        }
      }

      LinkedList<Station> shortestPath = new LinkedList<>();
      Station parentNode = parentOfTheNode.get(goalNode);
      shortestPath.addFirst(goalNode);
      shortestPath.addFirst(parentNode);
      while (!parentNode.equals(root)) {
        parentNode = parentOfTheNode.get(parentNode);
        shortestPath.addFirst(parentNode);
      }

      return shortestPath;
    }

    public Set<List<Station>> getAllPathsDFS(String from, String to) {
      Set<List<Station>> allPaths = new HashSet<>();
      Station root = this.stations.get(from);
      Station goalNode = this.stations.get(to);
      Stack<Station> searchSpace = new Stack<>();
      searchSpace.push(root);
      allPathsDFSRecursive(searchSpace, goalNode, allPaths);
      return allPaths;
    }

    private void allPathsDFSRecursive(Stack<Station> searchSpace, Station goalNode, Set<List<Station>> paths) {
      Station current = searchSpace.peek();
      if (current.equals(goalNode)) {
        Station[] path = new Station[searchSpace.size()];
        paths.add(Arrays.asList(searchSpace.toArray(path)));
      } else {
        for (Station v : current.getNeighbours()) {
          if (!searchSpace.contains(v)) {
            searchSpace.push(v);
            allPathsDFSRecursive(searchSpace, goalNode, paths);
          }
        }
      }
      searchSpace.pop();
    }

    public List<Station> shortestPathDFS(String from, String to) {
      Set<List<Station>> paths = getAllPathsDFS(from, to);
      List<Station> shortest = null;
      for (List<Station> path : paths) {
        if (shortest == null || shortest.size() > path.size()) {
          shortest = path;
        }
      }
      return shortest;
    }

    public static String convertPathToStringRepresentation(List<Station> path) {
      if (path.isEmpty()) {
        return "";
      }
      return path.stream().map(Station::getName).reduce((s1, s2) -> s1 + "->" + s2).get();
    }
  }
  
  public static boolean doTestsPass() {
    // todo: implement more tests, please
    // feel free to make testing more elegant
    TrainMap trainMap = new TrainMap();

    trainMap.addStation("King's Cross St Pancras").addStation("Angel").addStation("Old Street").addStation("Moorgate")
        .addStation("Farringdon").addStation("Barbican").addStation("Russel Square").addStation("Holborn")
        .addStation("Chancery Lane").addStation("St Paul's").addStation("Bank");

    trainMap.connectStations(trainMap.getStation("King's Cross St Pancras"), trainMap.getStation("Angel"))
        .connectStations(trainMap.getStation("King's Cross St Pancras"), trainMap.getStation("Farringdon"))
        .connectStations(trainMap.getStation("King's Cross St Pancras"), trainMap.getStation("Russel Square"))
        .connectStations(trainMap.getStation("Russel Square"), trainMap.getStation("Holborn"))
        .connectStations(trainMap.getStation("Holborn"), trainMap.getStation("Chancery Lane"))
        .connectStations(trainMap.getStation("Chancery Lane"), trainMap.getStation("St Paul's"))
        .connectStations(trainMap.getStation("St Paul's"), trainMap.getStation("Bank"))
        .connectStations(trainMap.getStation("Angel"), trainMap.getStation("Old Street"))
        .connectStations(trainMap.getStation("Old Street"), trainMap.getStation("Moorgate"))
        .connectStations(trainMap.getStation("Moorgate"), trainMap.getStation("Bank"))
        .connectStations(trainMap.getStation("Farringdon"), trainMap.getStation("Barbican"))
        .connectStations(trainMap.getStation("Barbican"), trainMap.getStation("Moorgate"));


    boolean pass = true;
    String solution = "King's Cross St Pancras->Russel Square->Holborn->Chancery Lane->St Paul's";

    pass = pass && solution.equals(TrainMap.convertPathToStringRepresentation(trainMap.shortestPathDFS("King's Cross St Pancras", "St Paul's")));
    pass = pass && solution.equals(TrainMap.convertPathToStringRepresentation(trainMap.shortestPathBFS("King's Cross St Pancras", "St Paul's")));

    return pass;
  }
  
  public static void main(String[] args) {
    if (doTestsPass()) {
      System.out.println("All tests pass");
    } else {
      System.out.println("Tests fail.");
    }
  }
}
