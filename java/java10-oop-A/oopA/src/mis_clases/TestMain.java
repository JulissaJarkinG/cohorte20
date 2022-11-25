package mis_clases;

import mis_clases.clase_2.Clase_2;
import mis_clases.clases_publicas.Clase_3;

public class TestMain {
	public static void main(String[] args) {
		Clase_3 nc3= new Clase_3();
		nc3.setValor(14689);
		
		//ClasePadre cp = new ClasePadre();
		Clase_2 c2 = new Clase_2(23,"a","b");
		c2.visualizar();
		c2.visualizar2();
	}

}
