package appTutoria;

public class Aula {

	private String id;
	private Professor professor;
	private Aluno aluno;
	private String dataHora;
	private String modoDeAula; // online, presencial, gravada
	private double preco;

	public Aula(String id, Professor professor, Aluno aluno, String dataHora, String modoDeAula, double preco) {
		super();
		this.id = id;
		this.professor = professor;
		this.aluno = aluno;
		this.dataHora = dataHora;
		this.modoDeAula = modoDeAula;
		this.preco = preco;
	}

	public String getId() {
		return id;
	}

	public Professor getProfessor() {
		return professor;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public String getDataHora() {
		return dataHora;
	}

	public String getModoDeAula() {
		return modoDeAula;
	}

	public double getPreco() {
		return preco;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public void setDataHora(String dataHora) {
		this.dataHora = dataHora;
	}

	public void setModoDeAula(String modoDeAula) {
		this.modoDeAula = modoDeAula;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}
