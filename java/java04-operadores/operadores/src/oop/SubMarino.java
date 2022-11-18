package oop;

public class SubMarino {
	//Main temporal
	static void submenu() {
		Menu m= new Menu();
		OperacionesAritmeticas oa= new OperacionesAritmeticas();
		int opcion=m.subMenuOp();
		do {
		switch(opcion) {
		case 1:{
			System.out.println(oa.add());
			break;
		}
		case 2:
		{ System.out.println(oa.sustrac());
			break;
		}
		case 3:{
			System.out.println(oa.producto());
		}
		case 4:{
			System.out.println(oa.divide());
			break;
		}
		case 5: {
			System.out.println(oa.modulo());
			break;
		}
		case 6: {
			System.out.println("Esta es la opción 6");
			break;
		}
		default: break;
		}
		} while (opcion != 7);
	
	}
	//public static void main (String[]args) 
	{
		SubMarino.submenu();
	}
}
