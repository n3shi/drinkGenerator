package com.logic.drinkGenerator;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;

@Embeddable
public class RecipesProductsPK implements Serializable{
	
	@Column(name = "recipe_id")
	private Long recipeId;
	
	@Column(name = "product_id")
	private Long productId;
}
