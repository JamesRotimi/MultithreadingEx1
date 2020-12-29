package com.company;

public class Anonymous {

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> {
            for ( int i = 0; i<=5; i++) {
                System.out.println("HI");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(() -> {
            for ( int i = 0; i<=5; i++) {
                System.out.println("HELLO");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        Thread.sleep(10);
        t2.start();
    }
}
