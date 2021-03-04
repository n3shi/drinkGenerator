package com.logic.drinkGenerator;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

class GetRecipes{
	public String offset;
	public String count;
}

class GetSpecificRecipe{
	public String name;
}

class GetSpecificRecipes{
	public List<String> products;
}



@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class LogicController {
	
	@Autowired
	RecipeRepository rRepo;
	
	
	@PostMapping(value = "/getRecipe", headers="Content-Type=application/json")
	@ResponseBody
	public String getRecipes(@RequestBody GetRecipes g) {
		List<Recipe> recipes = rRepo.findAll(); 

//TODO return sendMessage("recipes", String.valueOf(recipes));
		
		return "{}";
	}
}
