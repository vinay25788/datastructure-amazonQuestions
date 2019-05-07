package com.practise.systemdesign;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class Vehicle {
    private final int size;
    private final int lisense;
    private boolean status;
    private Lot lot;

    public Vehicle(int size) {
        this.size = size;
        lisense = this.hashCode();
        lot = Lot.getInstance();
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    private Slot findSlot() {

        Slot slot;
        switch (this.size) {
        case 1:
            slot = lot.getSmallSlots().remove(0);
            break;
        case 2:
            slot = lot.getCompactSlots().remove(0);
            break;
        case 3:
            slot = lot.getLargeSlots().remove(0);
            break;
        default:
            slot = null;
        }
        return slot;
    }

    public void park() {
        Slot slot = findSlot();
        if (slot != null) {
        	System.out.println(" liscence of vehicle "+this.lisense);
            lot.occupiedSlots.put(this.lisense, slot);
            slot.occupy(this);
        }
        else
        {
        	System.out.println("slot is not available in lot ");
        }
    }

    public void leave() {
        Slot slot = lot.occupiedSlots.remove(this.lisense);
        slot.release();
        switch (this.size) {
        case 1:
            lot.getSmallSlots().add(slot);
        case 2:
            lot.getCompactSlots().add(slot);
        case 3:
            lot.getLargeSlots().add(slot);
        }
    }
}

 class Car extends Vehicle{
    public Car(){
        super(1);        
    }
}
 class Truck extends Vehicle{
    public Truck(){
        super(2);        
    }
}

 class Lot {
    private static Lot lot = null;

    private static final int NUMBER_OF_SMALL_SLOTS = 10;
    private static final int NUMBER_OF_COMPACT_SLOTS = 10;
    private static final int NUMBER_OF_LARGE_SLOTS = 10;

    public Map<Integer, Slot> occupiedSlots;
    private List<Slot> smallSlots;
    private List<Slot> compactSlots;
    private List<Slot> largeSlots;

    private Lot() {
        smallSlots = new LinkedList<>();
        compactSlots = new LinkedList<>();
        largeSlots = new LinkedList<>();
        occupiedSlots = new HashMap<>();
        for (int i = 1; i <= NUMBER_OF_SMALL_SLOTS; i++)
            smallSlots.add(new Slot(i, 1));

        for (int i = 1; i <= NUMBER_OF_COMPACT_SLOTS; i++)
            compactSlots.add(new Slot(i, 2));

        for (int i = 1; i <= NUMBER_OF_LARGE_SLOTS; i++)
            largeSlots.add(new Slot(i, 3));

    }

    public List<Slot> getSmallSlots() {
        return smallSlots;
    }

    public List<Slot> getCompactSlots() {
        return compactSlots;
    }

    public List<Slot> getLargeSlots() {
        return largeSlots;
    }

    public static Lot getInstance() {
        if (lot == null)
            lot = new Lot();
        return lot;
    }
}

 class Slot {
    private final int id;
    private final int size;
    private boolean available;
    private Vehicle vehicle;

    public Slot(int id, int size) {
        this.id = id;
        this.size = size;
        this.available = true;
    }

    public void occupy(Vehicle v) {
        this.vehicle = v;
        this.available = false;
    }

    public void release() {
        this.vehicle = null;
        this.available = true;
    }
}
 
 public class Parking
 {
	 public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();
		Car c4 = new Car();
		Car c5 = new Car();
		Car c6 = new Car();
		Car c7 = new Car();
		Car c8 = new Car();
		Car c9 = new Car();
		Car c10 = new Car();
		c1.park();
		c2.park();
		c3.park();
		c4.park();
		c5.park();
		
		c6.park();
		c7.park();
		c8.park();
		c9.park();
		c10.park();
	}
 }