package ejercicios;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// Definimos las variables donde se almacenará el valor en pesetas y la conversión hecha
		float valorPesetas, conversionHecha;
		
		// Definimos una constante con el valor de las pesetas
		final float PESETAS = 166f;
	
		// Creamos el objeto Scanner para leer la entrada del teclado
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos al usuario las pesetas
		System.out.println("Introduzca el valor de las pesetas:");
		
		// Leemos el valor en pesetas del teclado
		valorPesetas = sc.nextFloat();
		
		// Convertimos de pesetas a euros
		conversionHecha = valorPesetas / PESETAS;
				
		// Imprimimos por pantalla
		System.out.println("El valor convertido es de: " + conversionHecha + " €");
		
		// Cerramos el objeto Scanner
		sc.close();
	}
	
}
