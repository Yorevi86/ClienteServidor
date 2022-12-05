/**
 * 
 */
package miprimeritoproyecto;

import java.util.ArrayList;

/**
 * @author JonatanCarreraViera
 *
 */
public class dni {
	private String dni;
	
	/**
	 * 
	 */
	public dni() {
	}

	/**
	 * @param dni
	 */
	public dni(String dni) {
		this.dni = dni;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public String obtenerNum(dni dni) {
		String numDNI;
		
		numDNI = dni.getDni().substring(0, obtenerCaracteres(dni)-1);
		
		return numDNI;
	}
	
	public String obtenerLetra(dni dni) {
		String numDNI;
		
		numDNI = dni.getDni().substring(obtenerCaracteres(dni)-1, obtenerCaracteres(dni));
		
		return numDNI;
	}
	
	public int obtenerCaracteres(dni dni) {
		int num;
		
		num = dni.getDni().length();
		
		return num;
	}
	
	public void imprimirChar(dni dni) {
		ArrayList<String> dniAL = new ArrayList<String>();
		
		for (int i = 0; i<dni.getDni().length(); i++) {
			dniAL.add(dni.getDni().substring(i, i+1));
		}
		
		System.out.println("\n" + dniAL);
	}
}
