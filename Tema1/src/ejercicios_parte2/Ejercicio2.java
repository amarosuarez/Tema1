package ejercicios_parte2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Definimos las variables
		boolean esMayorDeEdad;
		int edad;
		
		// Creamos el objeto Scanner
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos al usuario su edad
		System.out.println("Introduzca su edad:");
		edad = sc.nextInt();
		
		// Comprobamos que sea mayor de edad
		esMayorDeEdad = edad >= 18;
		
		System.out.println(esMayorDeEdad ? "Eres mayor de edad" : "Eres menor de edad");
		
		// Cerramos el Scanner
		sc.close();
	}
	
}
