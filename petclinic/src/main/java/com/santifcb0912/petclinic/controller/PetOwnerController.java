package com.santifcb0912.petclinic.controller;

import com.santifcb0912.petclinic.dto.PetAndOwnerDTO;
import com.santifcb0912.petclinic.model.Pet;
import com.santifcb0912.petclinic.model.PetOwner;
import com.santifcb0912.petclinic.service.IPetOwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PetOwnerController {

    private IPetOwnerService petOwSe;
    //dependecy inyection via setters
    @Autowired
    public void setPetOwSe(IPetOwnerService petOwSe) {
        this.petOwSe = petOwSe;
    }

    @PostMapping("/owner/create")
    public void createOwner(@RequestBody PetOwner petOwner){
        petOwSe.saveOwner(petOwner);
    }
    @DeleteMapping("/owner/delete/{idOwner}")
    public void deleteOwner(@PathVariable Long idOwner){
        petOwSe.deleteOwner(idOwner);
    }
    @GetMapping ("owner/getList")
    public List<PetOwner> ownerList(){
        return petOwSe.getList();
    }
    @PutMapping("/owner/edit")
    public PetOwner editOwner(@RequestBody PetOwner petOwner){
        petOwSe.editOwner(petOwner);
        return petOwSe.findOwner(petOwner);
    }

}
