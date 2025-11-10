package com.santifcb0912.petclinic.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Entity
public class PetOwner {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idOwner;
    private String nameOwner;
    private String lastName;
    private String cellphone;

}
