package com.lab.javalab.threadTest;

public class ThreadA extends Thread{
    public ThreadA() {
        setName("ThreadA");
    }

    public void run() {
        for(int i =0; i<2; i++) {
            System.out.println(getName() + "출력 내용");
        }
    }
}

https://github.com/akrwkdrrr99/Thread-study1.git