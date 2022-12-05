/**
 * 
 */
package miprimeritoproyecto;

import java.util.Scanner;

/**
 * @author JonatanCarreraViera
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num1;
		int num2;
		Scanner sc = new Scanner(System.in);
		dni dni1 = new dni();
		String dnitemp;
		
		System.out.println("Hola mundo");
		
//		System.out.println("\nEscriba los números que quiera sumar, restar, multiplicar y dividir:");
//		System.out.println("Número 1:");
//		
//		num1 = sc.nextInt();
//		
//		System.out.println("Número 2:");
//		
//		num2 = sc.nextInt();
//		
//		System.out.println("La suma de los números es: " + suma (num1, num2));
//		System.out.println("La resta de los números es: " + resta (num1, num2));
//		System.out.println("La multiplicación de los números es: " + multi (num1, num2));
//		System.out.println("La división de los números es: " + division (num1, num2));
		
		System.out.println("\nIntroduzca su DNI:");
		dnitemp = sc.next();
		
		dni1.setDni(dnitemp);
		
		System.out.println("\nSu DNI es: " + dni1.getDni());
		
		System.out.println("\nEl número del DNI es: " + dni1.obtenerNum(dni1));
		System.out.println("\nLa letra del DNI es: " + dni1.obtenerLetra(dni1));
		
		dni1.imprimirChar(dni1);
		
		sc.close();
	}
	
	public static double suma (double num1, double num2) {
		
		return num1+num2;
	}
	
	public static double resta (double num1, double num2) {

		return num1-num2;
	}

	public static double multi (double num1, double num2) {

		return num1*num2;
	}

	public static double division (double num1, double num2) {

		return num1/num2;
	}

}
