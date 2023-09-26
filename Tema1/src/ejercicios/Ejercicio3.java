package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		//Creamos las variables añoActual, añoNacimiento y edad
		int anho, añoNacimiento, edad;
				
		//Creamos el objeto Scanner
		Scanner sc = new Scanner(System.in);
		
		/* A continuación, le pediremos al usuario el año actual y en el año en el que nació
		  y leeremos cada año en una variable diferente.*/
		System.out.println("¿En qué año estamos?");
		anho = sc.nextInt();
		System.out.println("¿En qué año naciste?");
		añoNacimiento = sc.nextInt();
		
		//Calculamos la edad del usuario
		edad = anho - añoNacimiento;
		
		//Imprimimos la edad por pantalla
		System.out.println("Tienes " + edad + " años");
		
		//Cerramos el Scanner
		sc.close();
		
	}
	
}
