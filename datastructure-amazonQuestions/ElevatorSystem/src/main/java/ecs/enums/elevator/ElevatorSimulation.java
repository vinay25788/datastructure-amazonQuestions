package main.java.ecs.enums.elevator;

import java.util.Random;

import main.java.ecs.impl.Elevator;
import main.java.ecs.impl.ElevatorControlSystem;

/**
 * Created by Arun Singh on 4/3/16.
 */
public class ElevatorSimulation {

    public static void main(String[] args) {

        ElevatorControlSystem elevatorControlSystem = new ElevatorControlSystem(16);
        for(int i = 1; i <15; i++){
        	Random rand = new Random();
        	int nu = rand.nextInt(10);
            elevatorControlSystem.pickUpRequest(nu);
        }

        System.out.println("*** Request Distribution ***");
        for(Elevator elevator : elevatorControlSystem.getElevators()){
            System.out.println("Elevator[" + elevator.getId() + "] - " + elevator.getTotalRequests());
        }

        System.out.println("------------------------");

        System.out.println("*** Stepping simulation ***");
        while(elevatorControlSystem.getActiveRequests() > 0){
            elevatorControlSystem.step();
            for(Elevator elevator : elevatorControlSystem.getElevators()){
               
            	if(elevator.getTotalRequests()>0)
            	System.out.println("Elevator[" + elevator.getId() + "] - Current Floor " + elevator.getCurrentFloor());
            }
        }
    }
}
