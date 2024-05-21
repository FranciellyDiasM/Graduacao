package appTutoria;

public class Alertas {

	private String id;
	private String usuarioId;
	private String tipo; // exemplo: "aula_agendada", "pagamento_recebido"
	private String mensagem;
	private String dataHora;

	public Alertas(String id, String usuarioId, String tipo, String mensagem, String dataHora) {
		super();
		this.id = id;
		this.usuarioId = usuarioId;
		this.tipo = tipo;
		this.mensagem = mensagem;
		this.dataHora = dataHora;
	}

	public String getId() {
		return id;
	}

	public String getUsuarioId() {
		return usuarioId;
	}

	public String getTipo() {
		return tipo;
	}

	public String getMensagem() {
		return mensagem;
	}

	public String getDataHora() {
		return dataHora;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setUsuarioId(String usuarioId) {
		this.usuarioId = usuarioId;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public void setDataHora(String dataHora) {
		this.dataHora = dataHora;
	}

}
