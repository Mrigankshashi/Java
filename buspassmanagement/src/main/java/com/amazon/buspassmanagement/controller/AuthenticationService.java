package com.amazon.buspassmanagement.controller;

import java.util.LinkedHashMap;
import java.util.Iterator;

import com.amazon.buspassmanagement.model.User;

public class AuthenticationService {
	
	private static AuthenticationService service = new AuthenticationService();
	
	// Dummy database in RAM
	LinkedHashMap<Integer, User> users = new LinkedHashMap<Integer, User>();
	
	private AuthenticationService(){
		
		User user1 = new User();
		user1.id = 1;
		user1.name = "Mrigank Shashi";
		user1.email = "mrigank@gmail.com";
		user1.password = "mrigank123";
		user1.type = 1;
		
		User user2 = new User();
		user2.id = 2;
		user2.name = "Akhil Anand";
		user2.email = "akhil@gmail.com";
		user2.password = "akhil123";
		user2.type = 2;
		
		// Dummy Users In HashMap :)
		users.put(user1.id, user1);
		users.put(user2.id, user2);
		
		System.out.println("DataBase Details: ");
		System.out.println(users);
		
	}
	
	static public AuthenticationService getInstance() {
		return service;
	}
	
	public boolean loginUser(User user) {
		
		boolean result = false;
		
		Iterator<Integer> itr = users.keySet().iterator();
		while(itr.hasNext()) {
			Integer key = itr.next();
			
			User u = users.get(key);
			
			// Select * from User where email = '' and password = ''
			if(u.email.equals(user.email) && u.password.equals(user.password)) {
				
				// User will now point to new object that is refereed by u
				user.name = u.name;
				user.type = u.type;
				result = true;
				break;
			}
			
		}		
		return result;		
	}
	
}
