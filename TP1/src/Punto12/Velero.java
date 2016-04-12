package Punto12;

public class Velero extends Barco{

private int N_mastiles;

public Velero(String matricula, double eslora, int año, int n_mastiles) {
	super(matricula, eslora, año);
	N_mastiles = n_mastiles;
}

public int getN_mastiles() {
	return N_mastiles;
}

public void setN_mastiles(int n_mastiles) {
	N_mastiles = n_mastiles;
}

public String  toString (){
	System.out.println("<><><><><><><><><><><><><><><><><><>");
	return"VELERO"+
		"\n Matricula: "+getMatricula()+
		"\n Eslora: "+getEslora()+
		"\n Año: "+getAño()+
		"\n Numero de mastiles: "+getN_mastiles();
}
}
