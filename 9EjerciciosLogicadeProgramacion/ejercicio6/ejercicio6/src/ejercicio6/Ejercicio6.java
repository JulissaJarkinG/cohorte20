package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		
		String palabra;
		String invertir="";
		
		System.out.println("Ingrese una palabra");
		palabra= s.nextLine();
		
		for (int i = palabra.length()-1; i>=0; i--) {
			invertir += palabra.charAt(i);
			
		}
		System.out.println(invertir);
	
	}

}
