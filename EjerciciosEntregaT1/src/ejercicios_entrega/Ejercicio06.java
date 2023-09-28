package ejercicios_entrega;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		// Definimos la variable donde se almacenarán los segundos
		int segundos;
		
		// Definimos la variable donde se almacenarán las horas
		int horas;
		
		// Definimos la variable donde se almacenarán los minutos
		int minutos;
		
		// Creamos el objeto Scanner
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos al usuario una cantidad de segundos
		System.out.println("Introduzca una cantidad de segundos:");
		
		// Leemos los segundos del teclado
		segundos = sc.nextInt();
		
		// Convertimos los segundos en horas
		horas = segundos/3600;
		
		// Convertimos los segundos en minutos
		minutos = (segundos%3600)/60;

		// Convertimos a segundos
		segundos = (segundos%3600)%60;
		
		// Imprimimos los segundos por pantalla
		System.out.println("Son " + horas + " horas, " + minutos + " minutos y " + segundos + " segundos");
		
		// Cerramos el objeto Scanner
		sc.close();
	}
	
}
