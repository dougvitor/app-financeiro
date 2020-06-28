package br.com.home.app.financeiro;

import java.lang.reflect.Field;

import br.com.home.app.calculo.Calculadora;
import br.com.home.app.calculo.interno.OperacoesAritmeticas;

public class CalculadoraTest {
	
	public static void main(String[] args) {
		
		Calculadora calc = new Calculadora();
		System.out.println(calc.soma(2,3,4));
		
		OperacoesAritmeticas op = new OperacoesAritmeticas();
		System.out.println(op.soma(4,5,6));
		
		try {
			
			Field fieldId = Calculadora.class.getDeclaredField("id");
			fieldId.setAccessible(true);
			fieldId.set(calc, "def");
			System.out.println(fieldId.get(calc));
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		ICalculadora c1 = new Calc1Impl();
		ICalculadora c2 = new Calc2Impl();
		
		System.out.println(c1.somar(1,2,3));
		System.out.println(c2.somar(1,2,3));
		
	}

}
