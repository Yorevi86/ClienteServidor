/**
 * 
 */
package com.formulario.persona.classes;

/**
 * @author JonatanCarreraViera
 *
 */
public class Persona {
	
	String nombre;
    String primerApellido;
    String segundoApellido;
    String dni;
    String fechaNacimiento;
    String telefono;
    String provincia;
    String pais;
    String direccion;
    String codPostal;
    String sexo;
    String tos;
    
	/**
	 * @param nombre
	 * @param primerApellido
	 * @param segundoApellido
	 * @param dni
	 * @param fechaNacimiento
	 * @param provincia
	 * @param pais
	 * @param direccion
	 * @param codPostal
	 * @param sexo
	 * @param tos
	 */
	public Persona(String nombre, String primerApellido, String segundoApellido, String dni, String fechaNacimiento,
			String telefono, String provincia, String pais, String direccion, String codPostal, String sexo, String tos) {
		super();
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
		this.telefono = telefono;
		this.provincia = provincia;
		this.pais = pais;
		this.direccion = direccion;
		this.codPostal = codPostal;
		this.sexo = sexo;
		this.tos = tos;
	}
	/**
	 * 
	 */
	public Persona() {
		super();
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
	 * @return the primerApellido
	 */
	public String getPrimerApellido() {
		return primerApellido;
	}
	/**
	 * @param primerApellido the primerApellido to set
	 */
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}
	/**
	 * @return the segundoApellido
	 */
	public String getSegundoApellido() {
		return segundoApellido;
	}
	/**
	 * @param segundoApellido the segundoApellido to set
	 */
	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}
	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}
	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}
	/**
	 * @return the fechaNacimiento
	 */
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	/**
	 * @param fechaNacimiento the fechaNacimiento to set
	 */
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
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
	 * @return the pais
	 */
	public String getPais() {
		return pais;
	}
	/**
	 * @param pais the pais to set
	 */
	public void setPais(String pais) {
		this.pais = pais;
	}
	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}
	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	/**
	 * @return the codPostal
	 */
	public String getCodPostal() {
		return codPostal;
	}
	/**
	 * @param codPostal the codPostal to set
	 */
	public void setCodPostal(String codPostal) {
		this.codPostal = codPostal;
	}
	/**
	 * @return the sexo
	 */
	public String getSexo() {
		return sexo;
	}
	/**
	 * @param sexo the sexo to set
	 */
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	/**
	 * @return the tos
	 */
	public String getTos() {
		return tos;
	}
	/**
	 * @param tos the tos to set
	 */
	public void setTos(String tos) {
		this.tos = tos;
	}
    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }
    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
