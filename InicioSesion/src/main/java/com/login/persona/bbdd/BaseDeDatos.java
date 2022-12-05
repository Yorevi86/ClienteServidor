/**
 * 
 */
package com.login.persona.bbdd;

import java.util.ArrayList;
import java.util.Arrays;

import com.login.persona.classes.Users;

/**
 * @author JonatanCarreraViera
 *
 */
public class BaseDeDatos {
	
	final Users jonatan = new Users("jonatan", "12345");
	final Users juan = new Users("juan", "98765");
	private ArrayList<Users> datos = new ArrayList<Users>(Arrays.asList(jonatan, juan));

	/**
	 * @return the datos
	 */
	public ArrayList<Users> getDatos() {
		return datos;
	}

	/**
	 * @param add a new User to the bbdd
	 */
	public void addUsers(Users u1) {
		this.datos.add(u1);
	}

}
