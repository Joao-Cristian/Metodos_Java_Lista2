package exercicios1a10;

public class exercicios10 {
	public static double CalcularHipotenusa(double cateto1, double cateto2) {
		double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
		
		return hipotenusa;
	
	}
	public static void main(String[] args) {
		double hipotenusa = CalcularHipotenusa(5, 8);
		System.out.println("A hipotenusa �: " + hipotenusa);

	}
}	