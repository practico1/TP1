package Punto10;

public class Programa extends Persona{
private String titulo,P_responsable,nom_Emisora;
private int codigo,duracion,H_inicio;
public Programa(String nombre, String apellido, int dNI, String titulo, String p_responsable, String nom_Emisora,
		int codigo, int duracion, int h_inicio) {
	super(nombre, apellido, dNI);
	this.titulo = titulo;
	this.P_responsable = p_responsable;
	this.nom_Emisora = nom_Emisora;
	this.codigo = codigo;
	this.duracion = duracion;
	H_inicio = h_inicio;
}
public String getTitulo() {
	return titulo;
}
public void setTitulo(String titulo) {
	this.titulo = titulo;
}
public String getP_responsable() {
	return P_responsable;
}
public void setP_responsable(String p_responsable) {
	P_responsable = p_responsable;
}
public String getNom_Emisora() {
	return nom_Emisora;
}
public void setNom_Emisora(String nom_Emisora) {
	this.nom_Emisora = nom_Emisora;
}
public int getCodigo() {
	return codigo;
}
public void setCodigo(int codigo) {
	this.codigo = codigo;
}
public int getDuracion() {
	return duracion;
}
public void setDuracion(int duracion) {
	this.duracion = duracion;
}
public int getH_inicio() {
	return H_inicio;
}
public void setH_inicio(int h_inicio) {
	H_inicio = h_inicio;
}
	
	

	
	
}
