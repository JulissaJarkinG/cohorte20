package mis_clases.excepciones.operacion;

public class Division {
private int numerador;
private int denominador;
public Division(int numerador, int denominador) throws OpExcp{
	if(denominador==0){
		throw new OpExcp("El denominador es cero");
	}
	this.numerador = numerador;
	this.denominador = denominador;
	
}
public void visualizarD() {
	System.out.println("Resultado de la division " + this.numerador/this.denominador);
}

}
