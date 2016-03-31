package com.netenrich;

public class DatabaseDetails {
	private String database_url = "jdbc:mysql://databaseinstance.csganqaov5mj.us-east-1.rds.amazonaws.com:3306/register";
	private String database_username = "root";
	private String database_password = "zxcv12345";
	public String Databaseurl(){
		return database_url;
		
	}
	public String Databaseusername(){
		return database_username;
	}
	public String Databasepassword(){
		return database_password;
	}
}
