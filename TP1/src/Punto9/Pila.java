package Punto9;

public class Pila{
	   private final int maxpila=5;
	   private int cima;
	    
	   public Pila(){
	        cima = -1;
	   }
	   public boolean estaVacia() {
	        return (cima == -1);
	    }
	     
	    public boolean estaLlena() {
	        return (cima == maxpila-1);
	    }
	    
	    public int getMaxPila(){
		      return maxpila;
		   }
		   public void limpiarPila(){
		      cima=-1;
		   }
	   
}