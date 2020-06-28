package br.com.home.app.financeiro;

public class Calc1Impl implements ICalculadora{

	@Override
	public double somar(double... nums) {
		
		double total = 0;
		
		for(int i = 0; i < nums.length; i++) {
			total += nums[i];
		}
		return total;
	}

}
