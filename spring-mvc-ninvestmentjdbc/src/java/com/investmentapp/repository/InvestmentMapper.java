package com.investmentapp.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.investmentapp.model.Investment;

public class InvestmentMapper implements RowMapper<Investment> {

	@Override
	public Investment mapRow(ResultSet rs, int rowNum) throws SQLException {
		String planName=rs.getString("plan_Name");
		String purpose=rs.getString("purpose");
		String nominee=rs.getString("nominee");
		String planType=rs.getString("type");
		String risk=rs.getString("risk");
		int term=rs.getInt("term");
		int age=rs.getInt("age");
		double amount=rs.getDouble("amount");
		int planId=rs.getInt("plan_Id");	
	
	
	Investment investment=new Investment();
	investment.setPlanName(planName);
	investment.setPurpose(purpose);
	investment.setNominee(nominee);
	investment.setType(planType);
	investment.setRisk(risk);
	investment.setType(planType);
	investment.setAge(age);
	investment.setAmount(amount);
	investment.setTerm(term);
	investment.setPlanId(planId);
	
	return investment;
	}

}
