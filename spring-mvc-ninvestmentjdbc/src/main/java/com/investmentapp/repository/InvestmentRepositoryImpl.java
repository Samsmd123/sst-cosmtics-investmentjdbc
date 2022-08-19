package com.investmentapp.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.investmentapp.model.Investment;
import com.investmentapp.utill.DbQueries;

@Repository
public class InvestmentRepositoryImpl implements IInvestmentRepository {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setJDBCTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void addInvestment(Investment investment) {
		//String sql = DbQueries.INSERTQUERY;
		Object[] investmentArray = { investment.getPlanName(), investment.getAge(),investment.getAmount(),investment.getPurpose(),investment.getRisk(),investment.getNominee() ,
				investment.getDuartion(),	investment.getTerm(),	investment.getType()  };

		jdbcTemplate.update(DbQueries.INSERTQUERY, investmentArray);
	}

	@Override
	public void updateInvestment(int planId, double amount) {
		String sql=DbQueries.UPDATEQUERY;
		jdbcTemplate.update(sql,amount,planId);
		
	}

	@Override
	public void deleteInvestment(int planId) {
		jdbcTemplate.update(DbQueries.DELETEQUERY,planId);

	}

	@Override
	public List<Investment> findByRiskAndTerm(String risk, int term) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Investment> findByType(String type) {
		List<Investment> investements=jdbcTemplate.query(DbQueries.SELECTBYTYPE,
				(rs,rowNum)->{
					Investment investment=new Investment();
					investment.setPlanName(rs.getString("plan_Name"));
					investment.setPurpose(rs.getString("purpose"));
					investment.setNominee(rs.getString("nominee"));
					investment.setType(rs.getString("type"));
					investment.setRisk(rs.getString("risk"));		
					investment.setAge(rs.getInt("age"));
					investment.setAmount(rs.getDouble("amount"));
					investment.setTerm(rs.getInt("term"));
					investment.setPlanId(rs.getInt("plan_Id"));
					return investment ;
			
		},type);
		
		
		
		return investements ;
	}

	@Override
	public List<Investment> findByPurpose(String purpose) {
		List<Investment>investments=jdbcTemplate.query(DbQueries.SELECTBYPURPOSE,
				new RowMapper<Investment>()	{
					

					@Override
					public Investment mapRow(ResultSet rs, int rowNum) throws SQLException {
						Investment investment=new Investment();
						investment.setPlanName(rs.getString("plan_Name"));
						investment.setPurpose(rs.getString("purpose"));
						investment.setNominee(rs.getString("nominee"));
						investment.setType(rs.getString("type"));
						investment.setRisk(rs.getString("risk"));		
						investment.setAge(rs.getInt("age"));
						investment.setAmount(rs.getDouble("amount"));
						investment.setTerm(rs.getInt("term"));
						investment.setPlanId(rs.getInt("plan_Id"));
						return investment ;
					}
	},purpose);
		return investments;
	}

	@Override
	public List<Investment> findAll() {
		RowMapper<Investment> mapper=new InvestmentMapper();
		List<Investment> investments=jdbcTemplate.query(DbQueries.SELECTQUERY, mapper);
		return investments;
	}

	@Override
	public double calculateMaturity(Investment investment) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Investment findById(int planId) {
		Investment ninvestments=jdbcTemplate.queryForObject(DbQueries.SELECTBYID,
			(rs,rowNum)->	{
						Investment investment=new Investment();
						investment.setPlanName(rs.getString("plan_Name"));
						investment.setPurpose(rs.getString("purpose"));
						investment.setNominee(rs.getString("nominee"));
						investment.setType(rs.getString("type"));
						investment.setRisk(rs.getString("risk"));		
						investment.setAge(rs.getInt("age"));
						investment.setAmount(rs.getDouble("amount"));
						investment.setTerm(rs.getInt("term"));
						//investment.setPlanId(rs.getInt("plan_Id"));
						investment.setPlanId(planId);
					return investment ;	
	},planId);
		return ninvestments;
		}	

}
