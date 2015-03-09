package es.drago.formacion.ejercicios;

public class Ejercicio6_2 {

	public static void main(String[] args) {
		int nota;
		System.out.print("Introduzca una nota: ");
		nota = Entrada.entero();
		// tanto los if's como los else's encierran a una sola instrucción
		// y no es necesario utilizar llaves { }
		switch (nota) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("INSUFICIENTE");
			break;
		case 5:
			System.out.println("SUFICIENTE");
			break;
		case 6:
			System.out.println("BIEN");
			break;
		case 7:
		case 8:
			System.out.println("NOTABLE");
			break;
		case 9:
		case 10:
			System.out.println("SOBRESALIENTE");
			break;
		default:
			System.out.println("ERROR");
			break;
		}

	}
}
