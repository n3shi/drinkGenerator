package com.logic.drinkGenerator;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class RecipesProducts {
	
	@Column(name = "recipe_id")
	private Long recipeId;
	
	@Column(name = "product_id")
	private Long productId;
	
	@Column(name = "product_quantity")
	private int productQuantity;
	
	@Column(name = "unit_measure")
	private String unitMeasure;
}
