/**
 * 
 */
package com.formulario.persona.controllers;

import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import com.formulario.persona.classes.Persona;
import com.formulario.persona.utilities.ValidatePersona;

/**
 * @author JonatanCarreraViera
 *
 */

@Controller
public class Controllers {
	
	@GetMapping("/formulario")
    public ModelAndView indexIntranet() {
        
        return new ModelAndView("formulario");
    }
	
	@GetMapping("/validacion")
	public ModelAndView indexResult(HttpServletRequest request) {
		
		Persona p = new Persona(request.getParameter("nombre"),
				request.getParameter("apellido1"),
				request.getParameter("apellido2"),
				request.getParameter("dni"),
				request.getParameter("nacimiento"),
				request.getParameter("tlf"),
				request.getParameter("country"),
				request.getParameter("provincia"),
				request.getParameter("direccion"),
				request.getParameter("zip"),
				request.getParameter("genero"),
				request.getParameter("tos")
				);
		
		ValidatePersona vp = new ValidatePersona();
		Map<String, String> checks = vp.validation(p);
		
		for (Map.Entry<String, String> data : checks.entrySet()) {
            System.out.println(data.getKey() + data.getValue());
        }
		
		ModelAndView maw = new ModelAndView("validacion");
		maw.addObject("mapaValidacion", checks);
		
		return maw;
	}

}
