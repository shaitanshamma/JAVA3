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
        if (w == 0 && array[0]!=4) {
            try {
                throw new RuntimeException("нет четверок!");
            } catch (RuntimeException e) {
                e.printStackTrace();
                return null;
            }
        } else {
            int[] arr = new int[size];
            System.arraycopy(array, w + 1, arr, 0, size);
            System.out.println(Arrays.toString(arr));
            return arr;
        }
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
        int[] arr = {1, 1, 0, 3, 3, 0, 3, 2, 1, 1, 1};
        System.out.println(arrays.checkForOneAndFour(arr));
        arrays.checkFourInArray(arr);
    }
}