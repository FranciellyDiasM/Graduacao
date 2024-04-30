package Rev04;

public class Autonomo extends Trabalhador {

	@Override
	public double calcularRendimentoAnual() {
		double salarioAnual = this.getSalario() * 12;

		return salarioAnual;
	}

}
