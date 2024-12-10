package exercicios1a10;

public class exercicios04 {
	public static double CalcularPerimetroCirculo(double raio) {
		double perimetro = 2 * Math.PI * raio;
		return perimetro;
	}
	
	public static void main(String[] args) {
		double perimetro = CalcularPerimetroCirculo(12);
		
		System.out.println("O perimetro do circulo e de: " + perimetro);
	}
}