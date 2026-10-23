package com.poly.lab7;

/**
 *
 * @author Moderator
 */
public class PartTimeEmployee extends Employee {
    private int workHours;
    private double salaryPerHour;

    public PartTimeEmployee(String id, String name, int workHours, double salaryPerHour) {
        super(id, name);
        this.workHours = workHours;
        this.salaryPerHour = salaryPerHour;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public double getSalaryPerHour() {
        return salaryPerHour;
    }

    public void setSalaryPerHour(double salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }

    @Override
    public double getSalary() {
        return workHours * salaryPerHour;
    }

    @Override
    public String toString() {
        return String.format("[Ban thoi gian] ID: %s | Ho ten: %s | So gio: %d | Luong/gio: %.0f", id, name, workHours, salaryPerHour);
    }
}
