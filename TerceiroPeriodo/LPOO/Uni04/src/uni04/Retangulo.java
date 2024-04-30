package uni04;

public class Retangulo extends ElementoGeometrico {

	private double lado1;
	private double lado2;
	
	public Retangulo(double lado1, double lado2) {
		super();
		this.lado1 = lado1;
		this.lado2 = lado2;
	}


	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	@Override
	public String desenhar() {
		return "Isto é um retângulo";
	}

	@Override
	public void redimensionar(double red) {

		double novoLado1 = this.getLado1() * red;
		double novoLado2 = this.getLado2() * red;

		this.setLado1(novoLado1);
		this.setLado2(novoLado2);

	}

	
	@Override
	public double area() {
		double areaRet = this.getLado1() * this.getLado2();

		return areaRet;
	}

	@Override
	public double perimetro() {
		double perimetroRet = (this.getLado1() + this.getLado2()) * 2;

		return perimetroRet;
	}

}
