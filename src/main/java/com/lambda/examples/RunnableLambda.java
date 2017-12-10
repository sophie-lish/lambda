package com.lambda.examples;

/**
 * lambda expression of runnable
 *
 * @author sophie-lish
 */
public class RunnableLambda {

    public static void main(String[] args) {

        System.out.println("=== RunnableTest ===");

        //inner class of Runnable interface
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("hello runnable!");
            }
        };

        //lambda expression of Runnable interface
        Runnable runnable1 = () -> System.out.println("hello runnable of lambda!");

        runnable.run();
        System.err.println("........................");
        runnable1.run();
    }
}
