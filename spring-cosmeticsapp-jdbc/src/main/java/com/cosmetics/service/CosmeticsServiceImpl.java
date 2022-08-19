package com.cosmetics.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.cosmetics.model.Cosmetics;
import com.cosmetics.repository.*;
@Service
public class CosmeticsServiceImpl implements ICosmeticsService {
	ICosmeticsRepository cosmeticsRepository ;
	
	
	@Autowired
	public void setCosmeticsRepository(ICosmeticsRepository cosmeticsRepository) {
		this.cosmeticsRepository = cosmeticsRepository;
	}
	@Override
	public void addCosmetics(Cosmetics cosmetics) {
		cosmeticsRepository.addCosmetics(cosmetics);
		
	}
	@Override
	public void updateCosmetics(int cosmeticsId, double price) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<Cosmetics> getAll() {
		List<Cosmetics> cosmeticses = cosmeticsRepository.findAll();
		 
		return cosmeticses.stream().collect(Collectors.toList());
	}

	@Override
	public List<Cosmetics> getByName(String name) {
		List<Cosmetics>  cosmeticsList=cosmeticsRepository.findByName(name);
		List<Cosmetics> cosmetics=cosmeticsList
				.stream()
				
				.sorted((Cosmetics c1,Cosmetics c2)->c1.getName().compareTo(c2.getName()))
				.collect(Collectors.toList());
		
		
		return cosmeticsList;
	}

	@Override
	public List<Cosmetics> getByBrand(String brand) {
		List<Cosmetics>  cosmeticsList=cosmeticsRepository.findByBrand(brand);
		List<Cosmetics> cosmetics=cosmeticsList
				.stream()
				
				.sorted((Cosmetics c1,Cosmetics c2)->c1.getName().compareTo(c2.getBrand()))
				.collect(Collectors.toList());
		
		
		return cosmeticsList;	
		
	}

	@Override
	public List<Cosmetics> getByCategory(String category) {
		List<Cosmetics>  cosmeticsList=cosmeticsRepository.findByCategory(category);
		List<Cosmetics> cosmetics=cosmeticsList
				.stream()
				
				.sorted((Cosmetics c1,Cosmetics c2)->c1.getName().compareTo(c2.getCategory()))
				.collect(Collectors.toList());
		
		
		return cosmeticsList;	
		
	}

	@Override
	public List<Cosmetics> getByPrice(double price) {
		List<Cosmetics>  cosmeticsList=cosmeticsRepository.findByPrice(price);
		List<Cosmetics> cosmetics=cosmeticsList
				.stream()
				
				.sorted((Cosmetics c1,Cosmetics c2)->c1.getName().compareTo(c2.getName()))
				.collect(Collectors.toList());
		
		return cosmeticsList;
	}

	@Override
	public Cosmetics getByCategoryId(int categoryId) {
		// TODO Auto-generated method stub
		return null;
	}

	

	
}