package ejercicios_parte2;

import java.util.Scanner;

public class Ejercicio1 {
	
	public static void main(String[] args) {
		// Definimos la constante donde se almacenará el precio de las manzanas
		final float PRECIO_MANZANAS = 2.35f;
		
		// Definimos la constante donde se almacenará el precio de las peras
		final float PRECIO_PERAS = 1.95f;
				
		
		// Definimos las variables donde se almacenarán los kilos de manzana y de peras
		float kgManzanas, kgPeras;
		
		// Definimos la variable donde se almacenará los beneficios
		float beneficios;
		
		// Creamos el objeto Scanner para leer la entrada del teclado
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos al usuario los kilos de manzana
		System.out.println("Introduzca los kilos de manzana vendidos:");
		
		// Leemos los kilos de manzana del teclado
		kgManzanas = sc.nextFloat();
		
		// Le pedimos al usuario los kilos de peras
		System.out.println("Introduzca los kilos de peras vendidos:");
	
		// Leemos los kilos de peras del teclado
		kgPeras = sc.nextFloat();
		
		// Calculamos los beneficios
		beneficios = (kgManzanas * PRECIO_MANZANAS) + (kgPeras * PRECIO_PERAS);
		
		// Imprimimos los beneficios por pantalla
		System.out.println("Los beneficios son de: " + beneficios);
		
		// Cerramos el objeto Scanner
		sc.close();
	}
	
}
