package actividad;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		int mangos; 
		int naranjas;

	
		System.out.println("Ingrese el número de mangos");
		mangos = entrada.nextInt(); //para n° de mangos
		
		System.out.println("Ingrese el número de naranjas");
		naranjas = entrada.nextInt(); //para n° de naranjas
		
		//Instancia
		MangosNaranjas mangosNaranjas = new MangosNaranjas(mangos, naranjas);
		mangosNaranjas.imprimir();
		
		
		
	}

}
