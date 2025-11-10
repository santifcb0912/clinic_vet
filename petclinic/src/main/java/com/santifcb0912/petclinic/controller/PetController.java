package com.santifcb0912.petclinic.controller;

import com.santifcb0912.petclinic.dto.PetAndOwnerDTO;
import com.santifcb0912.petclinic.model.Pet;
import com.santifcb0912.petclinic.service.IPetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PetController {
    @Autowired
    private IPetService petServ;
    //Alta
    @PostMapping("/pet/save")
    public void createPet(@RequestBody Pet pet){
        petServ.savePet(pet);
    }
    //baja
    @DeleteMapping("/pet/delete/{idPet}")
    public void deletePet(@PathVariable Long idPet){
        petServ.deletePet(idPet);
    }
    //lectura
    @GetMapping ("/pet/petList")
    public List<Pet> getPetList(){
        return petServ.getPetList();
    }
    //Modificacion
    @PutMapping("/pet/edit")
    public Pet editPet(@RequestBody Pet pet){
        //guardelo
        petServ.editPet(pet);
        //devuelvalo ya editado
        return petServ.findPet(pet.getIdPet());
    }
    //Obtener el listado de todas las mascotas de especie “perro” y
    // raza “caniche”
    @GetMapping("/pet/petSpecificList")
    public List<Pet>SpecificPetList(){
        return petServ.specificList();
    }
    //get specific item list of owner and pets together
    @GetMapping("/pet/DTOlist")
    public List <PetAndOwnerDTO> specificItems(){
        return petServ.getListDTO();
    }
}
