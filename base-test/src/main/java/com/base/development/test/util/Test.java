package com.base.development.test.util;

public class Test {

    public static void main(String[] args) {
        ThreadTest threadTest = new ThreadTest();
        threadTest.start();
        ThreadTest2 threadTest2 = new ThreadTest2();
        threadTest2.start();
    }
}
