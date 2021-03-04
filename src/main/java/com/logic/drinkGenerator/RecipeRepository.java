package com.logic.drinkGenerator;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe,Long> {

	//sprawdzenie dostepnosci przepisu
	
	Recipe findOneByName(String name);
	
	List<Recipe> findByProducts(List<Product> p);
}
