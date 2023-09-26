package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Creamos las variables donde se almacenarán el año actual, el año de nacimiento y la edad
		int anho, añoNacimiento, edad;
				
		// Creamos el objeto Scanner para leer la entrada del teclado
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos al usuario el año actual
		System.out.println("¿En qué año estamos?");
		
		// Leemos el año actual del teclado
		anho = sc.nextInt();
		
		// Le pedimos al usuario su año de nacimiento
		System.out.println("¿En qué año naciste?");
		
		// Leemos el año de nacimiento del teclado
		añoNacimiento = sc.nextInt();
		
		// Calculamos la edad del usuario
		edad = anho - añoNacimiento;
		
		// Imprimimos la edad por pantalla
		System.out.println("Tienes " + edad + " años");
		
		// Cerramos el objeto Scanner
		sc.close();
	}
	
}
