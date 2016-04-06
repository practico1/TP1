package Punto9;

public class PilaInt extends Pila{
		   private int[]p;
		   private final int maxpila=5;
		   private int cima;
		    
		   public PilaInt(){
		      p = new int[maxpila];
		        cima = -1;
		   }
 
		    public void meter(int e) {
		        cima++;
		        p[cima]=e;      
		    }
		     
		    public int sacar() {
		        int aux= Integer.MIN_VALUE;
		        aux = p[cima];
		        cima--;
		        return aux;
		    }
		   public int elementoCima(){
		      int aux=sacar();
		      meter(aux);
		      return aux;
		   }
		   public int getMaxPila(){
		      return maxpila;
		   }
		   public void limpiarPila(){
		      cima=-1;
		   }
		   public void mostrarPila(){
		      PilaInt p2=new PilaInt();
		      int aux=0;
		      while(!estaVacia()){
		         aux=sacar();
		         System.out.println(aux+" ");
		         p2.meter(aux);
		      } 
		      while(!p2.estaVacia()){
		         meter(p2.sacar());
		      }
		   }
		}
