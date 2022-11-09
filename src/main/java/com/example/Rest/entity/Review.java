package com.example.Rest.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Data
public class Review {

    @Id
    private long id;

    private String comment;

    @ManyToOne
    private User user;
}
