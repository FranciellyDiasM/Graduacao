package trabalho;

import java.util.ArrayList;

import io.InOut;

public class Trabalho {

	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<Integer>();
		ArrayList<Integer> lista2 = new ArrayList<Integer>();
		ArrayList<Integer> lista3 = new ArrayList<Integer>();

		preencher(lista);
		System.out.println(lista);
		preencher(lista2);
		System.out.println(lista2);
		juntaLista(lista3, lista);
		juntaLista(lista3, lista2);
		System.out.println(lista3);
		removerRepetidos(lista3);
		System.out.println(lista3);
		inverterLista(lista3);
		System.out.println(lista3);

	}

	private static void preencher(ArrayList<Integer> lista) {

		int quant = InOut.leInt("Entre com a quantidade");
		for (int i = 0; i < quant; i++) {
			int num = (int) (Math.random() * 30 + 1);
			insereOrdenado(lista, num);
		}

	}

	private static void insereOrdenado(ArrayList<Integer> lista, int num) {
		if (lista.isEmpty()) {
			lista.add(num);
		} else {
			int i = 0;
			while (i < lista.size() && lista.get(i) < num) {
				i++;
			}

			lista.add(i, num);
		}
	}

	private static void juntaLista(ArrayList<Integer> lista, ArrayList<Integer> lista2) {
		for (int elemento : lista2) {
			insereOrdenado(lista, elemento);
		}
	}

	public static void removerRepetidos(ArrayList<Integer> lista) {
		int ultimo = lista.size() - 1;
		for (int i = ultimo; i > 0; i--) {
			int elementoPosicao = lista.get(i);
			int elementoPosicaoAnterior = lista.get(i - 1);

			if (elementoPosicao == elementoPosicaoAnterior) {
				lista.remove(i);
			}
		}
	}

	private static void inverterLista(ArrayList<Integer> lista) {
		ArrayList<Integer> novaLista = new ArrayList<>();
		int ultimaPosicao = lista.size() - 1;

		for (int i = ultimaPosicao; i >= 0; i--) {
			novaLista.add(lista.get(i));
		}

		lista.clear();
		lista.addAll(novaLista);
	}
}