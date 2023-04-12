package lesson6.homework;

import java.util.Objects;

public class Laptop {
    private int id;
    private String model;
    private String fabricator;
    private String color;
    private String processor;
    private int ram;
    private int diagonal;

    public Laptop(int id, String model, String fabricator, String color, String processor, int ram, int diagonal) {
        this.id = id;
        this.model = model;
        this.fabricator = fabricator;
        this.color = color;
        this.processor = processor;
        this.ram = ram;
        this.diagonal = diagonal;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFabricator() {
        return fabricator;
    }

    public void setFabricator(String fabricator) {
        this.fabricator = fabricator;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    @Override
    public String toString() {
        return "Laptop" + "model='" + model + '\'' + ", fabricator='" + fabricator + '\'' + ", color='" + color + '\'' + ", processor='" + processor + '\'' + ", ram=" + ram + ", diagonal=" + diagonal;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return id == laptop.id && ram == laptop.ram && diagonal == laptop.diagonal && Objects.equals(model, laptop.model) && Objects.equals(fabricator, laptop.fabricator) && Objects.equals(color, laptop.color) && Objects.equals(processor, laptop.processor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, model, fabricator, color, processor, ram, diagonal);
    }
}
