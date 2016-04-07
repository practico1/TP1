package Punto10;

public class Persona  {
private String nombre,apellido;
private int DNI;
public Persona(String nombre, String apellido, int dNI) {
	super();
	this.nombre = nombre;
	this.apellido = apellido;
	DNI = dNI;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellido() {
	return apellido;
}
public void setApellido(String apellido) {
	this.apellido = apellido;
}
public int getDNI() {
	return DNI;
}
public void setDNI(int dNI) {
	DNI = dNI;
}

	
	
}
