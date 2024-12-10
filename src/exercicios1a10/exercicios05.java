package exercicios1a10;

public class exercicios05 {
	public static int ObterNumeroMenor(int primeiroNumero, int segundoNumero, int terceiroNumero) {
		int menor = primeiroNumero;
		
		if(segundoNumero < menor) {
			menor = segundoNumero;
		}
		
		if (terceiroNumero < menor) {
			
			menor = terceiroNumero;
		}
		return menor;
	}
	
	public static void main(String[] args) {
		int numeroMenor = ObterNumeroMenor(15, 8, 10);
		
		System.out.println("O numero menor �: " + numeroMenor);
	}
}