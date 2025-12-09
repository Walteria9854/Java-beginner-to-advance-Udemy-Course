package dev.lpa;

import java.util.ArrayList;

record OrderItem(int qty, ProductForSale product){}

public class Store {

    private static ArrayList<ProductForSale> storeProducts = new ArrayList<>();

    public static void main(String[] args){

        storeProducts.add(new ArtObject(
                "Oil Painting", 1350, "Impressionistic work by ABF painted in 2010"));

        storeProducts.add(new ArtObject(
                "Sculpture", 2000, "Bronze work by JKF, produced in 1950"));

        listProducts();
    }

    public static void listProducts() {
        for(var item : storeProducts) {
            System.out.println("-".repeat(30));
            item.showDetails();
        }
    }

    public static void additemToOrder(ArrayList< OrderItem> order, int orderIndex, int qty){
        order.add(new OrderItem(qty, storeProducts.get(orderIndex)));
    }

    public static void printOrder(ArrayList<OrderItem> order) {
        double salesTotal = 0;
        for(var item : order){
            item.product().printPricedItem(item.qty());
            salesTotal += item.product().getSalesPrice(item.qty());
        }
        System.out.printf("sales Total = $%6.2f %n", salesTotal);
    }
}
