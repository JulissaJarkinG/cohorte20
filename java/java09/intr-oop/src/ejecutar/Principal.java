package ejecutar;

import clases.Animal;
import clases.MiClase;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	MiClase mc= new MiClase();
		//mc.metodo();
		
		Animal miAnimal= new Animal("Falco", "perro");
		miAnimal.setEdad(3);
		System.out.print("El nombre es: " + miAnimal.getNombre());
		System.out.print(", tiene " + miAnimal.getEdad() + " años");
		System.out.println(" y es un " + miAnimal.getRaza());
		
		Animal otroAnimal = new Animal ("Pulgas","otra");
	
		otroAnimal.setEdad(5);
		
		System.out.println("El nuevo animal es: " + otroAnimal.getNombre());
		System.out.println("su edad es: " + otroAnimal.getEdad());
		
	}

}

