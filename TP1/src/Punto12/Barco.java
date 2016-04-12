package Punto12;

public class Barco {

private String matricula;
private double eslora;
private int año;
public Barco(String matricula, double eslora, int año) {
	super();
	this.matricula = matricula;
	this.eslora = eslora;
	this.año = año;
}
public String getMatricula() {
	return matricula;
}
public void setMatricula(String matricula) {
	this.matricula = matricula;
}
public double getEslora() {
	return eslora;
}
public void setEslora(double eslora) {
	this.eslora = eslora;
}
public int getAño() {
	return año;
}
public void setAño(int año) {
	this.año = año;
}

}
