package com.cosmetics.service;

import java.util.List;


import com.cosmetics.model.Cosmetics;


public interface ICosmeticsService {
	void addCosmetics(Cosmetics cosmetics);
	void updateCosmetics(int cosmeticsId,double price);
	List<Cosmetics> getAll();
	List<Cosmetics> getByName(String name) ;
	List<Cosmetics> getByBrand(String brand);
	List<Cosmetics> getByCategory(String category );
	List<Cosmetics> getByPrice(double price);
	
	Cosmetics getByCategoryId(int comesticsId ) ;



}
