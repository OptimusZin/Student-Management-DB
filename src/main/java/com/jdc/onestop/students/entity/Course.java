package com.jdc.onestop.students.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter@Setter
public class Course {


    @Id
    private String code;
    private String name;
    private int hours;
    private String level;
    private int onlineFees;
    private int offlineFees;



}
