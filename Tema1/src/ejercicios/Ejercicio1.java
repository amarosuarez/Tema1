package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
	
	public static void main(String[] args) {
		// Creamos una variable donde se guardará el número introducido por el usuario
		int num;
				
		// Creamos el objeto Scanner para leer la entrada del teclado
		Scanner sc = new Scanner(System.in);
		
		// Pedimos que introduzca un número
		System.out.println("Introduce un número entero: ");
		
		// Leemos el número del teclado
		num = sc.nextInt();
		
		// Imprimimos el número en pantalla
		System.out.println("Su número es: " + num);
		
		// Cerramos el objeto Scanner
		sc.close();
		
	}

}
