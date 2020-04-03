package romanos;

public class EscribaRomano {

	private String[] simbolos = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
	private int[] valores = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
	
	public String copiar(int numero) {

		String romano = "";
		
		for (int i = 0; i < simbolos.length; i++) {
			
			romano = romano + concatenar(simbolos[i], numero / valores[i]);
			numero = numero % valores[i];
		}
		
		return romano;
	}
	
	private String concatenar(String simbolo, int cantidad) {
		
		String cadena = "";
		
		for (int i = 0; i < cantidad; i++) {
			
			cadena = cadena + simbolo;
		}
		
		return cadena;
	}
}
