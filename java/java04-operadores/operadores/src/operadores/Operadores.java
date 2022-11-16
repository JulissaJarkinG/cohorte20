package operadores;

import java.util.Scanner;

public class Operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		
		int numero=0;
		do {
		 System.out.println("\t\t ------ Menu ---------");
         System.out.println("1: Suma" );
         System.out.println("2: Resta" );   
         System.out.println("3: Producto");
         System.out.println("4: División");
         System.out.println("5: Modulo");
         System.out.println("6: Salir");
         System.out.println("Introduce un valor del menú:" );
          numero= scanner.nextInt();
        
		
		switch(numero) {
		case 1: 
			System.out.println("----Suma-----");
		    System.out.println("Introduce un valor:" );
	        int valorS= scanner.nextInt();
	        System.out.println("Introduce otro valor");
	        int valorS0= scanner.nextInt();
	        int suma=valorS+valorS0;
	        System.out.println("El resultado es: "+ suma);
		break;
		
		case 2:
			System.out.println("----Resta---");
		    System.out.println("Introduce un valor:" );
	        int valorR= scanner.nextInt();
	        System.out.println("Introduce otro valor");
	        int valorR0= scanner.nextInt();
		    int resta = valorR - valorR0;
		    System.out.println("El resultado es: "+ resta);
		break;
		
		case 3: 
			System.out.println("Producto");
		    System.out.println("Introduce un valor:" );
	        int valorP= scanner.nextInt();
	        System.out.println("Introduce otro valor");
	        int valorP0= scanner.nextInt();
		    int producto = valorP * valorP0;
		    System.out.println("El resultado es: "+ producto);
		break;
		
		case 4: 
			System.out.println("Division");
		    System.out.println("Introduce un valor:" );
	        int valorD= scanner.nextInt();
	        System.out.println("Introduce otro valor");
	        int valorD0= scanner.nextInt();
		    int division = valorD/ valorD0;
		    System.out.println("El resultado es: "+ division);
		break;
		
		case 5: 
			System.out.println("Modulo");
		    System.out.println("Introduce un valor:" );
	        int valorM= scanner.nextInt();
	        System.out.println("Introduce otro valor");
	        int valorM0= scanner.nextInt();
	        int modulo= valorM % valorM0;
	        System.out.println("El resultado es: "+ modulo);
	       
		break;
		
		case 6: 
			System.out.println("Bye");
			
			
		default:
			break;
		
		
		}
	
			
		} while(numero !=6);
		
		
		
		
		
                                          }

                               }
