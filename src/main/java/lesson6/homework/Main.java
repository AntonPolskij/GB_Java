package lesson6.homework;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Laptop hpLaptop = new Laptop(1,"15-dw","HP","white","Ryzen 5",8,15);
        Laptop appleLaptop = new Laptop(2,"MacBook Air","Apple","space gray","Apple M1",8,13);
        Laptop lenovoLaptop = new Laptop(3,"Legion 5","Lenovo","black","Ryzen 5",16,16);
        Laptop xiaomiLaptop = new Laptop(4,"RedmiBook Pro","Xiaomi ","gray","Intel Core i7",16,16);
        ArrayList<Laptop> laptopsList = new ArrayList<>();
        laptopsList.add(hpLaptop);
        laptopsList.add(appleLaptop);
        laptopsList.add(lenovoLaptop);
        laptopsList.add(xiaomiLaptop);

        filterByColor(laptopsList,"gray");
        filterByRam(laptopsList,16);
    }

    private static void filterByColor(ArrayList<Laptop> laptops, String color) {
        System.out.println("Laptops with color: " + color);
        System.out.println();
        for (Laptop laptop : laptops) {
            if(laptop.getColor().contains(color)){
                System.out.println(laptop);
            }
        }
        System.out.println("*");
    }
    private static void filterByRam(ArrayList<Laptop> laptops, int ram) {
        System.out.println("Laptops with RAM: " + ram);
        System.out.println();
        for (Laptop laptop : laptops) {
            if(laptop.getRam() == ram){
                System.out.println(laptop);
            }
        }
        System.out.println("*");
    }
}
