package mangosyNaranjas;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Principal= new Scanner(System.in);
		
		int mangos; 
		int naranjas;

	
		System.out.println("Ingrese el número de mangos");
		mangos = Principal.nextInt(); //para n° de mangos
		
		System.out.println("Ingrese el número de naranjas");
		naranjas = Principal.nextInt(); //para n° de naranjas
		
		//Instancia
		MangosyNaranjas mangosNaranjas = new MangosyNaranjas(mangos, naranjas);
		mangosNaranjas.imprimir();
		
	}

}
