package br.com.alura.maven;

public class CalculoRaiz implements Calculadora{

	public double calculo(double valor)  {
			if (ePostivio(valor)) return Math.sqrt(valor);
			 else return 0;
	}

	public boolean ePostivio(double valor) {
		if(valor < 0) {
			return false;
		}
		return true;
	}
	
	

}
