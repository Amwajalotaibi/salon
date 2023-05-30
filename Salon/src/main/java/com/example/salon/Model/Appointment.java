package com.example.salon.Model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
public class Appointment {

    @Id
    private Integer id;


    @ManyToOne
    @JoinColumn(name = "staff_id" , referencedColumnName = "id")
    @JsonIgnore
    private Staff staff;

    @ManyToMany
    @JsonIgnore
    private Set<Serv> servs;
}
