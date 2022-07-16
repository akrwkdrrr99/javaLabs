package com.lab.javalab.threadTest;

public class BeepPrintExample2 {
    public static void main(String[] args) {
        Runnable beepTask = new BeepTask();

        /*
        *
        * 대체 구문 가능
        *
        * */
        Thread thread = new Thread(beepTask);
        thread.start();

        for(int i =0; i<5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(500);
            } catch(Exception e) {

            }
        }


        /* 대체 구문 시작
        * Thread thread = new Thread(() -> {
        *   Toolkit toolkit = Toolkit.getDefaultToolkit();
        *   for(int i=0; i< 5; i++) {
        *       toolkit.beep();
        *       try { Thread.sleep(500); } catch(Exception e) {}
        *   }
        * }
        *
        */
    }
}
