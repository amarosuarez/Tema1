package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
	
	public static void main(String[] args) {
		// Creamos la variable que guardará la edad introducida
		int edad;		
		
		// Creamos el objeto Scanner para leer la entrada del teclado
		Scanner sc = new Scanner(System.in);
		
		// Pedimos al usuario que introduzca su edad
		System.out.println("Introduzca su edad:");
		
		// Leemos la edad del teclado
		edad = sc.nextInt();
		
		// Calculamos la edad que tendra el año que viene
		edad++;
		
		// Imprimimos por pantalla
		System.out.println("El año que viene tendrás " + edad + " años");
		
		// Cerramos el Scanner
		sc.close();
	}
	
}
