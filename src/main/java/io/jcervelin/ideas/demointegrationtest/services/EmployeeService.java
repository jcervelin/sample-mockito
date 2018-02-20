package io.jcervelin.ideas.demointegrationtest.services;

import io.jcervelin.ideas.demointegrationtest.entity.Employee;

import java.util.List;

public interface EmployeeService {
    Employee getEmployeeByName(String name);

    List<Employee> getAllEmployees();

    Employee save(Employee employee);
}
