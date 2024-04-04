package avulsos;

public class Carro {
	private String modelo;
	private int ano;
	private int numeroChassi;
	

	@Override
	public String toString() {
		return "Carro [modelo=" + modelo + ", ano=" + ano + ", numeroChassi=" + numeroChassi + "]";
	}

	public int getNumeroChassi() {
		return numeroChassi;
	}

	public void setNumeroChassi(int numeroChassi) {
		this.numeroChassi = numeroChassi;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

}
