package Lesson_8;

import java.util.ArrayList;

public class CheckLenght {

    static Object res = new Object();
    static Object marker = new Object();

    static void push(ArrayList arrayList){
        arrayList.add(res);
    }
    static void pushMarker(ArrayList arrayList, Object o){
        arrayList.add(res);
    }

    static Object pop(ArrayList arrayList){
        return res = arrayList.get(0);
    }
    static Object popOne(ArrayList arrayList){
        return marker = arrayList.get(0);
    }


}
class Main {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        int size =0;
        int size2 =0;
        Object a = new Object();
        Object b = new Object();
        Object c = new Object();
        Object d = new Object();
        Object e = new Object();

        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        list.add(e);


        // Первый вариант, ленивый.

        for (Object o:list) {
            CheckLenght.pop(list);
            size++;
        }

        // Второй вариант
        CheckLenght.popOne(list);
        CheckLenght.pushMarker(list, CheckLenght.marker);
        size2++;
        for (Object o:list) {
            if(!o.equals(CheckLenght.marker)){
                size2++;
            }
        }
        System.out.println("Коллекция состоит из " + size2 + " элементов.");
        System.out.println("Коллекция состоит из " + size + " элементов.");
    }
}