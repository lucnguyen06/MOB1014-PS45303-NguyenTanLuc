package com.fpoly.lab6;

import java.util.Locale;

/**
 *
 * @author Moderator
 */

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        super();
        this.height = 1.0;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = 1.0;
        setHeight(height);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        } else {
            System.out.println("Chieu cao khong hop le");
        }
    }

    @Override
    public double getArea() {
        return 2 * Math.PI * radius * height + 2 * Math.PI * radius * radius;
    }

    public double getVolume() {
        return super.getArea() * height;
    }

    @Override
    public String toString() {
        return String.format(Locale.US, "Hinh tru [ban kinh=%.2f, mau=%s, chieu cao=%.2f, dien tich toan phan=%.2f, the tich=%.2f]",
                radius, color, height, getArea(), getVolume());
    }
}
