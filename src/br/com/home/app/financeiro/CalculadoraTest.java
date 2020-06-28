package br.com.home.app.financeiro;

import java.lang.reflect.Field;
import java.util.ServiceLoader;
import br.com.home.app.ICalculadora;

public class CalculadoraTest {
	
	public static void main(String[] args) {
		
		ICalculadora calc = ServiceLoader.load(ICalculadora.class).findFirst().get();
		System.out.println(calc.somar(2,3,4));
		
		try {
			
			Field fieldId = calc.getClass().getDeclaredField("id");
			fieldId.setAccessible(true);
			fieldId.set(calc, "def");
			System.out.println(fieldId.get(calc));
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
