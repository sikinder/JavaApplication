package com.netenrich;

public class DatabaseDetails {
	private String database_url = "jdbc:mysql://localhost/register";
	private String database_username = "root";
	private String database_password = "root123";
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
