package Lesson3;

import java.io.*;
import java.util.Scanner;

public class TextReader {
    File book;
    int length;
    int charAtPage;
    int pages;
    int yourPage;

    public TextReader(int charAtPage) {
        this.charAtPage = charAtPage;
    }

    public int checkLength() throws IOException {
        FileInputStream inputStream = new FileInputStream(book);
        int x;
        while ((x = inputStream.read()) != -1) {
            length++;
        }
        return length;
    }

    public int checkPages() throws IOException {
        FileInputStream inputStream = new FileInputStream(book);
        int x;
        while ((x = inputStream.read()) != -1) {
        }
        return pages = length / charAtPage;
    }

    public void chosePage() {
        System.out.println("Книга " + book + " на " + pages + " страницах");
        System.out.println("Выберите страницу");
        Scanner scanner = new Scanner(System.in);
        yourPage = scanner.nextInt();
    }

    public void showPage() throws IOException {
        FileInputStream inputStream = new FileInputStream(book);
        int x;
        byte[] chars = new byte[length];
        while ((x = inputStream.read(chars)) > 0) {
            for (int i = (charAtPage * (yourPage - 1)); i < (yourPage * charAtPage); i++) {
                System.out.print((char) chars[i]);

            }
        }
    }
}

class Main {
    public static void main(String[] args) throws IOException {
        TextReader tr = new TextReader(3000);
        tr.book = new File("Lesson3/1.txt");
        tr.checkLength();
        System.out.println(tr.length);
        tr.checkPages();
        tr.chosePage();
        tr.showPage();
    }
}
