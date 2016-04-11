package Punto11;
import java.util.Vector;

import Punto10.Programa;
public class Medios {
int pTotal;

Vector<Publicacion>publicaciones;

public Medios(Vector<Publicacion> publicaciones) {
	super();
	this.publicaciones = publicaciones;
}

	public void agregarPublicacion(Publicacion p){
		publicaciones.add(p);
	}
	public void quitarPublicaciones(int p){
		publicaciones.remove(p);
	}
	public void mostrarProgramas(){
		for(Publicacion p:publicaciones){
			p.toString();
		}
	}
}
