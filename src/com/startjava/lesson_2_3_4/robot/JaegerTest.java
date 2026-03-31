package com.startjava.lesson_2_3_4.robot;

public class JaegerTest {
    public static void main(String[] args) {
        com.startjava.lesson_2_3_4.robot.Jaeger strikerEureka = new com.startjava.lesson_2_3_4.robot.Jaeger();
        strikerEureka.setModelName("Striker Eureka");
        strikerEureka.setStatus("Destroyed");
        strikerEureka.setHeight(2.1f);
        System.out.println("modelName = " + strikerEureka.getModelName());
        System.out.println("status = " + strikerEureka.getStatus());
        System.out.println("height = " + strikerEureka.getHeight());
        strikerEureka.drift();
        strikerEureka.move();
        System.out.println();

        com.startjava.lesson_2_3_4.robot.Jaeger gipsyDanger = new com.startjava.lesson_2_3_4.robot.Jaeger("Gipsy Danger", "Active", 2.3f);
        System.out.println("modelName = " + gipsyDanger.getModelName());
        System.out.println("status = " + gipsyDanger.getStatus());
        System.out.println("height = " + gipsyDanger.getHeight());
        gipsyDanger.drift();
        gipsyDanger.move();
    }
}