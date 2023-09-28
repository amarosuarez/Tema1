package ejercicios_entrega;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// Definimos la constante donde se almacenará el precio de las entradas infantiles
		final float PRECIO_INFANTILES = 15.50f;
		
		// Definimos la constante donde se almacenará el precio de las entradas adultos
		final int PRECIO_ADULTOS = 20;
		
		// Definimos la constante donde se almacenará el descuento a aplicar
		final float DESCUENTO = 0.05f;
		
		// Definimos la variable donde se almacenará la cantidad de entradas infantiles
		int cantidadInfantiles;
		
		// Definimos la variable donde se almacenará la cantidad de entradas adultos
		int cantidadAdultos;
		
		// Definimos la variable donde se almacenará el importe
		float importe;
		
		// Creamos el objeto Scanner
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos al usuario el número de entradas infantiles
		System.out.println("¿Cuántas entradas infantiles desea?");
		
		// Leemos el número de entradas infantiles del teclado
		cantidadInfantiles = sc.nextInt();
		
		// Le pedimos al usuario el número de entradas adultos
		System.out.println("¿Cuántas entradas de adultos desea?");
		
		// Leemos el número de entradas adultos del teclado
		cantidadAdultos = sc.nextInt();
		
		// Calculamos el importe
		importe = (float) (cantidadInfantiles * PRECIO_INFANTILES) + (cantidadAdultos * PRECIO_ADULTOS);	
		
		// Verificamos si tiene descuento
		importe = importe >= 100 ? importe - (importe * DESCUENTO) : importe;
		
		// Mostramos el importe final por pantalla
		System.out.println("Usted deberá pagar " + importe + " €");
		
		// Cerramos el objeto Scanner
		sc.close();
	}
	
}
