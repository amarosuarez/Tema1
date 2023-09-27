package ejercicios_entrega;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Definimos la variable donde se almacenará el valor de x
		float x;
		
		// Definimos la variable donde se almacenará el valor de a
		float a;
		
		// Definimos la variable donde se almacenará el valor de b
		float b;
		
		// Definimos la varibale donde se almacenará el valor de c
		float c;
		
		// Definimos la variable donde se almacenará el valor de y
		float y;
		
		// Creamos el objeto Scanner
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos al usuario el valor de x
		System.out.println("Introduzca el valor de x:");
		
		// Leemos el valor de x del teclado
		x = sc.nextFloat();
		
		// Le pedimos al usuario el valor de a
		System.out.println("Introduzca el valor de a:");
		
		// Leemos el valor de a del teclado
		a = sc.nextFloat();
		
		// Le pedimos al usuario el valor de b
		System.out.println("Introduzca el valor de b:");
		
		// Leemos el valor de b del teclado
		b = sc.nextFloat();
		
		// Le pedimos al usuario el valor de c
		System.out.println("Introduzca el valor de c");
		
		// Leemos el valor de c del teclado
		c = sc.nextFloat();
		
		// Calculamos el polinomio
		y = (float) (a*Math.pow(x, 2)+ b*x + c);
		
		// Mostramos el valor de y por pantalla
		System.out.println("'y' vale: " + y);
		
		// Cerramos el objeto Scanner
		sc.close();
		
	}
	
}
