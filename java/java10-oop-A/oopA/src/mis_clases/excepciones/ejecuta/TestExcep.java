package mis_clases.excepciones.ejecuta;

import mis_clases.excepciones.operacion.Division;
import mis_clases.excepciones.operacion.OpExcp;

public class TestExcep {
	public static void main(String[] args) {
		try {
			Division d= new Division(4,0);
			d.visualizarD();
	
			
		} catch(OpExcp e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		
		}
		System.out.println("continua...");
	}

}
