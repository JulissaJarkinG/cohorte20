package multiple;

public class TestMultiple {
	public static void main(String[] args) {
		Suma suma= new Suma(5,5);
		OperacionesAritmeticas oa= new Suma (10,5);
		Operaciones o = new Suma (3,2);
		System.out.println("Obj oa: 0" + oa.sumar());
		System.out.println("La suma es: "+ suma.sumar());
		
		Resta resta= new Resta(10,5);
		OperacionesAritmeticas oar= new Resta(10,5);
		Operaciones or = new Resta(3,2);
		
		o.mensajes();
		System.out.println("Obj oa: " + oa.sumar());
		System.out.println("La suma es: " + suma.sumar());
		suma.mensajes();
		
		resta.mensajes();
		System.out.println("La resta es: " + resta.restar());
		System.out.println("obj oar" + oar.restar());
		or.mensajes();
	
}
}
