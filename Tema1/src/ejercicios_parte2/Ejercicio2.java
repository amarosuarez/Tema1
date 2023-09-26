package ejercicios_parte2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Definimos la variable donde se almacenará si es mayor de edad
		boolean esMayorDeEdad;
		
		// Definimos la variable donde se almacenará la edad
		int edad;
		
		// Creamos el objeto Scanner para leer la entrada del teclado
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos al usuario su edad
		System.out.println("Introduzca su edad:");
		
		// Leemos la edad del teclado
		edad = sc.nextInt();
		
		// Comprobamos que sea mayor de edad
		esMayorDeEdad = edad >= 18;
		
		// Imprimimos el mensaje por pantalla
		System.out.println(esMayorDeEdad ? "Eres mayor de edad" : "Eres menor de edad");
		
		// Cerramos el objeto Scanner
		sc.close();
	}
	
}
