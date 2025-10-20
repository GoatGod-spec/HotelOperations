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
    }
}