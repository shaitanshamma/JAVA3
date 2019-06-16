package Lesson3;

import java.io.*;
import java.io.FileReader;
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

        FileReader fileReader = new FileReader(book);
        BufferedReader buff = new BufferedReader(fileReader);
        int x;
        while ((x = buff.read()) != -1) {
            length++;
        }
        fileReader.close();
        buff.close();
        return length;
    }

    public int checkPages() throws IOException {

        FileReader fileReader = new FileReader(book);
        BufferedReader buff = new BufferedReader(fileReader);
        int x;
        while ((x = buff.read()) != -1) {
        }
        fileReader.close();
        buff.close();
        return pages = 1 + length / charAtPage;

    }

    public void chosePage() {
        System.out.println("Книга " + book + " на " + pages + " страницах");
        System.out.println("Выберите страницу");
        Scanner scanner = new Scanner(System.in);
        yourPage = scanner.nextInt();
    }

    public void showPage() throws IOException {
        InputStreamReader in = new InputStreamReader(new FileInputStream(book), "UTF-8");
        int x;
        char[] chars = new char[length];
        int charAtLastPage = length - charAtPage * (pages - 1);
        while ((x = in.read(chars)) != -1) {
            if (yourPage < pages) {
                for (int i = (charAtPage * (yourPage - 1)); i < ((yourPage) * charAtPage); i++) {
                    System.out.print(chars[i]);
                }
            } else {
                for (int i = (length - charAtLastPage); i < (length); i++) {
                    System.out.print(chars[i]);
                }
            }

//            for (int i = 0; i <length ; i++) {
//                System.out.print(chars[i]);
//            }
        }
        System.out.print("\n" + "Показать еще страницу ?   ДА  /  НЕТ");
        String answer;
        Scanner scanner = new Scanner(System.in);
        answer = scanner.nextLine();
        if (answer.toUpperCase().equals("ДА")) {
            chosePage();
            showPage();
        }
        in.close();
    }
}

class Main {
    public static void main(String[] args) throws IOException {
        TextReader tr = new TextReader(1800);
        tr.book = new File("Lesson3/6.txt");
        tr.checkLength();
        System.out.println(tr.length);
        tr.checkPages();
        tr.chosePage();
        tr.showPage();
    }
}
