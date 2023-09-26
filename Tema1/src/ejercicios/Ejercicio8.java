package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// Definimos la variable donde se almacenará el nombre
		String nombre;
		
		// Definimos la variable donde se almacenará la edad
		int edad;
		
		// Creamos el objeto Scanner para leer la entrada del teclado
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos al usuario su nombre
		System.out.println("Introduzca su nombre:");
		
		// Leemos el nombre del teclado
		nombre = sc.nextLine();
		
		// Le pedimos al usuario su edad
		System.out.println("Introduzca su edad:");
		
		// Leemos la edad del teclado
		edad = sc.nextInt();
		
		// Imprimimos por pantalla
		System.out.println("Hola " + nombre + ", tienes " + edad + " años, ¡qué mayor eres!");
		
		// Cerramos el objeto Scanner
		sc.close();
	}
	
}
