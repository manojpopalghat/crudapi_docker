package com.manoj.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserRepository 
{
	Connection conn = null;
	public UserRepository() 
	{
		String url = "jdbc:mysql://localhost:3306/userDB";
		String user = "admin";
		String password = "admin00";
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	
	public List<User> getUsers()
	{
		String sql = "SELECT * FROM users";
		 
		List<User> users = new ArrayList<User>(); 
		try
		{
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while(rs.next())
			{
				User user = new User();
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("name"));
				user.setAge(rs.getInt("age"));
				user.setDepartment(rs.getString("department"));
				user.setSubject(rs.getString("subject"));
				
				users.add(user);
			}	
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return users;
	}
	
	public User getUser(int id)
	{
		User user = new User();
		String sql = "SELECT * FROM users WHERE id="+id;
		try
		{
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			if(rs.next())
			{
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("name"));
				user.setAge(rs.getInt("age"));
				user.setDepartment(rs.getString("department"));
				user.setSubject(rs.getString("subject"));
			}	
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return user;
	}
	
	public int create(User user)
	{
		int successFlag = 0;
		String sql = "INSERT INTO users (id,name,age,department,subject) VALUES (?,?,?,?,?)";
		try 
		{
			PreparedStatement st = conn.prepareStatement(sql);
			
			st.setInt(1,user.getId());
			st.setString(2,user.getName());
			st.setInt(3,user.getAge());
			st.setString(4,user.getDepartment());
			st.setString(5,user.getSubject());
			
			successFlag = st.executeUpdate();
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println(e);
		}
		return successFlag;
	}
	
	public int update(User user)
	{
		int successFlag = 0;
		String sql = "UPDATE users SET name=?, age=?, department=?, subject=? WHERE id=?";
		try 
		{
			PreparedStatement st = conn.prepareStatement(sql);
			
			st.setString(1,user.getName());
			st.setInt(2,user.getAge());
			st.setString(3,user.getDepartment());
			st.setString(4,user.getSubject());
			st.setInt(5,user.getId());
			
			successFlag = st.executeUpdate();
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println(e);
		}
		return successFlag;
	}
	
	public int delete(int id)
	{
		int successFlag = 0;
		String sql = "DELETE FROM users WHERE id=?";
		try 
		{
			PreparedStatement st = conn.prepareStatement(sql);
			
			st.setInt(1,id);
			
			successFlag = st.executeUpdate();
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println(e);
		}
		return successFlag;
	}
}
