package Lesson3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class FileReader {
    public static void main(String[] args) throws IOException {
        File file = new File("Lesson3/1.txt");
        FileInputStream in = new FileInputStream(file);
        byte[] arr = new byte[20];
        int count;
        while ((count = in.read(arr)) > 0) {
            for (int i = 0; i < count; i++) {
                System.out.print((char) arr[i]);
            }
        }
    }
}
