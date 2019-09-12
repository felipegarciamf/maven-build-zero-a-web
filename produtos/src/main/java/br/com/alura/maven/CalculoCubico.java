package br.com.alura.maven;

public class CalculoCubico implements Calculadora{

	public double calculo(double valor)  {
		if (ePostivio(valor)) return Math.cbrt(valor);
		else return 0;
	}

	public boolean ePostivio(double valor) {
		if(valor < 0) {
			return false;
		}
		return true;
	}




}
