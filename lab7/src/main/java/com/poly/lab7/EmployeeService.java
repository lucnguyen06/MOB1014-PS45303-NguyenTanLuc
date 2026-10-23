package com.poly.lab7;

import java.util.List;

/**
 *
 * @author Moderator
 */
public interface EmployeeService {
    boolean add(Employee e);
    Employee findById(String id);
    List<Employee> getAll();
    double getTotalSalary();
}
