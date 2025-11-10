package com.santifcb0912.petclinic.repository;

import com.santifcb0912.petclinic.model.PetOwner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPetOwnerRepository extends JpaRepository<PetOwner,Long> {
    //quiero una interfaz que extienda todos los metodos jpa repository
    // y se los asigne a la entidad PetOwner cuyo clave primaria es de tipo long
}
