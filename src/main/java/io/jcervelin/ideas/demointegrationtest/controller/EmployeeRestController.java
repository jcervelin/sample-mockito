package io.jcervelin.ideas.demointegrationtest.controller;

import io.jcervelin.ideas.demointegrationtest.entity.Employee;
import io.jcervelin.ideas.demointegrationtest.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeService employeeService;

    public EmployeeRestController() {
    }

    @Autowired
    public EmployeeRestController(EmployeeService employeeService) {
       this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @PostMapping("/employees")
    public Employee save(@RequestBody Employee employee) {
        Employee saved = employeeService.save(employee);
        return saved;
    }

    @GetMapping("/hello")
    public String hello(){
        return "Hello World!";
    }

}