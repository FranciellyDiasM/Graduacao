package AppCarro;

public class CarroVip extends Carro{
	
	
	private static double diaria = 350.00;

	public CarroVip(int codigo, String modelo) {
		super(codigo, modelo);
	}
	
	@Override
	public double getDiaria() {
		return diaria;
	}
	
	

}
