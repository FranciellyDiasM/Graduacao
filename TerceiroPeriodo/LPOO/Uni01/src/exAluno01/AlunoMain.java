package exAluno01;

import java.util.Scanner;

public class AlunoMain {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		AlunoVet alunos = new AlunoVet(5);

		int opcao;

		do {
			System.out.println("1. Cadastrar\n" + "2. Imprimir um aluno\n" + "3. Imprimir todos os alunos\n"
					+ "4. Alterar nota1\n" + "5. Alterar nota2\n" + "6. Sair.\n");

			opcao = entrada.nextInt();
			entrada.nextLine();
			switch (opcao) {
			case 1:
				cadastrarAluno(entrada, alunos);
				break;
			case 2:
				imprimirAluno(entrada, alunos);
				break;
			case 3:
				imprimirTodos(alunos);
				break;
			case 4:
				alterarNota1(entrada, alunos);
				break;
			case 5:
				alterarNota2(entrada, alunos);
				break;
			case 6:
				System.out.println("Sair do programa.\n");
				break;
			default:
				System.out.println("Opção Inválida.\n");
			}

		} while (opcao != 6);

	}

	private static void cadastrarAluno(Scanner entrada, AlunoVet alunos) {
		
		if(alunos.estaCheio()) {
			System.out.println("A lista de aluno está cheia.\n");
		} else {
			System.out.println("Informe o nome do Aluno: \n");
			String nome = entrada.nextLine();
			System.out.println("Informe a matricula: \n");
			int matricula = entrada.nextInt();
			
			Aluno aluno = new Aluno(nome, matricula);
			alunos.cadastrarAluno(aluno);
			System.out.println("Cadastrou com sucesso.\n");
		}
	}

	private static void imprimirAluno(Scanner entrada, AlunoVet alunos) {
		System.out.println("Informe o nome do aluno: \n");
		String nome = entrada.nextLine();
		Aluno aluno = alunos.buscarNome(nome);

		if (aluno != null) {
			System.out.println(aluno.getDescricaoReduzida());
		} else {
			System.out.println("Aluno não cadastrado.\n");
		}
	}

	private static void imprimirTodos(AlunoVet alunos) {
		alunos.imprimirTodos();
	}

	private static void alterarNota1(Scanner entrada, AlunoVet alunos) {
		System.out.println("Qual o aluno para adicionar a nota 1:\n");
		String nome = entrada.nextLine();
		System.out.println("Informe a nota 1:\n ");
		double nota1 = entrada.nextDouble();

		Aluno aluno = alunos.buscarNome(nome);

		if (aluno != null) {
			aluno.setNota1(nota1);
			System.out.println("Alterado a nota1 do " + aluno.getNome() + " Para: " + aluno.getNota1());
		} else {
			System.out.println("Aluno não cadastrado.\n");
		}

	}

	private static void alterarNota2(Scanner entrada, AlunoVet alunos) {
		System.out.println("Qual o aluno para adicionar a nota 2:\n");
		String nome = entrada.nextLine();
		System.out.println("Informe a nota 2:\n ");
		double nota2 = entrada.nextDouble();

		Aluno aluno = alunos.buscarNome(nome);

		if (aluno != null) {
			aluno.setNota2(nota2);
			System.out.println("Alterado a nota2 do " + aluno.getNome() + " Para: " + aluno.getNota2());
		} else {
			System.out.println("Aluno não cadastrado.\n");
		}

	}

}
