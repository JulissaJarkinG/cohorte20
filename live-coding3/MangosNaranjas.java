package actividad;

import java.util.Scanner;

public class MangosNaranjas {
	//Entrada de usuario
	Scanner entrada = new Scanner(System.in);
	
		int mangos; 
		int naranjas;
	
	public MangosNaranjas(int mangos, int naranjas) {
		this.naranjas = naranjas;
		this.mangos = mangos;
	}
	

	
	public void imprimir(){
		System.out.println(mangos);
		System.out.println(naranjas);
	}
}


