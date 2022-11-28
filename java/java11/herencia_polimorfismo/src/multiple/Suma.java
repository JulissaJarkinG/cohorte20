package multiple;

public class Suma implements OperacionesAritmeticas, Operaciones{
	private double a;
	private double b;

	public Suma(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}

	@Override
	public void mensajes() {
		// TODO Auto-generated method stub
		System.out.println("Hola soy la suma");
		
	}

	@Override
	public double sumar() {
		// TODO Auto-generated method stub
		return a + b;
	}

	@Override
	public double restar() {
		// TODO Auto-generated method stub
		return 0;
	}

}
