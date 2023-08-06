package com.lucifer.lab.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="Employees")
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
}
