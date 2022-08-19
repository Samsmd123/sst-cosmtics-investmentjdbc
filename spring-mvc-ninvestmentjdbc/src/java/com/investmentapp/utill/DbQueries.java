package com.investmentapp.utill;

public class DbQueries {
	public static final String INSERTQUERY="INSERT INTO INVESTMENT(plan_Name,age,amount,purpose,risk,nominee,duration,term,type) value(?,?,?,?,?,?,?,?,?)";
	public static final String UPDATEQUERY="update investment set amount=? where plan_Id=?";
	
	public static final String DELETEQUERY="delete from investment where plan_Id=?";
	
	public static final String SELECTQUERY="select * from investment";
	public static final String SELECTBYTYPE="select * from investment where type=?";
	public static final String SELECTBYPURPOSE="select * from investment where purpose=?";
	public static final String SELECTBYRISKTERM="select * from investment where risk=? and term=?";
	public static final String SELECTBYID="select * from investment where plan_Id=?";
}
