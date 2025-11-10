package com.santifcb0912.petclinic.service;

import com.santifcb0912.petclinic.dto.PetAndOwnerDTO;
import com.santifcb0912.petclinic.model.Pet;
import com.santifcb0912.petclinic.model.PetOwner;

import java.util.List;

public interface IPetOwnerService {
    //alta
    void saveOwner(PetOwner petOwner);
   //baja
    void deleteOwner(Long idOwner);
    //Lectura
    List<PetOwner> getList();
   //edicion
    void editOwner(PetOwner petOwner);
    //encontrar el dueño a editado
    PetOwner findOwner(PetOwner petOwner);


}
