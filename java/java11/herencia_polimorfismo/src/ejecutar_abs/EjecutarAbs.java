package ejecutar_abs;


import polimorfismo.*;
import polimorfismo.FigurasGeometricas;


public class EjecutarAbs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FigurasGeometricas t= new Triangulo();
		FigurasGeometricas c= new Cuadrado();
		FigurasGeometricas cir= new Circulo();
		FigurasGeometricas r= new Rectangulo();
		//Llamar a Triangulo
		t.pedirDatos();
		t.area();
		t.visualizar();
		//Llamar Cuadrado
		c.pedirDatos();
		c.area();
		c.visualizar();
		//Llamar a cir
		cir.pedirDatos();
		cir.area();
		cir.visualizar();
		//Llamar a Rectangulo
		r.pedirDatos();
		r.area();
		r.visualizar();
		
		
	}

}
