/**
 * 
 */
package com.bbdd.entities;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 * @author JonatanCarreraViera
 *
 */
public class MappedUser implements RowMapper<User>{

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User user1 = new User();
		user1.setUserID(rs.getInt("id_User"));
		user1.setLogin(rs.getString("login"));
		user1.setPassword(rs.getString("password"));
		user1.setName(rs.getString("name"));
		user1.setFechaNacimiento(rs.getDate("fechaNacimiento"));
		
		return user1;
	}

}
