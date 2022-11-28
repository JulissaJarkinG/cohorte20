package polimorfismo;

import java.util.Scanner;

public class Triangulo extends FigurasGeometricas{
	private double base;
	private double altura;
    Scanner  s= new Scanner (System.in);
	
    
    @Override
	public void area() {
		// TODO Auto-generated method stub
		resultado = (base * altura)/2;
	}

	@Override
	public void pedirDatos() {
		// TODO Auto-generated method stub
		System.out.println("\t\t\t Area de Triangulo");
		System.out.print("Introduzca la base : ");
		base= s.nextDouble();
		System.out.print("Introduzca la altura: ");
		altura = s.nextDouble();
	
	}
	
	

}
