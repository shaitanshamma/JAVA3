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

    class Box <T>{
        ArrayList<T> fruitBox;

        public Box(ArrayList<T> fruitBox) {
            this.fruitBox = fruitBox;
        }

    public void getWeight(ArrayList<T> fruitBox){
        for (T currentFruit: fruitBox
             ) {
            
        }

    }
    }
    class Main{
        public static void main(String[] args) {
            Apple a1 = new Apple(1);
            Apple a2 = new Apple(1);
            Apple a3 = new Apple(1);
            Orange o1 = new Orange(2);
            Orange o2 = new Orange(2);
            Orange o3 = new Orange(2);
            ArrayList<Apple> apples = new ArrayList<>();
            ArrayList<Orange> oranges = new ArrayList<>();
            Box<Apple> appleBox = new Box<>(apples);
            Box<Orange> orangeBox = new Box<>(oranges);
            appleBox.fruitBox.add(a1);
            appleBox.fruitBox.add(a2);
            appleBox.fruitBox.add(a3);
            orangeBox.fruitBox.add(o1);
            orangeBox.fruitBox.add(o2);
            orangeBox.fruitBox.add(o3);



        }
    }