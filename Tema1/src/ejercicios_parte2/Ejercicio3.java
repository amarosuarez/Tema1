package ejercicios_parte2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Declaramos las variables
		boolean esPar;
		int num;
		
		// Creamos el objeto Scanner
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos al usuario un número
		System.out.println("Introduzca un número:");
		num = sc.nextInt();
		
		// Confirmamos que el número sea par
		esPar = num % 2 == 0 ;
		
		// Imprimimos por pantalla
		System.out.println(esPar ? "Su número es par" : "Su número es impar");
		
		// Cerramos el objeto Scanner
		sc.close();
	}
	
}
