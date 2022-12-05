/**
 * 
 */
package com.primerita.web.controladores;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author JonatanCarreraViera
 *
 */

@Controller
public class PrimeritaWebControlador {

		@GetMapping("/index")
		public ModelAndView indexIntranet() {
			
			return new ModelAndView("index");
		}
		
		@GetMapping("/index1")
		public ModelAndView indexIntranet1() {
			
			return new ModelAndView("index1");
		}
		
		@GetMapping("/index2")
		public ModelAndView indexIntranet2() {
			
			return new ModelAndView("index2");
		}
		
		@GetMapping("/result")
		public ModelAndView indexResult(HttpServletRequest request) {
			
			return new ModelAndView("result");
		}
}
