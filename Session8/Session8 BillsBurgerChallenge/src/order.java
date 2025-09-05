public class order {

    private String burger;

    private String drinks;

    private String sideItem;

    private double totalPrice;

    public order() {
        this.burger = "regular burger";
        this.drinks = "small Coke";
        this.sideItem = "fries";
        this.totalPrice = 300;
    }

    public order(String burger, String drinks, String sideItem, double totalPrice) {
        this.burger = burger;
        this.drinks = drinks;
        this.sideItem = sideItem;
        this.totalPrice = totalPrice;
    }

    public void mealOrder(){
        System.out.println("regular order -> burger: " + burger + " Drinks: " + drinks + " sideitem: " + sideItem + " TotalPrice: " + totalPrice);
    }

    public void addToppings(){

    }

    public void printItemizedList(){

    }

    public void printToatl(){

    }

}

class theDrinkItems extends order {
    private String type;
    private String size;
    private double price;

    public theDrinkItems(String burger, String drinks, String sideItem, double totalPrice) {
        super(burger, drinks, sideItem, totalPrice);
    }
    public theDrinkItems(String burger, String drinks, String sideItem, double totalPrice, String type, String size) {
        super(burger, drinks, sideItem, totalPrice);
        this.type = type;
        this.size = size;
        this.price = price;
    }

    public void addTotalPrice(double price) {
        int setTotalPrice;
        //setTotalPrice = price + getTotalPrice;
    }




}
