package com.santifcb0912.petclinic.service;

import com.santifcb0912.petclinic.dto.PetAndOwnerDTO;
import com.santifcb0912.petclinic.model.Pet;
import com.santifcb0912.petclinic.model.PetOwner;
import com.santifcb0912.petclinic.repository.IPetOwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetOwnerService implements IPetOwnerService {
    private IPetOwnerRepository petOwRepo;
    //dependecy inyection via setter
    @Autowired
    public void setPetOwRepo(IPetOwnerRepository petOwRepo) {
        this.petOwRepo = petOwRepo;
    }

    @Override
    public void saveOwner(PetOwner petOwner) {
        petOwRepo.save(petOwner);
    }

   @Override
    public void deleteOwner(Long idOwner) {
        petOwRepo.deleteById(idOwner);
    }

    @Override
    public List<PetOwner> getList() {
        List<PetOwner>ownerList=petOwRepo.findAll();
        return ownerList;
    }

    @Override
    public void editOwner(PetOwner petOwner) {
        petOwRepo.save(petOwner);
    }

    @Override
    public PetOwner findOwner(PetOwner petOwner) {
        PetOwner petOwner1=petOwRepo.findById(petOwner.getIdOwner()).orElse(null);
        return petOwner1;
    }




}
