package dev.lpa;

import java.util.LinkedList;

record Place(String name, int distance){}

public class Main {

    public static void main(String[] args){

        LinkedList<Place> placeToVisit = new LinkedList<>();
        Place adelaide = new Place("Adelaide", 1374);
        addPlace(placeToVisit, adelaide);
        System.out.println(placeToVisit);

    }

    private static void addPlace(LinkedList<Place> list, Place place){
        if(list.contains(place)){
            System.out.println("Found duplicate: " + place);
            return;
        }
        list.add(place);
    }
}
