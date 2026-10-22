package com.fpoly.lab6;

import java.util.Locale;

/**
 *
 * @author Moderator
 */

public class Circle {
    protected double radius;
    protected String color;

    public Circle() {
        this.radius = 1.0;
        this.color = "Trang";
    }

    public Circle(double radius, String color) {
        this.radius = 1.0;
        this.color = color;
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            System.out.println("Ban kinh khong hop le");
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return String.format(Locale.US, "Hinh tron [ban kinh=%.2f, mau=%s, chu vi=%.2f, dien tich=%.2f]",
                radius, color, getPerimeter(), getArea());
    }
}
