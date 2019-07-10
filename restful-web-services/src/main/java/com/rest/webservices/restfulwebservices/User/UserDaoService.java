package com.rest.webservices.restfulwebservices.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserDaoService {

	private static List<User> users= new ArrayList<>();
	
	static {
		
		users.add(new User(1,"Adam",new Date()));
		users.add(new User(2,"Eve",new Date()));
		users.add(new User(3,"Adam",new Date()));
	}
	
	private static int usersCount = 3;
	
	public List<User> findAll(){
		return users;
		
	}
	
	public User save(User user) {
		
		if(user.getId()==null) {
			
			user.setId(++usersCount);
		}
		users.add(user);
		return user;
		
	}
	
	
	public User FindOne(int id) {
		for(User user:users) {
			
			if(user.getId()==id)
				{return user;}
						
		
		}
		return null;
		
	}
	
	
	public User deletebyId(int id) {
		
		Iterator<User> iterator= users.iterator();
		while(iterator.hasNext()) {
			
			User user= iterator.next();
			if(user.getId()==id) {
				
				iterator.remove();
				return user;
			}
		}
		
		return null;
	}
}
