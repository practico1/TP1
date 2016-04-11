package Punto10;
import java.util.Vector;

public class Empresa {
	Vector<Programa>programas;

	public Empresa() {
		programas=new Vector<Programa>();
	}
	
	public void agregarProgramas(Programa p){
		programas.add(p);
	}
	public void quitarPrograma(int k){
		programas.remove(k);
	}
	
	public void mostrarProgramas(){
		for(Programa p:programas){
			p.toString();
		}
	}
}


