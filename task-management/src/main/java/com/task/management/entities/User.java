package com.task.management.entities;

import javax.persistence.*;

@Entity
@Table(name="login")
public class User  {
	
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String username;
    
    @Column(unique = true)
    private String password;
    
    private String name;
    @Column(unique = true)
    
    private String email;
    private String role;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public User(int id, String username, String password, String name, String email, String role) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.name = name;
		this.email = email;
		this.role = role;
	}
	public User() {
		super();
	}
	
   
    

}
