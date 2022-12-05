/**
 * 
 */
package com.formulario.persona.utilities;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;

import org.apache.commons.validator.routines.DateValidator;

import com.formulario.persona.classes.Persona;

/**
 * @author JonatanCarreraViera
 *
 */
public class ValidatePersona extends Persona {

    /**
     * Method to validate Persona attributes
     * 
     * @return
     */
    public Map<String, String> validation(Persona p) {
        HashMap<String, String> personValidation = new HashMap<>();
        // crear el hashmap con clave String del valor a comprobar, y el valor como true
        // o false de los comprobadores

        personValidation.put("Nombre: ", allLetters(p.getNombre()));
        // se comprueba a través del método allLetters que nombre y los subsiguientes
        // solo tienen letras
        personValidation.put("Primer apellido: ", allLetters(p.getPrimerApellido()));
        personValidation.put("Segundo apellido: ", allLetters(p.getSegundoApellido()));
        personValidation.put("DNI: ", validateDNI(p.getDni()));
        personValidation.put("Fecha de nacimiento: ", validateBirthDate(p.getFechaNacimiento()));
        personValidation.put("Teléfono: ", validatePhone(p.getTelefono()));
        personValidation.put("País: ", validateSelect(p.getPais()));
        personValidation.put("Provincia: ", validateSelect(p.getProvincia()));
        personValidation.put("Dirección: ", validateEmpty(p.getDireccion()));
        personValidation.put("Código postal: ", validateCP(p.getCodPostal()));
        personValidation.put("Sexo: ", validateEmpty(p.getSexo()));
        personValidation.put("Términos de uso: ", validateToS(p.getTos()));

        return personValidation;
    }

    public String allLetters(String toValidate) {
        String result = "ko";
        
        if (toValidate == null) {
            return result;
        } else if (toValidate.matches("[a-zA-Z]+")) {
            result = "ok";
        }

        return result;
    }

    public String validateDNI (String toValidate) {
        final Pattern REGEXP = Pattern.compile("[0-9]{8}[A-Z]");
        final String DIGITO_CONTROL = "TRWAGMYFPDXBNJZSQVHLCKE";
        final String[] INVALIDOS = new String[] { "00000000T", "00000001R", "99999999R" };
        String result ="ko";
    
        if (toValidate == null) {
            return result;
        } else if (Arrays.binarySearch(INVALIDOS, toValidate) < 0 && REGEXP.matcher(toValidate).matches() && toValidate.charAt(8) == DIGITO_CONTROL.charAt(Integer.parseInt(toValidate.substring(0, 8)) % 23)) {
            result = "ok";
        }
        
        return result;
    }
    
    public String validateBirthDate (String toValidate) {
        
        String result = "ok";
        // Get the instance of `DateValidator`
        DateValidator validator = DateValidator.getInstance();
        System.out.println(toValidate);
         
        // Validate the date
        if (toValidate == null) {
            return result = "ko";
        } else if(validator.isValid(toValidate, Locale.ENGLISH)) {
            return result;
        } else {
            return result = "ko";
        }
    }
    
    public String validatePhone (String toValidate) {
        String result = "ko";
        
        if (toValidate == null) {
            return result;
        } else if (toValidate.matches("\\d{9}")) {
            result = "ok";
        }
        
        return result;
    }

    public String validateSelect(String toValidate) {
        String result = "ok";

        if (toValidate.equalsIgnoreCase("0")) {
            result = "ko";
        }

        return result;
    }

    public String validateEmpty(String toValidate) {
        String result = "ko";

        if (toValidate == null) {
            return result;
        } else if (!toValidate.equalsIgnoreCase("")) {
            result = "ok";
        }

        return result;
    }

    public String validateCP(String toValidate) {
        String result = "ko";

        if (toValidate == null) {
            return result;
        } else if (toValidate.matches("\\d{5}")) {
            result = "ok";
        }

        return result;
    }

    public String validateToS(String toValidate) {
        String result = "ko";

        if (toValidate == null) {
            return result;
        } else if (toValidate.equalsIgnoreCase("on")) {
            result = "ok";
        }

        return result;
    }

}
