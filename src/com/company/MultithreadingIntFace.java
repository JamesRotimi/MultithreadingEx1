package com.company;


class HEY implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i<=5; i++) {
            System.out.println("HI");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class HELLOHI implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i<=5; i++) {
            System.out.println("HELLO");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class MultithreadingIntFace {

    public static void main(String[] args) throws InterruptedException {

        HELLOHI obj1 = new HELLOHI();
        HEY obj2 = new HEY();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        Thread.sleep(10);
        t2.start();

    }
}
