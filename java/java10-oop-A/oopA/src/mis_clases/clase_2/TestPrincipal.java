package mis_clases.clase_2;

public class TestPrincipal {
	
	
	public static void main(String[] args) {
		ClasePadre cp= new ClasePadre(14689, "Hola");
		cp.visualizar();
		Clase_2 c2 = new Clase_2(2357, "Adios", "clase2");
		c2.visualizar();
		c2.visualizar2();

	}
	
}
