package colecciones;

import java.util.Arrays;

public class Arreglos {
public static void main(String[] args) {
	//Arrays - Arreglos -Matrices
	//Sólo permiten un tipo de dato
	//Se tienen que especificar su tamaño
	
	/* 
	 * String
	 * int
	 * double
	 * long
	 * */
	
	String[] miArreglo = new String[5];
	
	miArreglo[0]= "Julissa";
	miArreglo[1]= "Felipe";
	miArreglo[2]= "Alonso";
	miArreglo[3]= "Fernanda";
	miArreglo[4]= "Victor";
	
	System.out.println(miArreglo);
	//for
	for(int i=0; i<miArreglo.length; i++) {
		System.out.println("ciclo for: " + miArreglo[i]);
	}
	System.out.println("--------------------------");
	//forEach
	for(String nombre : miArreglo) { 
		System.out.println("For Each: " + nombre);
		
	}
	//Math.pow(2, 2); uno indica el valor base y el otro el valor de la potencia
	//Regresa un número double
	//Arrays
	System.out.println(Arrays.toString(miArreglo));
	
	//Tipos de valores
	int numeros[]= new int[5];
	numeros[0] =3;
	numeros[1]=-56;
	numeros[2]= (int)3.55; //casteo== cambiar a otro tipo de valor
	numeros[3] =Integer.parseInt("2");//parseo== cambiar la clase del valor
	
	for(int numero: numeros) {
		System.out.println("Valores del arreglo números: " + numero);
		
	}
	
	//Arreglos de objetos
	Persona persona1= new Persona("Pancho", 30);
	Persona persona2= new Persona("Paty", 58);
	
	//
	Persona [] arrPersonas = new Persona[3];
	arrPersonas[0]= persona1;
	arrPersonas[1]= persona2;
	arrPersonas[2]= new Persona("Luis",18);
	
	System.out.println(arrPersonas[0].nombre);
	System.out.println(arrPersonas[1].nombre);
	System.out.println(arrPersonas[2].nombre);
	
	for(Persona persona : arrPersonas) {
		System.out.println("Nombre: "+ persona.nombre + "edad:" + persona.edad);
	}
	//Arreglos literales
	String [] arrString= { "Manzana", "Pera", "12", "hola"}; 
	System.out.println(Arrays.toString(arrString));
}
}
