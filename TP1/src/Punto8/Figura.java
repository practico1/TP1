package Punto8;

abstract class Figura {
	private String color_borde,color_fondo;
	public abstract void dibujar();
	public abstract double perimetro();
	public abstract double area();
	public String getColor_borde() {
		return color_borde;
	}
	public void setColor_borde(String color_borde) {
		this.color_borde = color_borde;
	}
	public String getColor_fondo() {
		return color_fondo;
	}
	public void setColor_fondo(String color_fondo) {
		this.color_fondo = color_fondo;
	}

}
