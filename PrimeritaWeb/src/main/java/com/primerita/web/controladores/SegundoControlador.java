/**
 * 
 */
package com.primerita.web.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author JonatanCarreraViera
 *
 */

@Controller
public class SegundoControlador {

    @GetMapping("/personas")
    public ModelAndView indexIntranet() {
        
        return new ModelAndView("personas");
    }
    
}
