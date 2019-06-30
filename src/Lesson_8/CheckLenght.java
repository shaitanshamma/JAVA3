package Lesson_8;

import java.util.ArrayList;

public class CheckLenght {

    static Object resume = new Object();

    static void push(ArrayList arrayList){
        arrayList.add(resume);
    }

    static Object pop(ArrayList arrayList){
        return resume = arrayList.get(0);
    }

}
class Main {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        int size =0;
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
        for (Object o:list) {
            CheckLenght.pop(list);
            size++;
        }
        System.out.println(size);
    }
}