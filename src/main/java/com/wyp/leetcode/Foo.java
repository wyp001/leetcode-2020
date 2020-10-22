package com.wyp.leetcode;

/**
 * 三个线程实现顺序打印   abc
 */
public class Foo {

    public void first() {
        System.out.println("a");
    }

    public void second() {
        System.out.println("b");
    }

    public void third() {
        System.out.println("c");
    }

    public static void main(String[] args) throws InterruptedException {
        //验证
        for (int i = 0; i < 10; i++) {
            print();
        }
    }

    private static void print() throws InterruptedException {
        Foo foo = new Foo();
        Thread t1 = new Thread(() -> {
            foo.first();
        }, "t1");
        Thread t2 = new Thread(() -> {
            try {
                t1.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            foo.second();
        }, "t2");
        Thread t3 = new Thread(()->{
            try {
                t2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            foo.third();
        },"t3");
        t1.start();
        t2.start();
        t3.start();
        t3.join();
        System.out.println("------------------------");
    }


}