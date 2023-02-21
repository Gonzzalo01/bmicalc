package bmicalc;

public class BMICalcImpl implements BMICalc {

	public double bmi(double mass, double height) {
		double imc = 0;
		if (mass <= 0 || height <= 0) {

			throw new RuntimeException("Dichos datos no pueden ser menor que cero");

		}
		if (mass >= 500 || height >= 2.60) {

			throw new RuntimeException("Dichos datos no pueden ser tan grandes");
		} else {
			double h2 = Math.pow(height, 2);
			imc = mass / h2;

		}

		return imc;
	}

	public String category(double bmi) {
		String Cat = null;
		if (bmi <= 0 || bmi >= 50) {
			throw new RuntimeException("The BMI value is not real");
		} else {

			if (bmi < 18.5) {
				Cat = ("UNDERWEIGHT");
			}
			if (18.5 <= bmi && bmi < 25) {
				Cat = ("NORMAL");
			}
			if (25 <= bmi && bmi < 30) {
				Cat = ("OVERWEIGHT");
			}
			if (bmi >= 30.0) {
				Cat = ("OBESE");
			}
		}
		return Cat;

	}

	public boolean abdominalObesity(double waistCircumference, char gender) {

		boolean obeso = false;

		if (waistCircumference >= 90 && gender == 'M') {
			obeso = true;
		}
		if (waistCircumference >= 80 && gender == 'F') {
			obeso = true;
		}

		return obeso;
	}

}
