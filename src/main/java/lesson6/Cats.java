package lesson6;

public class Cats {
    public static void main(String[] args) {
        Cat cat1 = new Cat(1);
        cat1.name = "Barsik";
        cat1.breed = "British";
        cat1.age = 5;
        cat1.ownerName = "Ivan";

        Cat cat2 = new Cat(2);
        cat2.name = "Murka";
        cat2.breed = "Russian";
        cat2.age = 3;
        cat2.ownerName = "Vova";

        Cat cat3 = new Cat("Gerda","Siamese",1,3,"Masha");
        cat1.meow();
    }

}
