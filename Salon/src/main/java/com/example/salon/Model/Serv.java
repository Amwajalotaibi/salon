package com.example.salon.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Serv {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

   @Column(columnDefinition = "varchar(20) not null")
    private String name;

    @Column(columnDefinition = "varchar(20) not null check (category='makeup' or category='hair style' or category='body care' or category='spa')")
    private String category;



    @ManyToMany
    @JsonIgnore
    private Set<Staff> staff; // ghadeer with staff

    @ManyToMany(mappedBy = "servs")
    private Set<Appointment> appointments; // Amwaj with opp
}
