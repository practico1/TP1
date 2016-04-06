package punto9A;

public class PilaInt extends PilaObj{
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
}
