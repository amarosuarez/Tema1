package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
	
	public static void main(String[] args) {
		// Creamos la variable radio, longitud, área y pi
		float radio, longitud, area;
		double pi = Math.PI;
				
		// Creamos el objeto Scanner
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos al usuario el radio y lo guardamos en la variable
		System.out.println("Introduce el área: ");
		radio = sc.nextFloat();
		
		// Calculamos la longitud
		longitud = 2 * (float) pi * radio;
		
		// Calculamos el área
		area = (float) (pi * Math.pow(radio, 2));

		// Imprimimos los resultados por pantalla
		System.out.println("La longitud es: " + longitud + " y el área: " + area);
		
		// Cerramos el Scanner
		sc.close();
	}
	
}
