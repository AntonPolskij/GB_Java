package lesson6;

public class Cat {
    String name;
    String breed;
    Integer age;
    Integer id;
    String ownerName;

    public Cat(String name, String breed, Integer age, Integer id, String ownerName) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.id = id;
        this.ownerName = ownerName;
    }

    public Cat(Integer id) {
        this.id = id;
    }

    public String toString() {
        return String.format("%d %s %s %d %s", id, name, breed, age, ownerName);
    }

    public static void meow(){
        System.out.println("meow");
    }
}
