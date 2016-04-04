package Punto8;
import java.util.Vector;
public class Pizarra {
	private double stotal, ptotal;
	private String colorFondo;
	Vector<Figura> figuras;
	public Pizarra(String f){
		this.colorFondo=f;
		figuras=new Vector<Figura>();
		stotal=0;
		ptotal=0;
	}
	
	public String getColorFondo() {
		return colorFondo;
	}
	public void setColorFondo(String colorFondo) {
		this.colorFondo = colorFondo;
	}

	public double getStotal() {
		return stotal;
	}
	
	public double getPtotal() {
		return ptotal;
	}

	public void agregar(Figura F){
		figuras.add(F);
	}
	public void eliminar(int k){
		figuras.remove(k);
	}
	public void limpiar()
	{
		figuras.clear();
	}
	
	public double perimetro(){
		ptotal=0;
		for(Figura i:figuras){
			ptotal=ptotal+i.perimetro();
		}
		return ptotal;
	}
	public double area(){
		stotal=0;
		for(Figura i:figuras){
			stotal=stotal+i.area();
		}
		return stotal;
	}
	public void setFondo_figura(String  f,int c){
		Figura aux=null;
		aux=figuras.get(c);
		aux.setColor_fondo(f);
		figuras.set(c,aux);
	}
	public void setBorde_Figura(String f,int c){
		Figura aux=null;
		aux=figuras.get(c);
		aux.setColor_borde(f);
		figuras.set(c,aux);
	}
	
	public void mostrarFiguras(){
		int j=0;
		for(Figura i:figuras){
			if(i instanceof Circunferencia){
				System.out.print(j);
				System.out.println((Circunferencia)i);
			}
			else
				if(i instanceof Rectangulo){
					System.out.print(j);
				System.out.println((Rectangulo)i);
				}	
				else
				{
					System.out.print(j);
					System.out.println((Linea)i);
				}
			j++;
		}
	}
	
}
