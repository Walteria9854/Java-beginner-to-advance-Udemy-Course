public class Main {

    public static void main(String[] args){

        Car car = new Car("2022 Blue Car 296 GTS");
        runRace(car);

        Car Ferrai = new GasPoweredCar("2022 Blue Ferrari 296 GTS", 15.4, 6);
        runRace(Ferrai);

        Car tesla = new ElectricCar("2022 Red Tesla Model 3", 568, 75);
        runRace(tesla);

        Car Toyota = new HybirdCar("2022 Red Tesla Model 3", 16, 8, 8);
        runRace(Toyota);

    }

    public static void runRace(Car car){
        car.startEngine();
        car.drive();
    }


}
