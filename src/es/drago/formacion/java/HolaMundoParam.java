package es.drago.formacion.java;

import java.io.Console;

public class HolaMundoParam {

	public static void main(String[] args) {

		Console console = System.console();
		if (console == null )
			throw new  RuntimeException("Consola Inhabilitada");
		
		System.out.println("Nombre:");
		String nombre=console.readLine();
		if ( nombre.equals("Drago") ) {
			System.out.println(" Hola Drago");
		}

	}

}
