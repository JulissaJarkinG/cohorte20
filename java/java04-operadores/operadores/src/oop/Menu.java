package oop;

import java.util.Scanner;

public class Menu {
Scanner s= new Scanner(System.in);
int menuOp() {
	
	int numero=0;
	System.out.println("\t\t ------ Menu Principal ---------");
    System.out.println("1: Tablas de multiplicar" );
    System.out.println("2: Operaciones Aritméticas" );   
    System.out.println("3: P");
    System.out.println("4: D¿");
    System.out.println("5: M");
    System.out.println("6: B");
    System.out.println("7: Salir");
    System.out.println("Introduce un valor del menú:" );
     return numero= s.nextInt();
}
int subMenuOp() {
	
	int numero=0;
	System.out.println("\t\t ------ Menu Operaciones Aritméticas");
    System.out.println("1: Suma" );
    System.out.println("2: Resta" );   
    System.out.println("3: Producto");
    System.out.println("4: División");
    System.out.println("5: Modulo");
    System.out.println("6: Boolean");
    System.out.println("7: Salir");
    System.out.println("Introduce un valor del menú:" );
     return numero= s.nextInt();
}

}
