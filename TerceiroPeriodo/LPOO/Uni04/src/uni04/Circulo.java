package uni04;

public class Circulo extends ElementoGeometrico {

	private double raio;

	
	public Circulo(double raio) {
		super();
		this.raio = raio;
	}

	@Override
	public String desenhar() {
		return "Isto é um circulo";
	}
	
	@Override
	public void redimensionar(double d) {
		double novoRaio = raio * d;
		
		this.raio = novoRaio;
	}

	@Override
	public double area() {
		double areaCirculo = Math.PI * raio * raio;

		return areaCirculo;
	}

	@Override
	public double perimetro() {
		double perimetroCirculo = 2 * Math.PI * raio;

		return perimetroCirculo;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	

}
