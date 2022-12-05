/**
 * 
 */
package com.bbdd.entities;

import java.sql.Date;

/**
 * @author JonatanCarreraViera
 *
 */
public class User {
	private int userID;
	private String login;
	private String password;
	private String name;
	private Date fechaNacimiento;
	
	/**
	 * 
	 */
	public User() {
		super();
	}
	
	/**
	 * @param id_User
	 * @param login
	 * @param password
	 * @param name
	 * @param fechaNacimiento
	 */
	public User(int userID, String login, String password, String name, Date fechaNacimiento) {
		super();
		this.userID = userID;
		this.login = login;
		this.password = password;
		this.name = name;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	/**
	 * @return the id_User
	 */
	public int getUserID() {
		return userID;
	}
	
	/**
	 * @param id_User the id_User to set
	 */
	public void setUserID(int userID) {
		this.userID = userID;
	}
	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}
	/**
	 * @param login the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the fechaNacimiento
	 */
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	/**
	 * @param fechaNacimiento the fechaNacimiento to set
	 */
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
}
