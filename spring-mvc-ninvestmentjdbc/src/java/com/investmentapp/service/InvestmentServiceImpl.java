package com.investmentapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.investmentapp.model.Investment;
import com.investmentapp.repository.*;
@Service
public class InvestmentServiceImpl implements IInvestmentService{
	
	private IInvestmentRepository investmentRepository;
	
@Autowired
public void setInvestmentRepository(IInvestmentRepository investmentRepository) {
	this.investmentRepository=investmentRepository;
}
	@Override
	public void addInvestment(Investment investment) {
		investmentRepository.addInvestment(investment);
		
	}

	@Override
	public void updateInvestment(int planId, double amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteInvestment(int planId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Investment> getByType(String type) {
		
		return investmentRepository.findByType(type);
	}

	@Override
	public List<Investment> getByPurpose(String purpose) {
		
		return investmentRepository.findByPurpose(purpose) ;
	}

	@Override
	public double calculateMaturity(Investment investment) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Investment> getByRiskAndTerm(String risk, int term) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Investment> getAll() {
		return investmentRepository.findAll();
	}

	@Override
	public Investment getById(int palnId) {
		
		return investmentRepository.findById(palnId);
	}
	

}
