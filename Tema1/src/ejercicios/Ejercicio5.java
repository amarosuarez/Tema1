package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
	
	public static void main(String[] args) {
		// Creamos la variable donde se almacenará el radio, la longitud y el area
		float radio, longitud, area;
				
		// Creamos el objeto Scanner para leer la entrada del teclado
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos al usuario el radio
		System.out.println("Introduce el área: ");
		
		// Leemos el radio del teclado
		radio = sc.nextFloat();
		
		// Calculamos la longitud
		longitud = 2 * (float) Math.PI * radio;
		
		// Calculamos el área
		area = (float) (Math.PI * Math.pow(radio, 2));

		// Imprimimos los resultados por pantalla
		System.out.println("La longitud es: " + longitud + " y el área: " + area);
		
		// Cerramos el objeto Scanner
		sc.close();
	}
	
}
