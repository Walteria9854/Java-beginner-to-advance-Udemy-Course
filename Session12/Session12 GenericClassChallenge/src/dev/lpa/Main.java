package dev.lpa;



record location(double location, double locations){}

public class Main {
    public static void main(String[] args){

        var nationalUSParks = new Park[]{
            new Park("Yellowstone", "44.4882, -100.5916"),
            new Park("Grand Canyon", "36.0636, -112.1079"),
            new Park("Yosemite", "37.8855, -119.5360")
        };

        layer<Park> parkLayer = new layer<>(nationalUSParks);
        parkLayer.renderLayer();

        var majorUSERiver = new River[]{
            new River("Mississippi", "47.2160, -95.2348", "29.1566, -89.2495"),
            new River("Missouri", "45.9239, -111.4983", "38.8146, -90.1218")
        };

        layer<River> riverLayer = new layer<>(majorUSERiver);

        riverLayer.addElement(
            new River("Colorado", "40.4708, -105.8286", "31.7811, -114.7724"),
            new River("Delaware", "42.2026, -75,00836", "39.4955, -75.5592")
        );
        riverLayer.renderLayer();
    }
}
