package com.example.udemy.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Vote {
    @Id
    @GeneratedValue
    private Long id;
    private int vote;

    //user
    //link

}
