package Punto5;
import java.util.Vector;

public class Lista_archivos {

Vector<Archivo> lista;

private int id,cap,cont;

private Interfaz i;
public Lista_archivos( int id, int cap, int cont) {
	super();
	this.lista =  new Vector<Archivo>();
	this.id = id;
	this.cap = cap;
	this.cont = cont;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getCap() {
	return cap;
}
public void setCap(int cap) {
	this.cap = cap;
}
public int getCont() {
	return cont;
}
public void setCont(int cont) {
	this.cont = cont;
}


public void agregarArchivo(Archivo e){
	lista.add(e);
}
public void quitarArchivo(int posicion){
			lista.remove(posicion);
}	
	
public void listarArchivos(){
	i = null;
	try {
		for (Archivo a:lista){
			
			i.mostrar(a);
		}
	}
	catch(Error1 ref){
		System.out.println("el tipo de archivo es binario ;C");
	}
}

	
}
