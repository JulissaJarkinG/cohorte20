package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] n = new int[10];
		    int[] primo = new int[10];
		    int[] noPrimo = new int[10];
		    int i;
		    int j;
		    int primos = 0;
		    int noPrimos = 0;
		    boolean esPrimo = false;
		    Scanner s = new Scanner(System.in);
		    System.out.println("Introduzca 10 números:");

		    for (i = 0; i < 10; i++) {
		      n[i] = Integer.parseInt(s.nextLine());
		
		      esPrimo = true;
		      for (j = 2; j < n[i] - 1; j++) {
		        if (n[i] % j == 0) {
		          esPrimo = false;
		        }
		      }
		      
		      if (esPrimo) {
		        primo[primos++] = n[i];
		      } else {
		        noPrimo[noPrimos++] = n[i];
		      }
		    }
		    
		    System.out.println("\n\nArray original:");
		    
		    System.out.print(" Posicion ");
		    for (i = 0; i < 10; i++) {
		      System.out.print( i+ ",");
		    }
		   
		    System.out.print(" Valor  ");
		    for (i = 0; i < 10; i++) {
		    	System.out.print( n[i]+",");
		    }
		  
		    for (i = 0; i < primos; i++) {
		      n[i] = primo[i];
		    }
		    
		    for (i = primos; i < primos + noPrimos; i++) {
		      n[i] = noPrimo[i - primos];
		    }

		    System.out.println("\n\n primos al principio:");
		    
		    System.out.print("Posicion ");
		    for (i = 0; i < 10; i++) {
		      System.out.print( i+",");
		    }
		 
		    System.out.print("Valor  ");
		    for (i = 0; i < 10; i++) {
		        System.out.print( n[i]+",");
		    }
	}

}
