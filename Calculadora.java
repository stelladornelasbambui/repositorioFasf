
public class Calculadora {
	public double somar(double num1, double num2) {
		return num1+num2;
		// soma
	}
	
	public double subtracao(double num1, double num2) {
		return num1-num2;
		
	}
	
	public boolean validarNome( String nome) {
		return nome.matches("^[\\p{L}+$");
	}
	
	

}

