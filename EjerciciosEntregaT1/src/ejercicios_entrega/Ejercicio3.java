package ejercicios_entrega;

import java.util.Scanner;

public class Ejercicio3 {
	
	public static void main(String[] args) {
		// Definimos la variable donde guardaremos el primer número
		int num1;
		
		// Definimos la variable donde guardaremos el segundo número
		int num2;
		
		// Definimos la varibale donde guardaremos el resto
		int resto;
		
		// Creamos el objeto Scanner
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos al usuario el primer número
		System.out.println("Introduzca el primer número:");
		
		// Leemos el primer número del teclado
		num1 = sc.nextInt();
		
		// Le pedimos al usuario el segundo número
		System.out.println("Introduzca el segundo número:");
				
		// Leemos el segundo número del teclado
		num2 = sc.nextInt();
		
		// Calculamos el resto
		resto = num1 % num2;
		
		// Mostramos el mensaje por pantalla
		System.out.println(resto == 0 ? "Tu número ya es múltiplo de " + num2 : "Tienes que sumarle " + (num2 - resto) + " para que sea múltiplo de " + num2);
		
		// Cerramos el Scanner
		sc.close();
	}
	
}
