package Lab3.task5;

import java.util.*;
public class Chocolate implements Comparable<Chocolate>{
    private int weight;
    private String name;

    public Chocolate(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Chocolate [weight=" + weight + ", name=" + name + "]";
    }

    @Override
    public int compareTo(Chocolate o) {
        return this.weight - o.weight;
    }

}
