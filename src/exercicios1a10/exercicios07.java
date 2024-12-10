package exercicios1a10;

import java.util.Random;

public class exercicios07 {
	public static int GerarNumeroAleatorio() {
		Random random = new Random();
		int numero = random.nextInt(100) + 1;
		return numero;
	}
	
	public static void main(String[] args) {

		int numeroAleatorio = GerarNumeroAleatorio();
		System.out.println("O nemero gerado e: " + numeroAleatorio);
		
	}
	
}