package Punto12;

public class Deportivo extends Barco{

private int potencia;

public Deportivo(String matricula, double eslora, int año, int potencia) {
	super(matricula, eslora, año);
	this.potencia = potencia;
}

public int getPotencia() {
	return potencia;
}

public void setPotencia(int potencia) {
	this.potencia = potencia;
}


}
