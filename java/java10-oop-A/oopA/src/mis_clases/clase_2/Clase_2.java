package mis_clases.clase_2;

public class Clase_2 extends ClasePadre{
	private String dato1;

	public Clase_2(int valor0, String dato0, String dato1) {
		super(valor0, dato0);
		// TODO Auto-generated constructor stub
		this.dato1= dato1;
	}
	public void visualizar2() {
		System.out.println(dato1);
	}
 
}
