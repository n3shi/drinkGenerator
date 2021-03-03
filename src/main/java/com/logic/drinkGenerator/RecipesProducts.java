package com.logic.drinkGenerator;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name = "RecipesProducts")
public class RecipesProducts {

	@EmbeddedId
    private RecipesProductsPK id;
	
	@ManyToOne
	@MapsId("product_id")
	@JoinColumn(name = "PRODUCT_ID")
	private Product product;
	
	@ManyToOne
	@MapsId("recipe_id")
	@JoinColumn(name = "RECIPE_ID")
	private Recipe recipe;
	
	@Column(name = "product_quantity")
	private int productQuantity;
	
	@Column(name = "unit_measure")
	private String unitMeasure;
}
