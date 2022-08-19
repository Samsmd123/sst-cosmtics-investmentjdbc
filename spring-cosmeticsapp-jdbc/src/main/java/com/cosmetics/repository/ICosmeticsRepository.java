package com.cosmetics.repository;

import java.util.List;


import com.cosmetics.model.Cosmetics;

public interface ICosmeticsRepository {
	void addCosmetics(Cosmetics cosmetics);
	void updateCosmetics(int cosmeticsId,double price);
	void deleteCosmetics(int cosmeticsId);
	
	List<Cosmetics> findAll();
	List<Cosmetics> findByName(String name) ;
	List<Cosmetics> findByBrand(String brand);
	List<Cosmetics> findByCategory(String category);
	List<Cosmetics> findByPrice(double price);
	
	Cosmetics findByCategoryId(int comesticsId) ;
}
