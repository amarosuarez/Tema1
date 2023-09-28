package ejercicios_entrega;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// Definimos la variable donde se almacenará la base
		float base;
		
		// Definimos la variable donde se almacenará la altura
		float altura;
		
		// Definimos la variable donde se almacenará el área del triángulo
		float area;
		
		// Creamos el objeto Scanner
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos al usuario la base del triángulo
		System.out.println("Introduzca la base del triángulo:");
		
		// Leemos la base del teclado
		base = sc.nextFloat();
		
		// Le pedimos al usuario la altura del triángulo
		System.out.println("Introduzca la altura del triángulo");
		
		// Leemos la altura del teclado
		altura = sc.nextFloat();
		
		// Calculamos el área del triángulo
		area = (base * altura) / 2;
		
		// Mostramos el mensaje por pantalla
		System.out.println("El área de este triángulo es: " + area);
		
		// Cerramos el Scanner
		sc.close();
	}
	
}
