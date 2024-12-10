package exercicios1a10;

public class exercicios08 {
	public static double ConverterCelsiusParaFahrenheit(double celsius) {
		double fahrenheit = (celsius * 9/5) + 32;
		return fahrenheit;
	}
	
	public static void main(String[] args) {
		double temperaturaFehrenheit =ConverterCelsiusParaFahrenheit(10);
		
		System.out.println("A temperatura em Fahrenheit e: " + temperaturaFehrenheit);
	}	
}