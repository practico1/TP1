package Punto12;

public class Yate extends Barco{

	private int potencia,num;

	public Yate(String matricula, double eslora, int año, int potencia, int num) {
		super(matricula, eslora, año);
		this.potencia = potencia;
		this.num = num;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	
	
	
}
