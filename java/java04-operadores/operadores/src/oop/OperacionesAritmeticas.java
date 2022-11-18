package oop;

import java.util.Scanner;

public class OperacionesAritmeticas {
Scanner s= new Scanner(System.in);

double add() {
	System.out.println("Introduzca el numero a sumar: ");
	double valor0 = s.nextDouble();
	System.out.println("Introduzca numero2 a sumar: ");
	double valor1 = s.nextDouble();
	return valor0 + valor1;
}
double sustrac() {
	System.out.println("Introduzca el numero a restar: ");
	double valor0 = s.nextDouble();
	System.out.println("Introduzca numero2 a restar: ");
	double valor1 = s.nextDouble();
	return valor0 - valor1;
}
 double producto() {
	System.out.println("Introduzca el numero a multiplicar: ");
	double valor0 = s.nextDouble();
	System.out.println("Introduzca numero2 a multiplicar: ");
	double valor1 = s.nextDouble();
	return valor0 * valor1;}

 double divide() {
	System.out.println("Introduzca el numero a dividir: ");
	double valor0 = s.nextDouble();
	System.out.println("Introduzca numero2 a dividir: ");
	double valor1 = s.nextDouble();
	if( valor1 !=0){
		return valor0 / valor1;
	} else {
		System.out.println("No se puede dividir entre 0");
	       }
	return 0;
	         }
double modulo() {
	System.out.println("Introduzca el numero1 para modulo: ");
	double valor0 = s.nextDouble();
	System.out.println("Introduzca numero2 para modulo: ");
	double valor1 = s.nextDouble();
	return valor0 % valor1;
	            }
}
