package exAluno01;

import java.util.Scanner;

public class AlunoMain {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Aluno[] alunos = new Aluno[5];

		int opcao;

		do {
			System.out.println("1. Cadastrar/n" + "2. Imprimir um aluno/n" + "3. Imprimir todos os alunos/n"
					+ "4. Alterar nota1/n" + "5. Alterar nota2/n" + "6. Sair./n");

			opcao = entrada.nextInt();
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
				System.out.println("Sair do programa.");
				break;
			default:
				System.out.println("Opção Inválida.");
			}

		} while (opcao != 6);

	}

	private static void alterarNota2(Scanner entrada, Aluno[] alunos) {

	}

	private static void alterarNota1(Scanner entrada, Aluno[] alunos) {

	}

	private static void imprimirTodos(Aluno[] alunos) {

	}

	private static void imprimirAluno(Scanner entrada, Aluno[] alunos) {

	}

	private static void cadastrarAluno(Scanner entrada, Aluno[] alunos) {

	}

}
