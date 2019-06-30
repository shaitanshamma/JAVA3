package Lesson7;

public class Main {
    /*
     * Написать метод вычисляющий выражение a * (b + (c / d)) и
     * возвращающий результат, где a,b,c,d – входные параметры этого метода.
     */

    private static int calculate(int a, int b, int c, int d) {

        // Поскольку заданием не регламентировано какого типа должно быть
        // возвращаемое значение - создадим несколько методов
        return a * (b + (c / d));
    }

    /*
     * Написать метод, принимающий на вход два числа, и проверяющий
     * что их сумма лежит в пределах 10 до 20, если да – вернуть true,
     * в противном случае – false.
     */
    //@TestAnnotation2(prior = 5)
    private static boolean checkTwoNumbers(int first, int second) {
        int sum = first + second;
        return sum <= 20 && sum >= 10;
    }

    /*
     * Написать метод, которому в качестве параметра передаётся целое число,
     * метод додлжен напечатать в консоль положительное-ли число передали
     * или отрицательное; Замечание: ноль считаем положительным числом.
     */

    //private static

    @TestAnnotation(prior = 1)
     public void printIsPositive(int variable) {
        System.out.println("Your number is " + ((variable >= 0) ? "positive" : "negative") + "!");
    }

    /*
     * Написать метод, которому в качестве параметра передаётся
     * целое число, метод должен вернуть true если число отрицательное
     */

    //private static
    @TestAnnotation(prior = 2)
    public boolean isNegative(int variable) {
        return (variable < 0);
    }

    /*
     * Написать метод, которому в качестве параметра передаётся строка,
     * обозначающая имя, метод должен вывести в консоль сообщение "Привет, указанное_имя!"
     */
    @BeforeSuit(prior = 50)
    public void printWelocome(String name) {
        System.out.println("Привет, " + name + "!");
    }

    /*
     * Написать метод, который определяет является ли год високосным.
     * Каждый 4-й год является високосным, кроме каждого 100-го,
     * при этом каждый 400-й – високосный.
     */
    @TestAnnotation(prior = 10)
    //private static
    public  boolean isLeapYear(int year) {
        return (year % 100 != 0) && (year % 4 == 0) || (year % 400 == 0);
    }

}
