package Lesson1;

public class Arrays<T> {
    private T arr[];
    T object;

    public Arrays(T... arr) {
        this.arr = arr;
    }

    public void changePosition() {

        for (int i = 0; i < arr.length / 2; i++) {
            object = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = object;
        }
    }

    public void printArr() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

        }
        System.out.println();
    }

    public static void main(String[] args) {
        Arrays<String> stringArrays = new Arrays<>("f", "a", "c", "d", "e");
        Arrays<Integer> intArrays = new Arrays<>(1, 2, 3, 4, 5);
        System.out.println("Исходный массив: ");
        stringArrays.printArr();
        System.out.println("Измененный массив: ");
        stringArrays.changePosition();
        stringArrays.printArr();
        System.out.println("Исходный массив: ");
        intArrays.printArr();
        System.out.println("Измененный массив: ");
        intArrays.changePosition();
        intArrays.printArr();
    }

}
