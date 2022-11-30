package com.generation.pruebasUnitarias;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

public class CalculadoraTests {
	Calculadora calc = new Calculadora(true);
//creando test unitario
	@Test
	@DisplayName ("Metodo que prueba si la suma es corrercta ")
	void pruebaSuma() {
//		Calculadora calc = new Calculadora(true);
		assertEquals(4,calc.suma(2, 2),"Deberia ser 4");
	}
	@Test
	@DisplayName("Probar si la calculadora esta prendida")
	void pruebaIsOn() {
//		Calculadora calc = new Calculadora(true);
		assertTrue(calc.isOn());
	}
	@Test
	@DisplayName("Pruba de divicion")
	void pruebaDiv() {
		assertEquals(2.5,calc.division(5, 2));
		
	}

}
