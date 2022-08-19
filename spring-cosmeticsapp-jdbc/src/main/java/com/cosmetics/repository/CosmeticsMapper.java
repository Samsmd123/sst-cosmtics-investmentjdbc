package com.cosmetics.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.cosmetics.model.Cosmetics;



public class CosmeticsMapper implements RowMapper<Cosmetics> {

	@Override
	public Cosmetics mapRow(ResultSet rs, int rowNum) throws SQLException {
		int cosmeticsId=rs.getInt("cosmeticsId");
		String name=rs.getString("name");
		String brand=rs.getString("barnd");
		String category=rs.getString("category");
		double price=rs.getDouble("price");
		
		Cosmetics cosmetics=new Cosmetics();
		cosmetics.setCosmeticsId(cosmeticsId);
		cosmetics.setName(name);
		cosmetics.setBrand(brand);
		cosmetics.setCategory(category);
		cosmetics.setPrice(price);
		return cosmetics;
	}

}
