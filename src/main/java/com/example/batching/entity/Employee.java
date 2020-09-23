package com.example.batching.entity;



import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
@Entity
public class Employee {
    @Id
    @Column (name = "id", nullable = false)
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @NotNull
    @Column (name = "name", precision = 10, scale = 4, nullable = false)
    private String name;

    public Employee(String name) {
        this.name=name;
    }

    public Employee() {

    }
}
