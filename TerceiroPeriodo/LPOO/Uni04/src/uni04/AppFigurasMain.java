package uni04;

import java.util.ArrayList;
import java.util.Scanner;

public class AppFigurasMain {

	public static void main(String[] args) {

		ArrayList<ElementoGeometrico> figuras = new ArrayList<ElementoGeometrico>();

		armazenar(figuras);
		mostrar(figuras);

		redimensionar(figuras);
		desenhar(figuras);
//		area(figuras);
//		perimetro(figuras);
//		

	}

	private static void armazenar(ArrayList<ElementoGeometrico> figuras) {
		Scanner entrada = new Scanner(System.in);

		do {
			int opcao;
			System.out.println("O que vc quer cadastrar: \n" + "1. Circulo.\n" + "2.quadrado.\n" + "3.retangulo.\n");
			opcao = entrada.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Entre com o raio: \n");
				double raio = entrada.nextDouble();

				Circulo circulo = new Circulo(raio);

				figuras.add(circulo);

				break;

			case 2:
				System.out.println("entre com o lado: \n");
				double lado = entrada.nextDouble();

				Quadrado quadrado = new Quadrado(lado);

				figuras.add(quadrado);
				break;

			case 3:
				System.out.println("entra com o lado 1: \n");
				double lado1 = entrada.nextDouble();
				System.out.println("entra com o lado2: \n");
				double lado2 = entrada.nextDouble();

				Retangulo retangulo = new Retangulo(lado1, lado2);

				figuras.add(retangulo);
				break;

			default:
				System.out.println("opçao invalida.\n");
			}

		} while (figuras.size() < 6);

	}

	private static void mostrar(ArrayList<ElementoGeometrico> figuras) {
		for (int i = 0; i < figuras.size(); i++) {
			ElementoGeometrico item = figuras.get(i);

			if (item instanceof Quadrado) {
				System.out.println("Quadrado. [] ");
			} else if (item instanceof Circulo) {
				System.out.println("Circulo ()");
			} else if (item instanceof Retangulo) {
				System.out.println("Retangulo |__|");
			}

			System.out.println(item.perimetro());
			System.out.println(item.area());
		}
	}

	private static void redimensionar(ArrayList<ElementoGeometrico> figuras) {
		for (int i = 0; i < figuras.size(); i++) {
			ElementoGeometrico item = figuras.get(i);

			if (item instanceof Circulo) {
				Circulo c = (Circulo) item;

				System.out.println("estou redimensoonando um circulo de raio "+ c.getRaio());
				
				item.redimensionar(2);
				System.out.println("o raio ficou "+ c.getRaio());
			}
		}
	}

	private static void desenhar(ArrayList<ElementoGeometrico> figuras) {
		for (int i = 0; i < figuras.size(); i++) {

			ElementoGeometrico item = figuras.get(i);
			System.out.println(item.desenhar());
		}
	}

}
