package es.drago.formacion.ejercicios;

public class Ejercicio8 {
	public static void main(String[] args) {
		int num;
		System.out.print("Introduzca un n�mero: ");
		num = Entrada.entero();
		while (num != 0) // mientras num sea distinto de 0
		{
			if (num > 0)
				// mayor que cero: positivo
				System.out.println("Positivo");
			else
				// si no es positivo: es negativo
				System.out.println("Negativo");
			// repetimos el proceso y volvemos a leer num
			System.out.print("Introduzca otro n�mero: ");
			num = Entrada.entero();
		}
		// al salir del mientras tenemos la certeza que num es 0
	}
}
