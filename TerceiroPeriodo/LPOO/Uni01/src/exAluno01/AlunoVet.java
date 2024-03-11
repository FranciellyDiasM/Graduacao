package exAluno01;

import java.util.Iterator;

public class AlunoVet {

	private Aluno[] alunos;
	private int quant = 0;

	public AlunoVet(int tamanho) {
		alunos = new Aluno[tamanho];
	}

	public boolean cadastrarAluno(Aluno aluno) {
		if (quant >= alunos.length) {
			return false;

		} else {
			alunos[quant] = aluno;
			quant = quant + 1;
			return true;
		}

	}

	public Aluno buscarNome(String nome) {
		for (int i = 0; i < quant; i++) {
			if (alunos[i].getNome().equalsIgnoreCase(nome)) {
				return alunos[i];
			}
		}

		return null;
	}

	public void imprimirTodos() {
		for (int i = 0; i < quant; i++) {
			System.out.println(alunos[i].toString());
		}
		
	}

}
