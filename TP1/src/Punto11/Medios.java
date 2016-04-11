package Punto11;
import java.util.Vector;

public class Medios {
int pTotal;
Vector<Publicacion>publicaciones;

public Medios() {
	super();
	this.pTotal = 0;
	publicaciones=new Vector <Publicacion>();
}

	public void agregarPublicacion(Publicacion p){
		publicaciones.add(p);
	}
	public void quitarPublicaciones(int k){
		publicaciones.removeElementAt(k);
	}
	
	public void mostrarPublicaciones(){
		int j=0;
		for(Publicacion i:publicaciones){
			if(i instanceof Diarios){
				System.out.print(j);
				System.out.println((Diarios)i);
			}
			else
				if(i instanceof Revistas){
					System.out.print(j);
				System.out.println((Revistas)i);
				}	
			j++;
		}
	}
}
