package Punto9;

public class PilaChar extends Pila {
	private char[]c;
	   private final int max=100;
	   private int cima;
	    
	   public PilaChar(){
	      c = new char[max];
	        cima = -1;
	   } 
	    public void meter(char e) {
	        cima++;
	        c[cima]=e;      
	    }
	     
	    public char sacar() {
	        char aux;
	        aux = c[cima];
	        cima--;
	        return aux;
	    }
	    public char elementoCima(){
		      char aux=sacar();
		      meter(aux);
		      return aux;
		   }
	   public void mostrarPila(){
	      PilaChar p2=new PilaChar();
	      char aux=0;
	      while(estaVacia()){
	         aux=sacar();
	         System.out.println(aux+" ");
	         p2.meter(aux);
	      } 
	      while(!p2.estaVacia()){
	         meter(p2.sacar());
	      }
	   }
}
