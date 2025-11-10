package com.santifcb0912.petclinic.service;

import com.santifcb0912.petclinic.dto.PetAndOwnerDTO;
import com.santifcb0912.petclinic.model.Pet;
import com.santifcb0912.petclinic.repository.IPetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PetService implements IPetService {
    @Autowired
    private IPetRepository petRepo;
    //alta
    @Override
    public void savePet(Pet pet) {
        petRepo.save(pet);
    }
    //baja
    @Override
    public void deletePet(Long idPet) {
        petRepo.deleteById(idPet);
    }
    //lectura
    @Override
    public List<Pet> getPetList() {
        List<Pet>petList=petRepo.findAll();
        return petList;
    }
    //editar
    @Override
    public void editPet(Pet pet) {
        this.savePet(pet);

    }
    //encontrar idPet a editar
    @Override
    public Pet findPet(Long idPet) {
       Pet pet= petRepo.findById(idPet).orElse(null);
    return pet;
    }
    //Find a specifc list
    @Override
    public List<Pet> specificList() {
        //call to petList
        List<Pet>petList=this.getPetList();
        //create SpecifList
        List<Pet>specificList=new ArrayList<>();
        //Traverse the petList
        for (Pet pet:petList){
            //comparo
            if(pet.getSpecie().equalsIgnoreCase("dog")
                    && pet.getBreed().equalsIgnoreCase("caniche")){
                    //add pet to list
                    specificList.add(pet);
            }
        }
       // return List
        return specificList;
    }
    @Override
    public List<PetAndOwnerDTO> getListDTO() {
        //asigno a una lista todos los objetos pet
        List<Pet> petList = petRepo.findAll();
        //creo una lista de tipo array dto
        List<PetAndOwnerDTO> listDTO = new ArrayList<>();


        //recorro la lista de los objetos
        for (Pet pet : petList) {
            //creo una instancia dto
            PetAndOwnerDTO pdto = new PetAndOwnerDTO();
            //seteo cada uno de los atributos a mi instancia dto
            pdto.setNameOwner(pet.getOnePetOwner().getNameOwner());
            pdto.setLastName(pet.getOnePetOwner().getLastName());
            pdto.setNamePet(pet.getNamePet());
            pdto.setBreed(pet.getBreed());
            pdto.setSpecie(pet.getSpecie());
            //asigno a la lista dto el objeto dto
            listDTO.add(pdto);
        }
        //retorno la lista
    return listDTO;
    }
}
