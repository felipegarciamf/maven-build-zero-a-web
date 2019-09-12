package br.com.alura.maven;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class ValidadorCpfTest extends TestCase  {

	
	ValidadorCPF valida = new ValidadorCPF();
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public ValidadorCpfTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(ValidadorCpfTest.class);
	}
	
	 /**
     * Rigourous Test :-)
     */
    public void testCpf() {
    	assertEquals(true, valida.isCPF("22873582855"));
    }
    
    public void testCpfErro() {
    	assertNotSame(true, valida.isCPF("22873582835"));
    }
    
   public void testImprimeFormatado() {
    	assertEquals("401.735.868-30", valida.imprimeCPF("40173586830"));
    }
   
   public void testImprimeErroSemTraco() {
	   assertNotSame("401.735.868.30", valida.imprimeCPF("40173586830"));
   }
   
   public void testCpfSemPontuacao() {
	   assertEquals("40173586830", ValidadorCPF.formataPontuacao("401.735.868.30"));
   }
			
			
}
