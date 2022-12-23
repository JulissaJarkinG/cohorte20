package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {
public static void main(String[] args) {
	Scanner s = new Scanner (System.in);
	String dia;
    System.out.print("Introduce un día de entre semana (de lunes a viernes): ");
     dia= s.nextLine();
    int diaNum = 0;

    switch(dia) {
      case "lunes":
        diaNum = 0;
        break;
      case "martes":
        diaNum = 1;
        break;
      case "miércoles":
        diaNum = 2;
        break;
      case "jueves":
        diaNum = 3;
        break;
      case "viernes":
        diaNum = 4;
        break;
      default:
        System.out.print("El día introducido no es válido");
    }
    
    System.out.println("A continuación introduzca la hora exacta");
    
    System.out.print("Hora: ");
    int hrs = Integer.parseInt(s.nextLine());
    
    System.out.print("Minutos: ");
    int min =Integer.parseInt(s.nextLine());
    
    int minTotales = (5760) + (900);
    int minActuales = (diaNum * 24 * 60) + (hrs* 60) + min;
    
    System.out.print("Faltan " + (minTotales - minActuales) + " minutos para llegar al fin de semana.");
}

}
