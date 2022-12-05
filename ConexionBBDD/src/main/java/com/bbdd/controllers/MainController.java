/**
 * 
 */
package com.bbdd.controllers;
import com.bbdd.entities.User;
import com.bbdd.persistence.UsuarioBBDD;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


/**
 * @author JonatanCarreraViera
 *
 */
@Controller
public class MainController {

	@Autowired
	protected UsuarioBBDD udb;

	@GetMapping("/index")
	public ModelAndView indexIntranet() {

		return new ModelAndView("index");
	}

	@GetMapping("/sessioncheck01")
	public ModelAndView indexResult(HttpServletRequest request) {

			HttpSession session = request.getSession();
			
			if(!udb.obtainUser(request.getParameter("login"), request.getParameter("password")).isEmpty()) {
				List<User> userList = udb.obtainUser(request.getParameter("login"), request.getParameter("password"));
				session.setAttribute("name", userList.get(0).getName());
				
				return new ModelAndView("sessioncheck01");	
			} else {
				return new ModelAndView("redirect:/index");
				
			}
	}
}