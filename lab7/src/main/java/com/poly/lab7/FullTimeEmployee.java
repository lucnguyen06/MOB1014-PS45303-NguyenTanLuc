package com.poly.lab7;

/**
 *
 * @author Moderator
 */
public class FullTimeEmployee extends Employee {
    private double basicSalary;

    public FullTimeEmployee(String id, String name, double basicSalary) {
        super(id, name);
        this.basicSalary = basicSalary;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    @Override
    public double getSalary() {
        return basicSalary;
    }

    @Override
    public String toString() {
        return String.format("[Chinh thuc] ID: %s | Ho ten: %s | Luong co ban: %.0f", id, name, basicSalary);
    }
}
