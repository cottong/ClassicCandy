package posMain;

import java.util.ArrayList;

public class ProductClass {
	
	private String name;
	private String category;
	private String description;
	private double price;
	
	public ProductClass(String name, String category, String description, double price) {
		
		setName(name);
		setCategory(category);
		setDescription(description);
		setPrice(price);
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}


	}

	
	
	

