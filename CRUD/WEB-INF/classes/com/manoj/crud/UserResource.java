package com.manoj.crud;

import java.util.List;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("users")
public class UserResource 
{
	UserRepository repo = new UserRepository();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> getUsers()
	{
		System.out.println("GET Method for all users called ...");
		return repo.getUsers();
	}
	
	@GET
	@Path("read/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public User getUsers(@PathParam("id") int id)
	{
		System.out.println("GET Method for id="+id+" called ...");
		return repo.getUser(id);
	}
	
	@POST
	@Path("create")
	@Consumes(MediaType.APPLICATION_JSON)
	public User createUser(User user)
	{
		System.out.println("POST Method for user = "+user+" called ...");
		if(repo.getUser(user.getId()).getId()==0) //if user with given id is not present
		{
			repo.create(user);
		}
		else 
		{
			return new User(); 
		}	
		return user;
	}
	
	@PUT
	@Path("update")
	@Consumes(MediaType.APPLICATION_JSON)
	public User updateUser(User user) 
	{
		System.out.println("PUT Method for user = "+user+" called ...");
		if(repo.getUser(user.getId()).getId()==0) //if user with given id is not present
		{
			repo.create(user);
			System.out.println("User is Not present So it will created");
		}
		else
		{
			repo.update(user);
		}
		
		return user;
	}
	
	@DELETE
	@Path("delete/{id}")
	public User deleteUser(@PathParam("id") int id) 
	{
		System.out.println("DELETE Method for id = "+id+" called ...");
		User user = repo.getUser(id);
		if(user.getId()!=0)
		{
			repo.delete(id);
		}
		else
		{
			System.out.println("id = "+id+" not Present !");
		}
			
		return user;
	}
}
