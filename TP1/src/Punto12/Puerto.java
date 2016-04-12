package Punto12;
import java.util.Vector;

public class Puerto {

Vector<Amarre>barcos;
	public Puerto(){
		barcos=new Vector<Amarre>();
	}
	
	public void agregarAmarre(Amarre e){
		barcos.add(e);
	}
	public void quitarAmarre(int k){
		barcos.remove(k);
	}
	
	public void mostrarPuerto(){
		   for(Amarre i:barcos){
			   System.out.println(barcos.indexOf(i));
		   }
	   }
	public void Mostrar(){
			for (Amarre a: barcos){
				System.out.println(a.getB().toString());
			}
		
	}
	public void MostrarEspecifico(int i){
		amarres.elementAt(i).VerAlquiler();
	}
}

