package ejercicios_parte2;

import java.util.Scanner;

public class Ejercicio1 {
	
	public static void main(String[] args) {
		// Definimos las variables
		int kg, option;
		float importe, beneficios = 0;
		
		// Creamos el objeto Scanner
		Scanner sc = new Scanner(System.in);
		
		// Pedimos al usuario que elija entre manzanas o peras
		System.out.println("Escriba 1 para Manzanas o 2 para Peras");
		option = sc.nextInt();
		
		// Pedimos al usuario el número de kilos
		System.out.println("Introduzca el número de kilos: ");
		kg = sc.nextInt();
		
		// Dependiendo de la elección del usuario el importe será diferente
		switch (option) {
			
			case 1:
				importe = 2.35f;
				beneficios = (float) kg * importe;
				break;
	
			case 2:
				importe = 1.95f;
				beneficios = (float) kg * importe;
				break;
		}
		
		// Mostramos los beneficios por pantalla
		System.out.println("Los beneficios serán: " + String.valueOf(beneficios).replace(".",",") + " €");
		
		// Cerramos el Scanner
		sc.close();
	}
	
}
