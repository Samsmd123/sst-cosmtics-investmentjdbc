package com.cosmetics.util;

public class DbQueries {
	public static final String INSERTQUERY="INSERT INTO COSMETICS(name,brand,category,price)value(?,?,?,?)";
	public static final String UPDATEQUERY="update cosmetics set price=? where cosmetics_Id=?";
public static final String DELETEQUERY="delete from cosmetics where cosmeticsId=?";
	
	public static final String SELECTQUERY="select * from cosmetics";
	public static final String SELECTBYNAME="select * from cosmetics where name=?";
	public static final String SELECTBYPRICE="select * from cosmetics where price=?";
}
