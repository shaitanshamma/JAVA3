package Lesson1;

import java.util.ArrayList;

public class AsArrayList<T> {

    public void asArrayList( T[] array , ArrayList<T> arrayList){
        for (int i = 0; i <array.length ; i++) {
            arrayList.add(array[i]);
        }
    }

    public static void main(String[] args) {
        AsArrayList<String> stringAsArrayList = new AsArrayList<>();
        AsArrayList<Integer> integer2 = new AsArrayList<>();
        String str[] = {"s","b","d"};
        Integer un[] = {1,2,3,4,5};
        ArrayList<String> strings = new ArrayList<>();
        ArrayList<Integer> inter = new ArrayList<>();
        stringAsArrayList.asArrayList(str, strings);
        System.out.println(strings);
        integer2.asArrayList(un, inter);
        System.out.println(inter);
    }
}
