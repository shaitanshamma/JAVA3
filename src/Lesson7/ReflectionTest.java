package Lesson7;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;

public class ReflectionTest {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, MalformedURLException, ClassNotFoundException {
        File file = new File("D:/HomeWork");
        String[] str = file.list();
        ArrayList<String> fileName = new ArrayList<>();
        for (String o :str) {
            String[] mass = o.split("\\.");
            if(mass[1].equalsIgnoreCase("class")) {
                fileName.add(mass[0]);
            }
        }
        System.out.println(fileName);

        for (int i = 0; i <fileName.size() ; i++) {
            System.out.println(fileName.get(i));
            Class chi = URLClassLoader.newInstance(new URL[]{
                    new File("D:/HomeWork").toURL()}).loadClass(fileName.get(i));
            Method [] methods = chi.getDeclaredMethods();
            for (Method o:methods) {
                System.out.println(o);
            }
        }

        Class ch = URLClassLoader.newInstance(new URL[]{
                new File("D:/HomeWork").toURL()}).loadClass("Ivanov");
        Method [] methods = ch.getDeclaredMethods();
//        for (Method o:methods) {
//            System.out.println(o);
//        }

        Method m = ch.getDeclaredMethod("isLeapYear", int.class);
        Method m2 = ch.getDeclaredMethod("printWelocome", String.class);
        Method m3 = ch.getDeclaredMethod("calculate", int.class,int.class,int.class,int.class);
        Method m4 = ch.getDeclaredMethod("isNegative", int.class);
        Method m5 = ch.getDeclaredMethod("printIsPositive", int.class);
        Method m6 = ch.getDeclaredMethod("checkTwoNumbers", int.class, int.class);
        m.setAccessible(true);
        m2.setAccessible(true);
        m3.setAccessible(true);
        m4.setAccessible(true);
        m5.setAccessible(true);
        m6.setAccessible(true);

        System.out.println();
        System.out.println("Проверка метода " + m.getName() + " 2019 високосный?");
        System.out.println(m.invoke(null,2019));
        System.out.println("Проверка метода " + m2.getName());
        System.out.println(m2.invoke(null,"Ivanov"));
        System.out.println("Проверка метода " + m3.getName());
        System.out.println(m3.invoke(null,5,6,7,4));
        System.out.println("Проверка метода " + m4.getName());
        System.out.println(m4.invoke(null,256));
        System.out.println("Проверка метода " + m5.getName());
        System.out.println(m5.invoke(null,5));
        System.out.println("Проверка метода " + m6.getName());
        System.out.println(m6.invoke(null,5, 55));

    }
}


