package com.santifcb0912.petclinic.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor @NoArgsConstructor
@Setter @Getter
@Entity
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPet;
    private String namePet;
    private String specie;
    private String breed;
    private String color;
    @OneToOne
    @JoinColumn(name="FK_idOwner", referencedColumnName = "idOwner")
    private PetOwner onePetOwner;
}
