package com.pojoExercise;
import java.util.Scanner;

public class PojoExercise {
	// instance field
	private String username;
	private String password;
	private String name;
	
	//constructor method
	public PojoExercise(String username, String password, String name) {
		this.username = username;
		this.password = password;
		this.name = name;
	}
	
	//create getter and setter
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
	}
}
