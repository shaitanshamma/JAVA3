package Lesson3;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;

public class FileSum {
    public static void main(String[] args) throws IOException {
        File file1 = new File("Lesson3/1.txt");
        File file2 = new File("Lesson3/2.txt");
        File file3 = new File("Lesson3/3.txt");
        File file4 = new File("Lesson3/4.txt");
        File file5 = new File("Lesson3/5.txt");
        FileInputStream in1 = new FileInputStream(file1);
        FileInputStream in2 = new FileInputStream(file2);
        FileInputStream in3 = new FileInputStream(file3);
        FileInputStream in4 = new FileInputStream(file4);
        FileInputStream in5 = new FileInputStream(file5);
        ArrayList<InputStream> arrayList =new ArrayList<>();
        arrayList.add(in1);
        arrayList.add(in2);
        arrayList.add(in3);
        arrayList.add(in4);
        arrayList.add(in5);
        Enumeration<InputStream> en = Collections.enumeration(arrayList);
        SequenceInputStream seq = new SequenceInputStream(en);
        int count;
        while ((count = seq.read()) != -1) {
            System.out.print((char) count);
            }
        seq.close();
        }

    }

