package src.stringquestion.copystring.customTreadpool;

import java.util.ArrayList;
import java.util.List;

//https://github.com/atendrasuri/java_practice/blob/master/src/main/java/com/suri/hackerrank/BuyingShowTickets.java
public class BuyingShowTickets {
    public static void main(String[] args) {

        int arr[]= {2,1,3,4,5};
        System.out.println(""+calculateTimeTakenToGetAllTickets(arr,0));

    }

    private static Long calculateTimeTakenToGetAllTickets(int[] tickets, int p) {
        Long count = 0L;
        //Arrays.asList(tickets)
        List<Integer> list = new ArrayList();
        for (int i = 0; i < tickets.length; i++) {
            list.add(tickets[i]);
        }
        final int size = list.size();
        boolean done = false;
        while (!done) {
            for (int j = 0; j < size; j++) {
                if (list.get(j) == 0) {
                    continue;
                }
                if (list.get(p) == 0) {
                    done = true;
                    break;
                }
                list.set(j, list.get(j) - 1);
                count++;
            }
        }
        return count;
    }
}