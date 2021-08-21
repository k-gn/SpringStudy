package com.example.querydsltest.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Hello {

    @Id
    @GeneratedValue
    private Long id;
}
