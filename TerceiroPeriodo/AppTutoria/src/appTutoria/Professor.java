package appTutoria;

public class Professor extends Usuario {

	public Professor(String nome, String email, String senha) {
		super(nome, email, senha);
	}

	private String areaEspecializacao;
	private String qualificacoes;
	private String disponibilidade;

	public Professor(String nome, String email, String senha, String areaEspecializacao, String qualificacoes,
			String disponibilidade) {
		super(nome, email, senha);
		this.areaEspecializacao = areaEspecializacao;
		this.qualificacoes = qualificacoes;
		this.disponibilidade = disponibilidade;
	}

	public String getAreaEspecializacao() {
		return areaEspecializacao;
	}

	public String getQualificacoes() {
		return qualificacoes;
	}

	public String getDisponibilidade() {
		return disponibilidade;
	}

	public void setAreaEspecializacao(String areaEspecializacao) {
		this.areaEspecializacao = areaEspecializacao;
	}

	public void setQualificacoes(String qualificacoes) {
		this.qualificacoes = qualificacoes;
	}

	public void setDisponibilidade(String disponibilidade) {
		this.disponibilidade = disponibilidade;
	}

	@Override
	public String toString() {
		return "Professor [areaEspecializacao=" + areaEspecializacao + ", qualificacoes=" + qualificacoes
				+ ", disponibilidade=" + disponibilidade + "]";
	}

}
