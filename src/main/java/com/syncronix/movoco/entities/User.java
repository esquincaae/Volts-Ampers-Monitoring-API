package com.syncronix.movoco.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "users")
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @Column(length = 50)
    private String name;

    @Column(length = 50)
    private String lastname;

    @Column()
    private String email;

    @Column()
    private String password;

    @Column(length = 5)
    private String code;


    @JsonManagedReference
    @OneToMany(mappedBy = "user")
    //@JoinColumn(name = "voltages_Id")
    private List <VoltSensor> voltages;

    @JsonManagedReference
    @OneToMany(mappedBy = "user")
    //@JoinColumn(name = "amp_Id")
    private List <ElectricCurrentSensor> amp;

}