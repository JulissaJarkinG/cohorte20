package operadores;

import java.util.Scanner;

public class Ciclos {
	static void saludo() {
		System.out.println("Hola a las funciones en java");
	}
	int operacion() {
		int f= (int)Math.pow(3, 2); //el (int) es para convertir el valor a entero
		System.out.println("uso de pow()"+ f);
		return f;
	}
	
	float nuevo() {
		return 0;
	}
	
	String caracteres() {
		String nombre= "Hola buen día ";
		return nombre;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ciclos objC;
		objC = new Ciclos();
		objC.saludo();
		System.out.println("uso de pow()"+ objC.operacion());
		objC.operacion();
		
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.print("\t\t\t Introduzca el valor de la tabla de multiplicar con el ciclo for:  ");
		int tabla= scanner.nextInt();
		for (int i=0; i<=10; i++){
			System.out.println(tabla + " * "+ i + " = " + (tabla * i));
			
		}
		System.out.print("\t\t\t Introduzca el valor de la tabla de multiplicar con el ciclo while:  ");
		int tablaW= scanner.nextInt();
		int j=1;
		while(j <=10) {
			System.out.println(tablaW +" * " + j + "=" + (tabla*j) );
			j++;
		}

	}

}
