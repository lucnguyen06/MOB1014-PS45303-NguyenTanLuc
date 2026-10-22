package com.fpoly.lab6;

/**
 *
 * @author Moderator
 */

public class HinhTronDemo {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(2.5, "Do");

        System.out.println(c1);
        System.out.println(c2);

        c2.setRadius(-3);
        System.out.println(c2);
    }
}
