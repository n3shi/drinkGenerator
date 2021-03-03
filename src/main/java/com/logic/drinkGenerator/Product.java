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
@Table(name = "Products")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long productId;
		
	private String name;

	private String desription;
	
	@OneToMany(mappedBy = "product")
	private List<RecipesProducts> recipeAssoc; //association with recipe
	
	public Product(Long productId, String name, String desription, List<RecipesProducts> recipeAssoc) {
		super();
		this.productId = productId;
		this.name = name;
		this.desription = desription;
		this.recipeAssoc = recipeAssoc;
	}

}
