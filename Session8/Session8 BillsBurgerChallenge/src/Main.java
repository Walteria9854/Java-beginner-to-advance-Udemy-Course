public class Main {

    public static void main(String[] args){
//        order order = new order();
//        readyMealSet(order);
//
//        Item coke = new Item("Drink", "coke", 1.50);
//        coke.printItem();
//        coke.setSize("LARGE");
//        coke.printItem();
//
//        Item avocado = new Item("Topping", "avocado", 1.50);
//        avocado.printItem();

//        Burger burger = new Burger("regular", 4.00);
//        burger.addToppings("BACON", "CHEESE","MAYO");
//        burger.printItem();

        MealOrder regularmeal = new MealOrder();
        regularmeal.addBurgerToppings("BACON", "CHEESE", "MAYO");
        regularmeal.setDrinkSize("LARGE");
        regularmeal.printItemizedList();
    }

    public static void readyMealSet(order order){
        order.mealOrder();
    }
}
