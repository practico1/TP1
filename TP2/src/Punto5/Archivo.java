package Punto5;

public class Archivo {

private String nombre,extencion;
private int tamanio;
Fecha f;
private boolean lectura,escritura;
public Archivo(String nombre, String extencion, int tamanio, Fecha f, boolean lectura, boolean escritura) {
	super();
	this.nombre = nombre;
	this.extencion = extencion;
	this.tamanio = tamanio;
	this.f = f;
	this.lectura = lectura;
	this.escritura = escritura;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getExtencion() {
	return extencion;
}
public void setExtencion(String extencion) {
	this.extencion = extencion;
}
public int getTamanio() {
	return tamanio;
}
public void setTamanio(int tamanio) {
	this.tamanio = tamanio;
}
public Fecha getF() {
	return f;
}
public void setF(Fecha f) {
	this.f = f;
}
public boolean isLectura() {
	return lectura;
}
public void setLectura(boolean lectura) {
	this.lectura = lectura;
}
public boolean isEscritura() {
	return escritura;
}
public void setEscritura(boolean escritura) {
	this.escritura = escritura;
}

public String toString() {
	return "Archivo [nombre=" + nombre + 
			"\n extencion=" + extencion + 
			"\n tamanio=" + tamanio + 
			"\n f=" + f + 
			"\n lectura="+ lectura + 
			"\n escritura=" + escritura + "]";
}

	

}
