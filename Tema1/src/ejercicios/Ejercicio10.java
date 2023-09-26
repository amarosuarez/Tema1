package ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// Definimos una variable constante donde se almacenará el iva
		final int IVA = 21;
		
		// Definimos las variables donde se almacenarán el precio, y el precio con IVA
		float precio, precioIva;
		
		// Creamos el objeto Scanner para leer la entrada del teclado
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos al usuario el precio
		System.out.println("Introduzca el precio:");
		
		// Leemos el precio del teclado
		precio = sc.nextFloat();
		
		// Aplicamos el IVA
		precioIva = precio + (precio * IVA) / 100;
		
		// Mostramos el precio final por pantalla
		System.out.println("El precio con IVA es de: " + precioIva);
		
		// Cerramos el objeto Scanner
		sc.close();
	}
	
}
