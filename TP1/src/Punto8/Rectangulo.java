package Punto8;

public class Rectangulo extends Figura{
	private int a,b;
	private String colorFondo, colorBorde;
	
	
	public Rectangulo(int a, int b, String colorFondo, String colorBorde) {
		super();
		this.a = a;
		this.b = b;
		this.colorFondo = colorFondo;
		this.colorBorde = colorBorde;
	}

	public String getColorFondo() {
		return colorFondo;
	}

	public void setColorFondo(String colorFondo) {
		this.colorFondo = colorFondo;
	}

	public String getColorBorde() {
		return colorBorde;
	}

	public void setColorBorde(String colorBorde) {
		this.colorBorde = colorBorde;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public void dibujar() {
		System.out.print("Rectangulo");
		
	}

	public double perimetro() {
		double p=2*(a+b);
		return p;
	}

	public double area() {
		double A=a*b;
		return A;
	}

	public String toString(){
		return ("Rectangulo " + "Altura: "+getA() + "Base"+ getB()+ " ColorFondo: " + getColorFondo() + " ColorBorde: "+ getColorBorde());
	}

}
