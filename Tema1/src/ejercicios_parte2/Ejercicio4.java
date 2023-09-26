package ejercicios_parte2;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Definimos las variables donde se almacenará si esta lloviendo, si ha terminado la tarea y si debe ir a la biblioteca
		boolean estaLloviendo, tareasTerminadas, debeIrBiblioteca;
		
		// Creamos el objeto Scanner para leer la entrada del teclado
		Scanner sc = new Scanner(System.in);
		
		// Recordamos al usuario como debe contestar
		System.out.println(" ------------------------------------------------");
		System.out.println("| ¡Recuerde! Conteste con true = si, false = no) |");
		System.out.println(" ------------------------------------------------");
		System.out.println();
		
		// Le preguntamos al usuario si está lloviendo
		System.out.println("¿Está lloviendo?");
		
		// Leemos si está lloviendo del teclado
		estaLloviendo = sc.nextBoolean();
		
		// Le preguntamos al usuario si ha terminado sus tareas
		System.out.println("¿Has terminado las tareas?");
		
		// Leemos si ha terminado las tareas del teclado
		tareasTerminadas = sc.nextBoolean();
		
		// Le preguntamos al usuario si desea ir a la biblioteca
		System.out.println("¿Necesitas ir a la biblioteca?");
		
		// Leemos si debe ir a la biblioteca del teclado
		debeIrBiblioteca = sc.nextBoolean();
		
		// Imprimimos el resultado por pantalla
		System.out.println((!estaLloviendo && tareasTerminadas) || debeIrBiblioteca ? "Puedes salir" : "No puedes salir");
		
		// Cerramos el objeto Scanner
		sc.close();
	}
	
}
