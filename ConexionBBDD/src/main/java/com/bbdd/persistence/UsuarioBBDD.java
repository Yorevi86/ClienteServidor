/**
 * 
 */
package com.bbdd.persistence;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.bbdd.entities.MappedUser;
import com.bbdd.entities.User;

/**
 * @author JonatanCarreraViera
 *
 */
@Repository
public class UsuarioBBDD {
	
	@Autowired
	protected JdbcTemplate template;
	
	public List<User> obtainUser(String login, String password) {
		String sql = "SELECT * FROM usuarios WHERE login='" + login + "' AND password='" + password + "'";
		
		return template.query(sql, new MappedUser());
	}
}
