package ejercicios_entrega;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// Definimos la variable donde se almacenará el primer número
		int num1;
		
		// Definimos la variable donde se almacenará el segundo número
		int num2;
		
		// Definimos la variable donde se almacenará true o false
		boolean iguales;
		
		// Creamos el objeto Scanner
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos al usuario el primer número
		System.out.println("Introduzca un número:");
		
		// Leemos el número del teclado
		num1 = sc.nextInt();
		
		// Le pedimos al usuario el segundo número
		num2 = sc.nextInt();
		
		// Mostramos el mensaje por pantalla
		System.out.println(iguales = num1 == num2);
		
		// Cerramos el objeto Scanner
		sc.close();
	}
	
}