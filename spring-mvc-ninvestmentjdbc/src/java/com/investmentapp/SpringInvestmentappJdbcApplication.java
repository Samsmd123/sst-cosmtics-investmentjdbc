package com.investmentapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.investmentapp.model.Investment;
import com.investmentapp.model.Nominee;
import com.investmentapp.model.PlanType;
import com.investmentapp.model.Purpose;
import com.investmentapp.model.Risk;

import com.investmentapp.service.IInvestmentService;

@SpringBootApplication
public class SpringInvestmentappJdbcApplication implements CommandLineRunner {

	public static void main(String[] args)  {
		SpringApplication.run(SpringInvestmentappJdbcApplication.class, args);
	}

IInvestmentService investmentService;

@Autowired
public void setInvestmentSerice(IInvestmentService investmentSerice) {
	this.investmentService = investmentSerice;
}
	@Override
	public void run(String... args) throws Exception {
		
		//Investment investment=	new Investment("Real Estate", 30, PlanType.ppf.name(),30000,Purpose.RETIREMENT.name(),Risk.LOW.name(),Nominee.HUSBAND.name(),12,10);
		
		//investmentService.addInvestment(investment);
		investmentService.getAll().forEach(System.out::println);
		System.out.println("By PURPOSE");
		investmentService.getByPurpose("EDUCATION").forEach(System.out::println);
		System.out.println("By TYPE");
		investmentService.getByType("mutual").forEach(System.out::println);
		System.out.println("By Id");
		investmentService.getById(1);
	}
	
	

}
