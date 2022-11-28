package polimorfismo;
import java.util.Scanner;


public class Cuadrado extends FigurasGeometricas {
	private double lado;
	Scanner s= new Scanner(System.in);
	@Override
	public void area() {
		// TODO Auto-generated method stub
		resultado= lado*lado;
		
	}
	@Override
	public void pedirDatos() {
		// TODO Auto-generated method stub
		System.out.println("\t\t\t Area de Cuadrado");
		System.out.print("Introduzca del lado : ");
		lado= s.nextDouble();
	
	}
	

}
