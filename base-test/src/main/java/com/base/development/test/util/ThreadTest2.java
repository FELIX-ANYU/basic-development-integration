package com.base.development.test.util;

public class ThreadTest2 extends Thread{

    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            System.out.println("线程2");
        }
    }
}
