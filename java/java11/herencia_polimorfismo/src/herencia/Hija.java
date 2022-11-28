package herencia;

public class Hija extends Padre {
	
	private int edad;
	private String apellido;
	
///// Constructor
	public Hija(String nombre, String domicilio, int edad) {
		super(nombre, domicilio);
		this.edad = edad;
	}
//// Método
		public void mostrarDatos() {
		System.out.println("El nombre es: " + nombre + 
				" " + "el domicilio es: " + domicilio + 
				" " + "la edad es: " + edad);
	}
		public void mostrarDatos(String apellido) {
			this.apellido=apellido;
			System.out.println("El nombre y el apellildo es: " + nombre + 
					" " + apellido + " el domicilio es: " + domicilio + 
					" " + "la edad es: " + edad);
		}

}
