package com.santifcb0912.petclinic.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
public class PetAndOwnerDTO {

    private String namePet;
    private String specie;
    private String breed;
    private String nameOwner;
    private String lastName;
}
