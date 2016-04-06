package punto9A;
import java.util.Vector;
public class PilaObj {
	Vector<Object> Objetos;
	   private final int maxpila=5;
	   private int cima;
	    
	   public PilaObj(){
	      Objetos=new Vector<Object>();
	        cima = -1;
	   }

	   public boolean estaVacia() {
	        return (cima == -1);
	    }
	     
	    public boolean estaLlena() {
	        return (cima == maxpila-1);
	    }
	    
	    public void meter(Object e) {
	        Objetos.add(e);      
	    }
	     
	    public Object sacar() {
	      	int i =0;
	      	char c=' ';
			if(!estaVacia()){
	        if(Objetos.get(Objetos.size()-1)instanceof PilaInt){
	          i=(int) Objetos.get(Objetos.size()-1);
	        	Objetos.remove(Objetos.size()-1);
	        }
	        return i;
	        }
	      		if(Objetos.get(Objetos.size()-1)instanceof PilaChar){
	      			c=(char) Objetos.get(Objetos.size()-1);
	      			Objetos.remove(Objetos.size()-1);
	      		}
	      		return c;
	     	    }
	    	
	   public Object elementoCima(){
	      Object aux=sacar();
	      meter(aux);
	      return aux;
	   }
	   public void mostrarPila(){
		   for(Object i:Objetos){
			   System.out.println(Objetos.indexOf(i));
		   }
	   }
	   
}
