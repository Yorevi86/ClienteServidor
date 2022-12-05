/**
 * 
 */
package com.login.persona.controlador;

import java.net.http.HttpClient.Redirect;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import com.login.persona.classes.Users;

/**
 * @author JonatanCarreraViera
 *
 */
@Controller
public class Sesion {

	/**
	 * 
	 */
	@GetMapping("/index")
    public ModelAndView indexIntranet() {
        
        return new ModelAndView("index");
    }
	
	@PostMapping("/sessioncheck1")
	public ModelAndView indexResult(HttpServletRequest request) {
		
		ModelAndView validation = null;
		
		if (request.getParameter("login") != null && request.getParameter("password") != null) {
			Users u1 = new Users(request.getParameter("login"), request.getParameter("password"));
			final Users jonatan = new Users("jonatan", "12345");
			final Users juan = new Users("juan", "98765");
			HttpSession session = request.getSession();
			ArrayList<Users> datos = new ArrayList<>(Arrays.asList(jonatan, juan));
			
			
			for (int i = 0; i<datos.size(); i++) {
				if (u1.getLogin().equals(datos.get(i).getLogin()) && u1.getPassword().equals(datos.get(i).getPassword())) {
					session.setAttribute("user", u1.getLogin());
					validation = new ModelAndView("sessioncheck1");
					break;
				} else {
					validation = new ModelAndView("index");
				}
			}
		}else {
			validation = new ModelAndView("index");
		}
		
		
		return validation;
	}

}
