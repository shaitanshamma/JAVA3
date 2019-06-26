package Lesson7;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class ReflectionTest {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, MalformedURLException, ClassNotFoundException {

        Class ch = URLClassLoader.newInstance(new URL[]{
                new File("D:/JAVA3/Project/src").toURL()}).loadClass("Main");
        Method [] methods = ch.getDeclaredMethods();
        for (Method o:methods) {
            System.out.println(o);
        }

        Method m = ch.getDeclaredMethod("isLeapYear");
        Method m1 = ch.getClass().getDeclaredMethod("isLeapYear");


        m.setAccessible(true);

        System.out.println(m.invoke(ch,5));
//
//        Constructor constructor = ch.getConstructor(String.class);
//
//
//
//        Object human = constructor.newInstance("Bob");
//
//        Method m = ch.getDeclaredMethod("info");
//
//        m.invoke(human);

//        File file = new File("D:\\JAVA3\\Project\\src\\Lesson7\\Main.class");
//        String[] str = file.list();
//        for(
//                String o :str)
//
//        {
//            String[] mass = o.split("\\.");
//            if (mass[1].equalsIgnoreCase("class")) {
//
//            }
//        }
    }
}


