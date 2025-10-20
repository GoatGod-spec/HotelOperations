package com.pluralsight;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Room> rooms = new ArrayList<>();
        Room r101 = new Room(1);

        rooms.add(r101);

        for(Room r : rooms){
            System.out.println(r);
        }

        Reservation res1 = new Reservation("king", 2, true);
        System.out.print(res1);
    }
}