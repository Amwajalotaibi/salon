package com.example.salon.Model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@AllArgsConstructor
@Entity
@Getter
@Setter
@NoArgsConstructor
public class Staff {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty(message = "name can't be empty")
    private String name;

    @NotNull(message = "age can't be empty")
    private Integer age;

    @NotEmpty(message = "gender can't be empty")
    private String gender;

    @NotEmpty(message = "role can't be empty")
    @Column(columnDefinition = "varchar(20) not null check(role ='supervisor' or role='user')")
    private String role;

    @NotEmpty(message = "email can't be empty")
    @Email
    private String email;

    @NotNull(message = "salary can't be empty")
    private double salary;


    @OneToMany(cascade = CascadeType.ALL, mappedBy = "staff")
    private Set<Appointment> appointmentSet;


    @ManyToMany(mappedBy = "staff")
    private Set<Serv> servSet;

}
