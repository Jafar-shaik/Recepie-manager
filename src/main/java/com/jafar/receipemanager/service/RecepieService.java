package com.jafar.receipemanager.service;


import com.jafar.receipemanager.entity.Recepie;
import com.jafar.receipemanager.repository.RecepieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecepieService {

    @Autowired
    private RecepieRepository recepieRepository;

    public Recepie createRecepie(Recepie recepie){
        return recepieRepository.save(recepie);
    }

    public List<Recepie> getAllRecepie(){
        return recepieRepository.findAll();
    }

    public void deleteRecepie(String id){
        recepieRepository.deleteById(id);
    }

    public List<Recepie> searchByIngredients(String ingredients){
        return recepieRepository.findByIngredientsContaining(ingredients);
    }

    public List<Recepie> searchByCategory(String category){
        return recepieRepository.findByCategoryContaining(category);
    }
}
