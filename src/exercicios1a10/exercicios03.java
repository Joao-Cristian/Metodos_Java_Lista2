package exercicios1a10;

public class exercicios03 {
	public static double CalcularAreaRetangulo(double largura, double altura) {
		return largura * altura;		
	}
	public static void main(String[] args) {
		double areaRetangulo = CalcularAreaRetangulo(10, 20);
		
		System.out.println("A area do retangulo e de: " + areaRetangulo);
	}
}	