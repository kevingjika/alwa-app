package com.alw.app.entities;

import lombok.*;
import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long id;
    private String username;
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private String address;

}