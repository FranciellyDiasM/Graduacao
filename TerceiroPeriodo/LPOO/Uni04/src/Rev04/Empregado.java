package Rev04;

public class Empregado extends Trabalhador{
	
	private double valorTicket;
	private String cargo;
	

	@Override
	public double calcularRendimentoAnual() {
		double rendAnual = ((this.getSalario() -( (20.0/100.0 *(getSalario())))) * 13 ) + (valorTicket * 12);
		
		double imposto = 0.2 * this.getSalario(); // 20% do salario
		double salarioMensal = this.getSalario() - imposto;
		double salarioAnual = salarioMensal* 13; // contando com decimo terceiro
		double ticketAnual = valorTicket * 12;
		rendAnual = salarioAnual + ticketAnual;
		
		return rendAnual;
	}


	public double getValorTicket() {
		return valorTicket;
	}


	public void setValorTicket(double valorTicket) {
		this.valorTicket = valorTicket;
	}


	public String getCargo() {
		return cargo;
	}


	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

}
