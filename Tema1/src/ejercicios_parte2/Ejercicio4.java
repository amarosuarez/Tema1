package ejercicios_parte2;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Definimos las variables
		boolean isRaining, isFinishTasks, needGoLibrary;
		
		// Creamos el objeto Scanner
		Scanner sc = new Scanner(System.in);
		
		// Le preguntamos al usuario si está lloviendo
		System.out.println("¡Recuerde! Conteste con true = si, false = no)");
		System.out.println("¿Está lloviendo?");
		isRaining = sc.nextBoolean();
		
		// Le preguntamos al usuario si ha terminado sus tareas
		System.out.println("¿Has terminado las tareas?");
		isFinishTasks = sc.nextBoolean();
		
		// Le preguntamos al usuario si desea ir a la biblioteca
		System.out.println("¿Necesitas ir a la biblioteca?");
		needGoLibrary = sc.nextBoolean();
		
		// Imprimimos el resultado por pantalla
		System.out.println((!isRaining && isFinishTasks) || needGoLibrary ? "Puedes salir" : "No puedes salir");
		
		// Cerramos el objeto Scanner
		sc.close();
	}
	
}
