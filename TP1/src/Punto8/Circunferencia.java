package Punto8;
import java.lang.Math;
public class Circunferencia extends Figura {
	 private double radio;
	 private String colorFondo, colorBorde;
	 
	 


	public Circunferencia(double radio, String colorFondo, String colorBorde) {
		super();
		this.radio = radio;
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

	public void dibujar(){
		System.out.println("Circunferencia");;
	}
	public double perimetro(){
		double Perimetro=2*Math.PI*radio;
		return Perimetro;	
	}
	public double area(){
		double A=Math.PI*Math.pow(radio,2);
		return A;
	}
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	public String toString(){
		return ("Circunferencia " + "Radio: " + getRadio() + " ColorFondo: " + getColorFondo() + " ColorBorde: "+ getColorBorde());
	}
}