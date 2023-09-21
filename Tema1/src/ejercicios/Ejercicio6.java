package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// Creamos las dos variables para num1, num2 y para almacenar las diferentes operaciones
		int num1, num2, suma, resta, mult;
		float div;
				
		// Creamos el objeto Scanner
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos al usuario el primer número y lo guardamos en la variable
		System.out.println("Introduce un número:");
		num1 = sc.nextInt();
		
		// Le pedimos al usuario el segundo número y lo guardamos en la variable
		System.out.println("Introduce otro número:");
		num2 = sc.nextInt();
		
		// Realizamos las operaciones
		suma = num1 + num2;
		resta = num1 - num2;
		mult = num1 * num2;
		div = (float) num1 / num2;
		
		// Imprimimos los resultados por pantalla
		System.out.println("La suma da: " + suma);
		System.out.println("La resta da: " + resta);
		System.out.println("La multiplicacion da: " + mult);
		System.out.println("La división da: " + div);
		
		// Cerramos el Scanner
		sc.close();
	}
	
}
