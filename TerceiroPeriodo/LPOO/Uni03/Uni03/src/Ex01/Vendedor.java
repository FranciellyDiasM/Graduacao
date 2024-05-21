package Ex01;

public class Vendedor {
	private String nome;
	private static double salarioBase = 1500;
	private double totalVendas;
	private int tempoServico;
	private char categoria;

	public Vendedor(String nome, double totalVendas, int tempoServico, char categoria) {
		this.nome = nome;
		this.totalVendas = totalVendas;
		this.tempoServico = tempoServico;
		this.categoria = categoria;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public static double getSalarioBase() {
		return salarioBase;
	}

	public static void setSalarioBase(double salarioBase) {
		Vendedor.salarioBase = salarioBase;
	}

	public double getTotalVendas() {
		return totalVendas;
	}

	public void setTotalVendas(double totalVendas) {
		this.totalVendas = totalVendas;
	}

	public int getTempoServico() {

		return tempoServico;
	}

	public void setTempoServico(int tempoServico) {
		this.tempoServico = tempoServico;
	}

	public char getCategoria() {
		return categoria;
	}

	public void setCategoria(char categoria) {
		this.categoria = categoria;
	}

	public void atualizarCategoria() {
		if (getTempoServico() > 60) {
			setCategoria('A');
		} else  if (getTempoServico() >= 30 && getTempoServico() <= 60) {
			setCategoria('B');

		} else {
			setCategoria('C');
		}

	}

	public String toString() {
		return "Vendedor [nome=" + nome + ", totalVendas=" + totalVendas + ", tempoServico=" + tempoServico
				+ ", categoria=" + categoria + "]";
	}

}
