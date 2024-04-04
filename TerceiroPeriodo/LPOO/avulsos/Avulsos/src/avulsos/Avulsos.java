package avulsos;

public class Avulsos {
	
	public static void main(String[] args) {
		Carro veiculo = new Carro();
		
		veiculo.setModelo("corsa");
		veiculo.setAno(1987);
		veiculo.setNumeroChassi(Fabrica.geraNumeroChassi());
		
		Carro veiculo2 =  new Carro();
		
		veiculo2.setModelo("palio");
		veiculo2.setAno(1988);
		veiculo2.setNumeroChassi(Fabrica.geraNumeroChassi());
		
		System.out.println("O numero do chassi do corsa é  "+ veiculo.getNumeroChassi());
		System.out.println("O numero do chassi do palio é   "+ veiculo2.getNumeroChassi());
		System.out.println("proximo n " + Fabrica.getNumeroChassi());
		
		System.out.println("proximo n " + Fabrica.getNumeroChassi());
		
	}
	
}
