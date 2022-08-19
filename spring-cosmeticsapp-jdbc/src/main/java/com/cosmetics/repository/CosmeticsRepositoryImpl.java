package com.cosmetics.repository;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.cosmetics.model.Cosmetics;
import com.cosmetics.util.DbQueries;

@Repository
public class CosmeticsRepositoryImpl implements ICosmeticsRepository{
	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setJDBCTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	@Override
	public void addCosmetics(Cosmetics cosmetics) {
		Object[] cosmeticsArray= {cosmetics.getName(),cosmetics.getBrand(),cosmetics.getCategory(),cosmetics.getPrice()};
		jdbcTemplate.update(DbQueries.INSERTQUERY,cosmeticsArray);
	}

	
	
	@Override
	public void updateCosmetics(int cosmeticsId, double price) {
		String sql=DbQueries.UPDATEQUERY;
		jdbcTemplate.update(sql,cosmeticsId,price);
		
	}
	
	@Override
	public void deleteCosmetics(int cosmeticsId) {
		jdbcTemplate.update(DbQueries.DELETEQUERY,cosmeticsId);
		
	}
	@Override
	public List<Cosmetics> findAll() {
		RowMapper<Cosmetics> mapper=new CosmeticsMapper();
		List<Cosmetics> cosmetics=jdbcTemplate.query(DbQueries.SELECTQUERY, mapper);
		return cosmetics;
	}
	@Override
	public List<Cosmetics> findByName(String name) {
		List<Cosmetics> ncosmetics=jdbcTemplate.query(DbQueries.SELECTBYNAME,
				(rs,rowNum)->{
					Cosmetics cosmetics=new Cosmetics();
					cosmetics.setCosmeticsId(rs.getInt("cosmeticsId"));
					cosmetics.setName(rs.getString("name"));
					cosmetics.setBrand(rs.getString("barnd"));
					cosmetics.setCategory(rs.getString("category"));
					cosmetics.setPrice(rs.getDouble("price"));
					return cosmetics;
		},name);		
				
				return ncosmetics ;
	}
	@Override
	public List<Cosmetics> findByBrand(String brand) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Cosmetics> findByCategory(String category) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Cosmetics> findByPrice(double price) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Cosmetics findByCategoryId(int comesticsId) {
		// TODO Auto-generated method stub
		return null;
	}
	


}
