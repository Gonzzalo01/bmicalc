package bmicalc;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Iterator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BMICalcTest {
	final double[] ListValLimit2= {0,50,51};
	final double[] ListValNor = { 16, 19.5, 27, 33 };
	final double[] ListValLimit = { 17.5, 24.99, 29.99, 30 };
	final String[] CategoriaIMC = { "UNDERWEIGHT", "NORMAL", "OVERWEIGHT", "OBESE" };
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
			}
			catch(RuntimeException exce){
				
			}
			catch(Exception exce) {
				fail();
			}
		}
	}
}
