package bmicalc;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Iterator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BMICalcTest {
	final double[] ListValLimit2 = { 0, 50, 51 };
	final double[] ListValNor = { 16, 19.5, 27, 33 };
	final double[] ListValLimit = { 17.5, 24.99, 29.99, 30 };
	final String[] CategoriaIMC = { "UNDERWEIGHT", "NORMAL", "OVERWEIGHT", "OBESE" };
	final double[] bmiListMass1 = {};
	BMICalcImpl Ej = new BMICalcImpl();

	@Test
	public void bmi() {
		assertEquals(true, true);
	}

	@Test

	public void catValNormalesTest() {
		for (int i = 0; i < ListValNor.length; i++) {
			String c = (CategoriaIMC[i]);

			assertEquals(c, Ej.category(ListValNor[i]));
		}
	}

	@Test
	public void catValLimite() {
		for (int i = 0; i < ListValNor.length; i++) {
			String c = (CategoriaIMC[i]);

			assertEquals(c, Ej.category(ListValLimit[i]));
		}

	}

	@Test
	public void cateLimit2() {
		for (int i = 0; i < ListValLimit2.length; i++) {
			try {
				Ej.category(ListValLimit2[i]);
				fail();
			} catch (RuntimeException exce) {

			} catch (Exception exce) {
				fail();
			}
		}

	}

	@Test
	public void bmiTest() {
		double[] ListM = { 23, 45, 78 };
		double[] ListH = { 1.75, 1.20, 1.80 };
		for (int i = 0; i < ListH.length; i++) {
			double h = Math.pow(ListH[i], 2);
			double imc= ListM[i]/h;
			assertEquals(imc,Ej.bmi(ListM[i], ListH[i]));
		}
	}
	
	@Test
	public void bmiLimitTest1() {
		double [] ListM= {-1,-1,0,0,0,0,-1,10};
		double [] ListH= {-1,10,0,1,-1,10,0,0};
		for (int i = 0; i < ListH.length; i++) {
			try {
				Ej.bmi(ListM[i],ListH[i]);
				fail();
			}catch (RuntimeException Exc){
				
			}catch(Exception Exc) {
				fail();
			}
		}
		
	}
	public void bmiLimitTest2() {
		double [] ListM= {500,500,501,499,499};
		double [] ListH= {2.60,2.59,2.59,2.60,2.61};
		for (int i = 0; i < ListH.length; i++) {
			try {
				Ej.bmi(ListM[i],ListH[i]);
				fail();
			}catch (RuntimeException Exc){
				
			}catch(Exception Exc) {
				fail();
			}
		}
	}
	
}
