package Lesson1;

import java.util.ArrayList;

public class Fruit {
    int weight;


    public Fruit(int weight) {
        this.weight = weight;

    }

    public int getWeight() {
        return weight;
    }
}

class Apple extends Fruit {

    public Apple(int weight) {
        super(weight);

    }
}

class Orange extends Fruit {
    public Orange(int weight) {
        super(weight);
    }
}

class Box<T extends Fruit> {
    ArrayList<T> fruitBox;

    public Box(ArrayList<T> fruitBox) {
        this.fruitBox = fruitBox;
    }

    public int getWeight(Box<T> fruitBox) {
        int weight = 0;
        for (T currentFruit : fruitBox.fruitBox) {
            weight += currentFruit.getWeight();
        }
        return weight;
    }

    public boolean compare(Box anotherBox) {
        if (getWeight(this) == getWeight(anotherBox)) {
            return true;
        }
        return false;
    }


    public void changeBox(Box<T> newFruitBox) {
        for (int i = 0; i < this.fruitBox.size(); i++) {
            newFruitBox.fruitBox.add(this.fruitBox.get(i));
        }
        fruitBox.removeAll(this.fruitBox);
    }

    public void addFruit(T fruit){
        fruitBox.add(fruit);
    }

}

class Main {
    public static void main(String[] args) {
        Apple a1 = new Apple(1);
        Apple a2 = new Apple(1);
        Apple a3 = new Apple(1);
        Apple a4 = new Apple(1);
        Apple a5 = new Apple(1);
        Apple a6 = new Apple(1);
        Orange o1 = new Orange(2);
        Orange o2 = new Orange(2);
        Orange o3 = new Orange(2);
        ArrayList<Apple> apples = new ArrayList<>();
        ArrayList<Apple> apples2 = new ArrayList<>();
        ArrayList<Orange> oranges = new ArrayList<>();
        Box<Apple> appleBox = new Box<>(apples);
        Box<Apple> appleBox2 = new Box<>(apples2);
        Box<Orange> orangeBox = new Box<>(oranges);
        appleBox.addFruit(a1);
        appleBox.addFruit(a2);
        appleBox.addFruit(a3);
        appleBox2.addFruit(a4);
        appleBox2.addFruit(a5);
        appleBox2.addFruit(a6);
        orangeBox.addFruit(o1);
        orangeBox.addFruit(o2);
        orangeBox.addFruit(o3);
        System.out.println("Вес коробки с апельсинами = " + orangeBox.getWeight(orangeBox));
        System.out.println("Вес коробки с яблоками = " + appleBox.getWeight(appleBox));
        System.out.println("Вес второй коробки с яблоками = " + appleBox2.getWeight(appleBox2));
        System.out.println("Одинаково ли весят коробки  = " + orangeBox.compare(appleBox));
        appleBox2.changeBox(appleBox);
        System.out.println("Вес после пересыпки =");
        System.out.println(appleBox.getWeight(appleBox));
        System.out.println(appleBox2.getWeight(appleBox2));
    }
}