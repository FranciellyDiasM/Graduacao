package exAluno01;

public class Aluno {
	
	private String nome;
	private int matricula;
	private double nota1;
	private double nota2;
	
	
	
	public Aluno(String nome, int matricula) {
		this.nome = nome;
		this.matricula = matricula;
		this.nota1 = 0;
		this.nota2 = 0;
	}

	public Aluno(String nome, int matricula, double nota1, double nota2) {
		this.nome = nome;
		this.matricula = matricula;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}
	
	public Aluno() {
		this.nome = "";
		this.matricula = 0;
		this.nota1 = 0;
		this.nota2 = 0;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	
	public boolean compareTo (Aluno outroAluno) {
		return this.nome.equalsIgnoreCase(outroAluno.getNome());
		
	}

	public String toString() {
		return "Aluno [nome= " + nome + ", matricula= " + matricula + ", nota1= " + nota1 + ", nota2= " + nota2 + "]";
	}
	
	
}
