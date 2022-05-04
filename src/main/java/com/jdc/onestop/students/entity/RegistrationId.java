package com.jdc.onestop.students.entity;

import lombok.EqualsAndHashCode;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@EqualsAndHashCode
public class RegistrationId implements Serializable {

        private Integer studentId;
        private Integer classId;



}
