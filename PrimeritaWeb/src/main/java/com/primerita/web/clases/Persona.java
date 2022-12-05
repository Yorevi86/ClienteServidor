/**
 * 
 */
package com.primerita.web.clases;

/**
 * @author JonatanCarreraViera
 *
 */
public class Persona {

    String nombre;
    String apellidos;
    String provincia;
    char sexo;
    
    /**
     * 
     */
    public Persona() {
        super();
    }

    /**
     * @param nombre
     * @param apellidos
     * @param provincia
     * @param sexo
     */
    public Persona(String nombre, String apellidos, String provincia, char sexo) {
        super();
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.provincia = provincia;
        this.sexo = sexo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return the provincia
     */
    public String getProvincia() {
        return provincia;
    }

    /**
     * @param provincia the provincia to set
     */
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    /**
     * @return the sexo
     */
    public char getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", Apellidos=" + apellidos + ", Provincia=" + provincia + ", sexo=" + sexo
                + "]";
    }
}
