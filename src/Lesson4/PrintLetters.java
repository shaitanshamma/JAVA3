package Lesson4;

public class PrintLetters {

    private final Object monitor = new Object();
    private volatile char letter = 'A';

    public void printA() throws InterruptedException {
        synchronized (monitor){
            for (int i = 0; i <5 ; i++) {
                while (letter!='A') {
                    monitor.wait();
                }
                    System.out.println("A");
                    letter= 'B';
                    monitor.notifyAll();
                }
            }
        }

    public void printB() throws InterruptedException {
        synchronized (monitor){
            for (int i = 0; i <5 ; i++) {
                while (letter!='B') {
                    monitor.wait();
                }
                    System.out.println("B");
                    letter= 'C';
                    monitor.notifyAll();
                }
            }
        }

    public void printC() throws InterruptedException {
        synchronized (monitor){
            for (int i = 0; i <5 ; i++) {
                while (letter != 'C') {
                    monitor.wait();
                }
                System.out.println("C");
                letter= 'A';
                monitor.notifyAll();
            }
        }
    }
    public static void main(String[] args) {
        PrintLetters printLetters = new PrintLetters();
       Thread t1 =  new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    printLetters.printA();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
       Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    printLetters.printB();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    printLetters.printC();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.setPriority(1);
        t2.setPriority(8);
        t3.setPriority(10);
        t3.start();
        t2.start();
        t1.start();

    }
}
