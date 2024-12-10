package exercicios1a10;

public class exercicios06 {
	public static boolean EhPrimo(int numero) {
		if (numero < 2) {
			return false;
		}
		
		for (int i = 2; i <= Math.sqrt(numero); i++) {
			if (numero % i == 0) {
				return false;
			}
		}
	
		return true;
	
	}
	
	public static void main(String[] args) {
		boolean resultado = EhPrimo(7);
		
		if (resultado) {
			System.out.println("O numero e primo.");
		} else {
			System.out.println("O numero nao e primo.");
		}

	}
	
	
}
