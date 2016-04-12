package Punto12;

public class Amarre {

private String nombre;
private int DNI,F_inicial,F_final,pos;
private int alquiler;
private double modulo;
private Barco b;


public Amarre(String nombre, int dNI, int f_inicial, int f_final, int pos, int alquiler, double modulo, Barco b) {
	super();
	this.nombre = nombre;
	DNI = dNI;
	F_inicial = f_inicial;
	F_final = f_final;
	this.pos = pos;
	this.alquiler = alquiler;
	this.modulo = modulo;
	this.b = b;
}

public Barco getB() {
	return b;
}

public void setB(Barco b) {
	this.b = b;
}

public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getDNI() {
	return DNI;
}
public void setDNI(int dNI) {
	DNI = dNI;
}

public int getPos() {
	return pos;
}
public void setPos(int pos) {
	this.pos = pos;
}

}
