package com.jdc.onestop.students.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
@Getter@Setter
public class Payment {

    @Id
    private Integer paidDate;
    private int toPaid;
    private int paidAmount;

    @ManyToOne
    private Registration registration;



}
