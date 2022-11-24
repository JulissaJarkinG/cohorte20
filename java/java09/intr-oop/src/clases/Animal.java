package clases;

public class Animal {
	
	private String raza;
	private String nombre;
	private int edad;

	public Animal(String nombre, String raza) {
	
		this.nombre= nombre;
		this.raza=raza;
		
		
	}

	public String getNombre() {
		return nombre;
	}
	public String getRaza() {
		return raza;
	}


	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

}
