
public class Cuadrado {
	//atributos
	
	private double area;
	private double perimeter;
	private int lado;
	
	//Metodos
	public void calcularArea() {
		this.area = this.lado * this.lado;
	}
	
	public void calcularPerimeter() {
		this.perimeter = this.lado * 4;
	
	}

	//Getters and Setters
	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getPerimeter() {
		return perimeter;
	}

	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}
	
}