package punto9A;

public class PilaChar extends PilaObj {
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
	     
}
