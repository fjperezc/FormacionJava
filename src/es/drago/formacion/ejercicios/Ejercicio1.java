package es.drago.formacion.ejercicios;

public class Ejercicio1 {

	public static void main(String[] args) {
		double a, r; // �rea y radio
		System.out.print("Introduce el radio de un circulo: ");
		r = Entrada.real();
		a = Math.PI * (r * r); // para elevar al cuadrado otra opci�n es:
								// Math.pow (r, 2)

		System.out.println("El �rea de una circunferencia de radio " + r
				+ " es: " + a);

	}
	
}
