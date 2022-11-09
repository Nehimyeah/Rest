package com.example.Rest.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@Table(name = "users")
public class User {

    @Id
    private long id;

    private String firstName;
    private String lastName;

    @OneToMany
    private Set<Review> reviews;
}
