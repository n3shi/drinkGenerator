package com.logic.drinkGenerator;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "Recipes")
public class Recipe {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long productId;
		
	private String description;
	
	private String author;
	
	private String taste;
	
	@OneToMany(mappedBy = "recipe")
	private List<RecipesProducts> recipeProduct;

	public Recipe(Long productId, String description, String author, String taste,
			List<RecipesProducts> recipeProduct) {
		super();
		this.productId = productId;
		this.description = description;
		this.author = author;
		this.taste = taste;
		this.recipeProduct = recipeProduct;
	}
}
