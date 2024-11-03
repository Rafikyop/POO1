
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circulo circulo = new Circulo();
		Cuadrado cuadrado = new Cuadrado();
		
		circulo.setRadio(15);
		circulo.calcularArea();
		circulo.calcularPerimeter();
		
		System.out.println("Datos del circulo");
		System.out.println("El valor del area:" + circulo.getArea());
		System.out.println("El valor del perimeter:" + circulo.getPerimeter());
		
		cuadrado.setLado(40);
		cuadrado.calcularArea();
		cuadrado.calcularPerimeter();
		
		System.out.println("Datos del cuadradoi");
		System.out.println("El valor del area:" + cuadrado.getArea());
		System.out.println("El valor del perimeter:" + cuadrado.getPerimeter());
	}

}
