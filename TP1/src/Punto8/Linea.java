package Punto8;

public class Linea extends  Figura {
	private String colorFondo, colorBorde;
	private int l;

	public Linea(String colorFondo, String colorBorde, int l) {
		super();
		this.colorFondo = colorFondo;
		this.colorBorde = colorBorde;
		this.l = l;
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

	public void dibujar() {
		System.out.println("Linea");
		
	}
	public double perimetro() {
		return 0;
	}
	public double area() {
		return 0;
	}
	public int getL() {
		return l;
	}
	public void setL(int l) {
		this.l = l;
	}
	public String toString(){
		return ("Linea " + "Longitud: " + getL() + " ColorFondo: " + getColorFondo() + " ColorBorde: "+ getColorBorde());
	}
}
