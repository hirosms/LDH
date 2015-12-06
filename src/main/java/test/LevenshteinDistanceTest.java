package test;


import src.LevenshteinDistance;
import org.junit.*;
import static org.junit.Assert.*;


public class LevenshteinDistanceTest {
	
	String str1 = "Amor";
	String str2 = "Amar";
	
        /**
         * Función que crea un mensaje que será ejecutado antes de cada uno de los test, gracias a la clausula @Before
         */
	@Before
	public void setUp()
	{
		System.out.print("Comienza el test: ");
	}
        
	/**
         * Prueba para saber si se realiza correctamente la creación del objeto.
         */
	@Test
	public void TestCreaObjeto() {
		System.out.println("Creación correcta Objeto");
		System.out.println("EL Objeto ha sido creado Correctamente\n");

		assertNotNull("EL Objeto ha sido creado Correctamente",new LevenshteinDistance());
	}
	
        /**
         *  Comprueba si realmente dos valores distintos, el algoritmo los reconoce como tal
         */
	@Test
	public void TestSonDistintos() {
		
		System.out.println("Son Distintos");
		System.out.println("\""+str1+"\" y \""+str2+"\" se diferencian en:  1\n");
		assertEquals("\""+str1+"\" y \""+str2+"\" se diferencian en: ", 1, 
					LevenshteinDistance.computeLevenshteinDistance(str1,str2));
	}
	
        /**
         *  Comprueba si realmente dos valores iguales, el algoritmo los reconoce como tal
         */
	@Test
	public void TestSonIguales() {
		
		System.out.println("Son Iguales");
		System.out.println("\""+str1+"\" y \""+str1+"\" no se diferencian\n");
		assertNotEquals("\""+str1+"\" y \""+str1+"\" son iguales", 1, LevenshteinDistance.computeLevenshteinDistance(str1,str1));
	}


}
