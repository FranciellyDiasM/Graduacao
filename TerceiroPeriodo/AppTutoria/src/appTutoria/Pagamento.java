package appTutoria;

public class Pagamento {

	private String id;
	private Aula aula;
	private String dataHora;
	private String metodoDePagamento;
	private double valor;

	private String status; // Pendente, Em Processamento, Aprovado, Cancelado

	public Pagamento(String id, Aula aula, String dataHora, String metodoDePagamento, double valor, String status) {
		super();
		this.id = id;
		this.aula = aula;
		this.dataHora = dataHora;
		this.metodoDePagamento = metodoDePagamento;
		this.valor = valor;
		this.status = status;
	}

	public String getId() {
		return id;
	}

	public Aula getAula() {
		return aula;
	}

	public String getDataHora() {
		return dataHora;
	}

	public String getMetodoDePagamento() {
		return metodoDePagamento;
	}

	public double getValor() {
		return valor;
	}

	public String getStatus() {
		return status;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setAula(Aula aula) {
		this.aula = aula;
	}

	public void setDataHora(String dataHora) {
		this.dataHora = dataHora;
	}

	public void setMetodoDePagamento(String metodoDePagamento) {
		this.metodoDePagamento = metodoDePagamento;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
