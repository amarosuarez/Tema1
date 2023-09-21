package ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// Definimos las variables a usar
		final int iva = 21;
		float precio, precioIva, precioPorcentaje;
		
		// Creamos el objeto Scanner
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos al usuario el precio y lo guardamos en la variable
		System.out.println("Introduzca el precio:");
		precio = sc.nextFloat();
		
		// Aplicamos el IVA
		precioPorcentaje = (precio * iva) / 100;
		
		precioIva = precio + precioPorcentaje;
		
		// Mostramos el precio final por pantalla
		System.out.println("El precio con IVA es de: " + precioIva);
		
		// Cerramos el Scanner
		sc.close();
	}
	
}
