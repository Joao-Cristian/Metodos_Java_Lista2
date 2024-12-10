package exercicios1a10;

public class exercicios09 {
	public static String InverterString(String string) {
		String invertida = "";
		
		for (int i = string.length() - 1; i >= 0; i--) {
			invertida += string.charAt(i);
		}
		return invertida;
	}
	
	public static void main(String[] args) {
		String resultado = InverterString("Onibus");
		
		System.out.println("A string invertida e: " + resultado);
	}
}	