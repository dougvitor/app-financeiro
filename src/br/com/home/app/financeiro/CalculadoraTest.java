package br.com.home.app.financeiro;

import br.com.home.app.calculo.Calculadora;

public class CalculadoraTest {
	
	public static void main(String[] args) {
		
		Calculadora calc = new Calculadora();
		System.out.println(calc.soma(2,3,4));
	}

}
