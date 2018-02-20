package io.jcervelin.ideas.demointegrationtest.entity;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "person")
public class Employee {

    public Employee() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Size(min = 3, max = 20)
    private String name;

    public Employee(String alex) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return null;
    }

    public void setName(String name) {
        this.name = name;
    }
// standard getters and setters, constructors


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}