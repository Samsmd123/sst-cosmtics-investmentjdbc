package com.cosmetics.model;

import org.springframework.stereotype.Component;

@Component
public class Cosmetics {
	

	private String name;
	private String brand;
	private  String category;
	private double price;
	private int cosmeticsId;
	
	public Cosmetics() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cosmetics(String name, String brand, String category, double price) {
		super();
		this.cosmeticsId = cosmeticsId;
		this.name = name;
		this.brand = brand;
		this.category = category;
		this.price = price;
	}

	public int getCosmeticsId() {
		return cosmeticsId;
	}

	public void setCosmeticsId(int cosmeticsId) {
		this.cosmeticsId = cosmeticsId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Cosmetics [comesticsId=" + cosmeticsId + ", name=" + name + ", brand=" + brand + ", category="
				+ category + ", price=" + price + "]";
	}

	
	
}
