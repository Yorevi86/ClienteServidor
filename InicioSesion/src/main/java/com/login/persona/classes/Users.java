/**
 * 
 */
package com.login.persona.classes;

/**
 * @author JonatanCarreraViera
 *
 */
public class Users {
	
	private String login;
	private String password;
	
	/**
	 * @param login
	 * @param password
	 */
	public Users(String login, String password) {
		this.login = login;
		this.password = password;
	}
	
	/**
	 * 
	 */
	public Users() {
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
}
