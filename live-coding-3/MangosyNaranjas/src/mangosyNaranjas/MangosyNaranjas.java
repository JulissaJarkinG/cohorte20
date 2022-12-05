package mangosyNaranjas;

import java.util.Scanner;

public class MangosyNaranjas extends Principal {
	Scanner entrada = new Scanner(System.in);
	
	int mangos; 
	int naranjas;

public MangosyNaranjas(int mangos, int naranjas) {
	this.naranjas = naranjas;
	this.mangos = mangos;
}



public void imprimir(){
	System.out.println(mangos);
	System.out.println(naranjas);
}
}
