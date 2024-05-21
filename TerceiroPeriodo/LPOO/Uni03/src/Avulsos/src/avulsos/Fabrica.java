package avulsos;

public class Fabrica {
	private static int numeroChassi= 1;
	
	public static int geraNumeroChassi() {
		int num = numeroChassi;
		numeroChassi = numeroChassi + 1;
		return num;
		
	}
	
	public static int getNumeroChassi() {
		return numeroChassi;
		
	}

}
