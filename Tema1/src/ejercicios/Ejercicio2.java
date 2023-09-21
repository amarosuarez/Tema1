package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
	
	public static void main(String[] args) {
		//Creamos la variable que guardará la edad introducida y la que almacenará la próxima edad
		int edad;		
		
		//Creamos el objeto scanner
		Scanner sc = new Scanner(System.in);
		
		//Pedimos al usuario que introduzca su edad y lo guardamos en la variable
		System.out.println("Introduzca su edad:");
		edad = sc.nextInt();
		
		//Calculamos la edad que tendra el año que viene
		edad++;
		
		//Imprimimos por pantalla
		System.out.println("El año que viene tendrás " + edad + " años");
		
		//Cerramos el Scanner
		sc.close();
		
	}
	
}
