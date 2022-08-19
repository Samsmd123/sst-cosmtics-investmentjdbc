package com.cosmeticsapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cosmetics.model.Cosmetics;
import com.cosmetics.service.ICosmeticsService;

@SpringBootApplication
public class SpringCosmeticsappJdbcApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringCosmeticsappJdbcApplication.class, args);
	}
ICosmeticsService cosmeticsService;
	
@Autowired

public void setCosmeticsService(ICosmeticsService cosmeticsService) {
	this.cosmeticsService = cosmeticsService;
}

	@Override
	public void run(String... args) throws Exception {
		Cosmetics cosmetics=new Cosmetics("FrizzFree","Treseme","hair",350.10);
		cosmeticsService.addCosmetics(cosmetics);
	}




}
