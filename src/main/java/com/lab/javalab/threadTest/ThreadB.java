package com.lab.javalab.threadTest;

public class ThreadB extends Thread {
    public ThreadB() {
        setName("ThreadB");
    }

    public void run() {
        for(int i =0; i<2; i++) {
            System.out.println(getName() + "출력 내용");
        }
    }
}

