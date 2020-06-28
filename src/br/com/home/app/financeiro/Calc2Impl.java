package br.com.home.app.financeiro;

import java.util.Arrays;

public class Calc2Impl implements ICalculadora{

	@Override
	public double somar(double... nums) {
		return Arrays.stream(nums).reduce(0.0, (total, atual) -> total + atual);
	}

}
