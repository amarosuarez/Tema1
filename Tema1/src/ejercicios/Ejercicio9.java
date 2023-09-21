package ejercicios;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// Definimos las variables a usar
		float valorPesetas, conversionHecha, pesetas = 166;
	
		// Creamos el objeto Scanner
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos al usuario las pesetas y lo guardamos en la variable
		System.out.println("Introduzca el valor de las pesetas:");
		valorPesetas = sc.nextFloat();
		
		// Convertimos de pesetas a euros
		conversionHecha = valorPesetas / pesetas;
				
		// Imprimimos por pantalla
		System.out.println("El valor convertido es de: " + conversionHecha + " €");
		
		// Cerramos el Scanner
		sc.close();
	}
	
}
