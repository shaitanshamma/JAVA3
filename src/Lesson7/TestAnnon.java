package Lesson7;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

public class TestAnnon {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Class main = Main.class;
        Main mn = new Main();
        Method[] methods = main.getDeclaredMethods();
        List<Method> list = new ArrayList<>();
        List<Method> listBefore = new ArrayList<>();
        for (Method o : methods) {
            if (o.isAnnotationPresent(BeforeSuit.class)) {
                listBefore.add(o);
                listBefore.sort(new Comparator<Method>() {
                    @Override
                    public int compare(Method o1, Method o2) {
                        return o2.getAnnotation(TestAnnotation.class).prior() - o1.getAnnotation(TestAnnotation.class).prior();
                    }
                });
            }
            if(o.isAnnotationPresent(TestAnnotation.class)){
                list.add(o);
                list.sort(new Comparator<Method>() {
                    @Override
                    public int compare(Method o1, Method o2) {
                        return o2.getAnnotation(TestAnnotation.class).prior() - o1.getAnnotation(TestAnnotation.class).prior();
                    }
                });
            }
        }
        System.out.println(listBefore);
        System.out.println(list);

        for (Method o : listBefore) {
            if (o.isAnnotationPresent(BeforeSuit.class)) {
                o.invoke(mn, "Vasia");
                System.out.println(o.getAnnotation(BeforeSuit.class).prior());
            }
        }
            for (Method o : list) {
                if (o.isAnnotationPresent(TestAnnotation.class)) {
                //System.out.println(o.getAnnotation(TestAnnotation.class).priority());
                System.out.println(o.invoke(mn, 2017));
                System.out.println(o.getAnnotation(TestAnnotation.class).prior());
            }
//                else if(o.isAnnotationPresent(TestAnnotation2.class)){
//                o.setAccessible(true);
//                System.out.println(o.invoke(mn,20,30));
//            }
        }
    }
}
