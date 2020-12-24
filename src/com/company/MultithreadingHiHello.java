package com.company;

class HI extends Thread {

    public void run(){
        for(int i =0; i<=5; i++) {
            System.out.println("HI");
            try { Thread.sleep(1000); } catch (InterruptedException e) { }
        }


        }
        }

        class Hello extends Thread {
            public void run() {
                for(int i =0; i<=5; i++) {
                    System.out.println("HELLO");
                    try { Thread.sleep(1000); } catch (InterruptedException e) { }
                }
            }
        }
public class MultithreadingHiHello {

    public static void main(String[] args) throws InterruptedException {

        HI obj1 = new HI();
        Hello obj2 = new Hello();

        obj1.start();
        Thread.sleep(1000);
        obj2.start();

    }
}
