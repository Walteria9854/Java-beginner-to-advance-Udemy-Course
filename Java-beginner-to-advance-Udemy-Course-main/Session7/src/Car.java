public class Car {

    private String make = "Tesla";
    private String modal = "Modal X";
    private String color = "Gray";
    private int doors = 2;
    private boolean convertible = true;

    public String getMake() {
        return make;
    }

    public String getModal() {
        return modal;
    }

    public String getColor() {
        return color;
    }

    public void setModal(String modal) {
        this.modal = modal;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setMake(String make){

        if(make == null)make = "Unknown";
        String lowercaseMake = make.toLowerCase();
        switch(lowercaseMake){
            case "holden", "porsche", "tesla" -> this.make = make;
            default -> {
                this.make = "Unsupported";
            }
        }
    }

    public void describeCar(){
        System.out.println(doors + "-door" +
                color + " " +
                make + " " +
                modal + " " +
                (convertible ? "Convertible" : " "));
    }
}
