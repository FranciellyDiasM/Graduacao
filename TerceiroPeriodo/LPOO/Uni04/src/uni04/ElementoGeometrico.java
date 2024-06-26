package uni04;

public abstract class ElementoGeometrico implements iCalculoGeometrico {
	
	private double x;
	private double y;
	
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "ElementoGeometrico [x= " + x + ", y= " + y + "]";
	}
	
	
}
