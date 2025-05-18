package com.jafar.receipemanager.repository;

import com.jafar.receipemanager.entity.Recepie;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface RecepieRepository extends MongoRepository<Recepie, String> {
    List<Recepie> findByIngredientsContaining(String ingredient);
    List<Recepie> findByCategoryContaining(String category);
}

