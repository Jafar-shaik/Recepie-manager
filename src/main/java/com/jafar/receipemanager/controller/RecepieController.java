package com.jafar.receipemanager.controller;

import com.jafar.receipemanager.entity.Recepie;
import com.jafar.receipemanager.repository.RecepieRepository;
import com.jafar.receipemanager.service.RecepieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("recepie")
public class RecepieController {

    @Autowired
    private RecepieService recepieService;

    @Autowired
    private RecepieRepository recepieRepository;

    @PostMapping("create")
    public Recepie createRecepie(@RequestBody Recepie recepie) {
        Recepie saved = recepieService.createRecepie(recepie);
        return saved;
    }


    @GetMapping
    public List<Recepie> getAllRecepies(){
        return recepieService.getAllRecepie();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteRecepie(@PathVariable String id){
        recepieService.deleteRecepie(id);
    }

    @GetMapping("/ingredients/{ingredients}")
    public List<Recepie> searchByIngredient(@PathVariable String ingredients){
        List<Recepie> recepies= recepieService.searchByIngredients(ingredients);
        return recepies;
    }

    @GetMapping("/category/{category}")
    public ResponseEntity<List<Recepie>> searchByCategory(@PathVariable String category){
        List<Recepie> recepies=recepieService.searchByCategory(category);
        return ResponseEntity.ok(recepies);
    }

    @DeleteMapping("deleteAll")
    public void deleteAll(){
        recepieRepository.deleteAll();
    }

}
