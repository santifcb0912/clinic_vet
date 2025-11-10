package com.santifcb0912.petclinic.service;

import com.santifcb0912.petclinic.dto.PetAndOwnerDTO;
import com.santifcb0912.petclinic.model.Pet;

import java.util.List;

public interface IPetService {
   //alta
    void savePet(Pet pet);
    //baja
    void deletePet(Long idPet);
    //lectura
    List<Pet> getPetList();

 //edit
    void editPet(Pet pet);
    //trae la mascota editada
    Pet findPet(Long idPet);
//Specific list
    List<Pet> specificList();


    List<PetAndOwnerDTO> getListDTO();
}
