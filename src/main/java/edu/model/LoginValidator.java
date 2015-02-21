package edu.model;

import java.util.HashMap;

public class LoginValidator {
	
	private static final HashMap<String, String> userData = new HashMap<String, String>();
	{
		userData.put("yamit", "12345");
		userData.put("AliCate", "123456789");
	}

	public boolean validar(String nombre, String password) {
		String passwordInDatabase = userData.get(nombre);
		return passwordInDatabase.equals(password);
	}

}
