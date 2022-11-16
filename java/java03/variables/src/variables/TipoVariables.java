package variables;

public class TipoVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//byte, short, int, long
		byte numeroB=127;
	
		System.out.println("tamaño de un byte " + Byte.SIZE);
		System.out.println("valor máximo "+ Byte.MAX_VALUE);
		System.out.println ("valor mínimo "+ Byte.MIN_VALUE);
		
		System.out.println("<-------------------------------->");
		
		int entero=5;
		System.out.println("tamaño de un entero" + Integer.BYTES);
		System.out.println("tamaño "+ Integer.SIZE);
		System.out.println("valor max "+ Integer.MAX_VALUE);
		System.out.println("valor min " + Integer.MIN_VALUE);
		System.out.println("el valor de un entero" + entero);
		
		System.out.println("-----------SHORT----------");
		short variableS=6;
		System.out.println("tamaño de short "+ Short.SIZE);
		System.out.println("tamaño bytes short " + Short.BYTES);
		System.out.println("valor max de short " + Short.MAX_VALUE);
		System.out.println("valor min short " + Short.MIN_VALUE);
		
		System.out.println("------LONG---------------");
		long vairbaleL=565;
		System.out.println("tamaño de long "+ Long.SIZE);
		System.out.println("tamaño bytes long " + Long.BYTES);
		System.out.println("valor max de long " + Long.MAX_VALUE);
		System.out.println("valor min long " + Long.MIN_VALUE);
		
		var num =21474836473L;
		System.out.println("esta es la variable var "+ num);
		
		var sistemNum=0xA;
		System.out.println("--> : " + sistemNum);
		
		System.out.println("-----FLOAT, DOUBLE-----");
		System.out.println("tamaño bits de float "+ Float.SIZE);
		System.out.println("tamaño bytes float " + Float.BYTES);
		System.out.println("valor max de float " + Float.MAX_VALUE);
		System.out.println("valor min de float " + Float.MIN_VALUE);
		
		var comaF=100.10F; //se indica con la F al final que la variables es flotante
		
		System.out.println("----------------------------------");
		
		System.out.println("tamaño bits de double "+ Double.SIZE);
		System.out.println("tamaño bytes de double " + Double.BYTES);
		System.out.println("valor max de double " + Double.MAX_VALUE);
		System.out.println("valor min double " + Double.MIN_VALUE);
		
		double comaD= 1000.10D;
		
		System.out.println("--> float " + comaF);
		System.out.println("--> double" + comaD);
		
		System.out.println("------------BOOLEN-----------");
		boolean estado = true; //false
		System.out.println("-->: " + estado);
		System.out.println("--> Boolean false " + Boolean.FALSE);
		System.out.println("--> Boolean true " + Boolean.TRUE);
		
		if (estado) {
			System.out.println("--> soy verdadero");
		} else {
			System.out.println("--> soy falso");
		       }

		var edad=10;
		
		
		if(edad>=10) {
			System.out.println("--> : varBool si edad es mayor igual a 10 es " + edad);
		} else {
			System.out.println("--> : varBool la edad des menor a > " + edad);
		}
		
		System.out.println("------------CHAR--------");
		//char caracter= 'a';
		//char caracter= "halo".charAt(2); //Imprimirá el caracter en la posición 2
		char caracter= '\u0C6A';
		System.out.println("--> " + caracter);

	                                       }

                            }
