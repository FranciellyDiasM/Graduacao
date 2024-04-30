package uni04;

public class Quadrado extends Retangulo {

	public Quadrado(double lado) {
		super(lado, lado);
	}

	@Override
	public String desenhar() {

		return "Isto é um quadrado";
	}

}
