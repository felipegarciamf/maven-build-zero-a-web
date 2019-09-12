package br.com.alura.maven;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class CalculadoraTest extends TestCase {

	static Calculadora cubico = new CalculoCubico();
	static Calculadora raiz = new CalculoRaiz();
	MotorCalculadora calcula = new MotorCalculadora();
	
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public CalculadoraTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(CalculadoraTest.class);
	}

    
    /**
     * Rigourous Test :-)
     * @throws Exception 
     */
    public void testRaiz() throws Exception {
    	assertEquals(1.0, calcula.calculaValor(raiz, 1));
    }
    
    public void testErroRaiz() throws Exception {
    	assertNotSame(124, calcula.calculaValor(raiz,1));
    }
    
    public void testErroNegativoRaiz() throws Exception {
    	assertNotSame(0, calcula.calculaValor(raiz, -1));
    }
    
    
    public void testCubico() throws Exception {
    	assertEquals(2.154434690031884, calcula.calculaValor(cubico,10));
    }
    
    public void testErroCubico() throws Exception {
    	assertNotSame(12, calcula.calculaValor(cubico,10));
    }
    
    public void testErroNegativoCubico() throws Exception {
    	assertEquals(0.0, calcula.calculaValor(cubico,-10));
    }

}
