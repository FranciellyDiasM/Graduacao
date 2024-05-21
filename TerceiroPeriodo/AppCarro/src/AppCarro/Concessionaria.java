package AppCarro;

import java.util.ArrayList;

import io.InOut;

public class Concessionaria {

	public static void main(String[] args) {

		ArrayList<Carro> carros = new ArrayList<Carro>();

		int opcao = 0;
		do {
			opcao = InOut.leInt("MENU\n 1. Cadastrar\n 2. Alugar\n 3. Devolver\n 4. Sair");
			switch (opcao) {
			case 1:
				cadastrar(carros);
				break;
			case 2:
				alugar(carros);
				break;
			case 3:
				devolver(carros);
				break;
			case 4:
				InOut.msgDeInformacao("Aviso", "Saindo do programa...");
				break;
			default:
				InOut.msgDeErro("Aiso", "OPção invalida.");
				break;
			}
		} while (opcao != 4);
		System.out.println(carros);

	}

	private static void cadastrar(ArrayList<Carro> carros) {
		int opcao = 0;
		do {
			opcao = InOut.leInt("Cadastro dos carros\n 1. Carro normal.\n 2. Carro VIP\n 3. Sair");
			switch (opcao) {
			case 1:
				cadastrarNormal(carros);
				break;
			case 2:
				cadastrarVip(carros);
				break;
			case 3:
				break;
			default:
				InOut.msgDeErro("aviso", "Opção inválida.");
				break;
			}
		} while (opcao <= 0 || opcao > 2);
	}

	private static void cadastrarNormal(ArrayList<Carro> carros) {
		int codigo = InOut.leInt("Entre com o codigo do carro");
		String modelo = InOut.leString("Entre com o modelo do carro");

		Carro carro = new Carro(codigo, modelo);
		carros.add(carro);
	}

	private static void cadastrarVip(ArrayList<Carro> carros) {
		int codigo = InOut.leInt("Entre com o codigo do carro VIP:");
		String modelo = InOut.leString("Entre com o modelo do carro VIP:");

		CarroVip carroVip = new CarroVip(codigo, modelo);
		carros.add(carroVip);

	}

	private static int pesquisa(ArrayList<Carro> carros, int codigo) {
		for (int i = 0; i < carros.size(); i++) {
			Carro carroDaPosicao = carros.get(i);

			if (carroDaPosicao.getCodigo() == codigo) {
				return i;
			}
		}

		return -1;
	}

	private static void alugar(ArrayList<Carro> carros) {
		int codigo = InOut.leInt("Informe o codigo do carro que deseja alugar: ");
		
		int posicao = pesquisa(carros,codigo);
		boolean cadastrado = posicao >= 0;
		
		if(!cadastrado) {
			InOut.msgDeErro("Erro", "Codigo inválido.\n");
			return;
		}
		
		Carro carroEncontrado = carros.get(posicao);
		int qtDias = InOut.leInt("Informe a quantidade de dias que deseja locar este carro: \n");
		boolean conseguiuLocar = carroEncontrado.locar(qtDias);
		
		if(conseguiuLocar) {
			String modelo = carroEncontrado.getModelo();
			InOut.msgDeAviso("Sucesso", "Carro "+modelo + " locado.\n");
			
		}else {
			InOut.msgDeErro("Erro", "Este carro já esta locado.\n");
		}
	}
	
	private static void devolver(ArrayList<Carro> carros) {
		int codigo = InOut.leInt("Entre com o codigo do carro para devolver: \n");

		int posicao = pesquisa(carros, codigo);
		boolean cadastrado = posicao > 0;

		if (!cadastrado) {
			InOut.msgDeErro("Erro", "Codigo inválido");
			return;
		}
		Carro carroEncontrado = carros.get(posicao);
		double valorAluguel = carroEncontrado.devolver();

		if (valorAluguel > 0) {
			String modelo = carroEncontrado.getModelo();
			InOut.msgDeAviso("Sucesso", "Carro " + modelo + "devolvido. Valor do aluguel a pagar:R$ " + valorAluguel);

		} else {
			InOut.msgDeErro("Erro", "Este carro não esta alugado");
		}

	}

}