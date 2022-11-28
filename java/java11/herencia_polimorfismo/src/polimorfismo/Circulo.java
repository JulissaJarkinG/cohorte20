package polimorfismo;

import java.util.Scanner;

public class Circulo extends FigurasGeometricas {
	private double radio;
	Scanner s = new Scanner(System.in);

	@Override
	public void pedirDatos() {
		System.out.println("\t\t\t Area de un Círculo");
		// TODO Auto-generated method stub
		System.out.println("Introduzca el radio: ");
		radio = s.nextDouble();
		
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		resultado= (Math.PI*(Math.pow(radio, 2)));
	}

}
