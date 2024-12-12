package calculadora;

import java.util.Scanner;


/**
 * Este programa solicita al usuario que ingrese dos numeros y muestra su suma
 * 
 * @version 1.0
 * @author Genis Rodriguez
 */
public class SumaNumeros {
	
	
	 /**
     * Método principal que ejecuta el programa
     * 
     */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//pedir numeros
		System.out.print("Ingresa el primer número: ");
		int numero1 = scanner.nextInt();
		
		System.out.print("Ingresa el segundo número: ");
		int numero2 = scanner.nextInt();
		
		
		int suma = numero1 + numero2;
		
		System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);
	}
	//comentaro des de la rama
	//Comentario después de realizar fusión entre ramas
}