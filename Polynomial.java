public class Polynomial {
	double[] coefficients;
	public Polynomial(){
		coefficients = new double[]{0};
	}
	
	public Polynomial(double[] coefficients){
		this.coefficients = coefficients;
	}
	
	public Polynomial add(Polynomial toAdd){
		int length = Math.max(coefficients.length, toAdd.coefficients.length);
		double[] newCoefficients = new double[length];
		
		for (int i=0; i<length; i++){
			if (i >= coefficients.length) {
				newCoefficients[i] = toAdd.coefficients[i];
			} else if (i >=toAdd.coefficients.length){
				newCoefficients[i] = coefficients[i];
			} else {
				newCoefficients[i] = coefficients[i] + toAdd.coefficients[i];
			}
		}
		return new Polynomial(newCoefficients);
	}
	
	public double evaluate(double num){
		double result = 0;
		for (int i=0; i<coefficients.length; i++){
			result += coefficients[i] * Math.pow(num, i);
		}
		return result;
	}
	
	public boolean hasRoot(double num){
		return evaluate(num) == 0;
	}
}
		
		
	