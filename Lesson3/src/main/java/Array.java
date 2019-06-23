import java.util.Arrays;

public class Array {

    public int [] checkFourInArray(int[] array) {
        int size = 0;
        int w = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 4) {
                w = i;
            }
            size = array.length - w - 1;
        }
        if (w == 0) {
            try {
                throw new RuntimeException("нет четверок!");
            } catch (RuntimeException e) {
                e.printStackTrace();
            }
        } else {
            int[] arr = new int[size];
            System.arraycopy(array, w + 1, arr, 0, size);
            System.out.println(Arrays.toString(arr));
            return arr;
        }return null;
    }

    public boolean checkForOneAndFour(int[] array) {
        boolean checkFour = false;
        boolean checkOne = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                checkOne = true;
            }
            if (array[i] == 4) {
                checkFour = true;
            }
        }
        return checkFour && checkOne;
    }

    public static void main(String[] args) {
        Array arrays = new Array();
        int[] arr = {2, 2, 0, 3, 3, 4, 3, 2, 1, 1, 1};
        System.out.println(arrays.checkForOneAndFour(arr));
        arrays.checkFourInArray(arr);
    }
}