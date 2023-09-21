package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// Definimos las variables a usar
		String nombre;
		int edad;
		
		// Creamos el objeto Scanner
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos al usuario su nombre y lo guardamos en la variable
		System.out.println("Introduzca su nombre:");
		nombre = sc.nextLine();
		
		// Le pedimos al usuario su edad y lo guardamos en la variable
		System.out.println("Introduzca su edad:");
		edad = sc.nextInt();
		
		// Imprimimos por pantalla
		System.out.println("Hola " + nombre + ", tienes " + edad + " años, ¡qué mayor eres!");
		
		// Cerramos el Scanner
		sc.close();
	}
	
}
