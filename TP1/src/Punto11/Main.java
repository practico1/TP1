package Punto11;

import Punto8.Console;

public class Main {

	public static void main(String[] args) {
	
	Medios m=new Medios();
	String titulo,responsable,editor,mes,año,semana,t_tapa;
	int codigo,paginas,precio,semanal,recargo,numero;

	Diarios d;
	Revistas r;
	int opcion;
	
		do{
			  System.out.println("*********************************");
		      System.out.println("       Menu Publicaciones");
		      System.out.println("1-Agregar Publicacion");
		      System.out.println("2-eliminar Publicacion");
		      System.out.println("3-Mostrar Publicacion");
		      System.out.println("*********************************");
		    opcion=Console.readInt();
		    switch(opcion){
		    	case 1:{
		    		System.out.println("<><><><><><><><><><><><><><><><><><>");
					System.out.println("1-Agregar Diarios");
					System.out.println("2-Agregar Revistas");
					System.out.println("<><><><><><><><><><><><><><><><><><>");
					opcion=Console.readInt();
					switch(opcion){
		    			case 1:{
		    				System.out.println("***************************");
		    					titulo=Console.readString("ingrese el titulo de la publicacion");
		    					editor=Console.readString("ingrese el editor de la publicacion");
		    					responsable=Console.readString("ingrese el responsable");
		    					semana=Console.readString("ingrese la semana que se publica");
		    					mes=Console.readString("ingrese el mes que se publica");
		    					año=Console.readString("ingrese el año que se publica");
		    					paginas=Console.readInt("ingrese la cantidad de  paginas");
		    					semanal=Console.readInt("inngrese si es semanal o  quinsenal");
		    					precio=Console.readInt("ingrese el precio del periodico");
		    					recargo=Console.readInt("ingrese el recargo que se le va a dar");
		    					codigo=Console.readInt("ingrese el codigo");
		    					d=new Diarios( codigo, paginas,precio,titulo,responsable,editor,mes,año,semana,semanal,recargo);
		    					System.out.println("Envio al interior");
		    					System.out.println("1-SI");
		    					System.out.println("2-NO");
		    					opcion=Console.readInt();
		    						if(opcion==1){
		    							d.recardoTotal();
		    						}
		    						else
		    						d.precioTotal();
		    						m.agregarPublicacion(d);
		    						
		    				System.out.println("***************************");
		    			break;	
		    			}
		    				case 2:{
		    				System.out.println("***************************");	
		    				titulo=Console.readString("ingrese el titulo de la publicacion");
		    				t_tapa=Console.readString("ingrese el titulo de la tapa");
	    					editor=Console.readString("ingrese el editor de la publicacion");
	    					responsable=Console.readString("ingrese el responsable");
	    					mes=Console.readString("ingrese el mes que se publica");
	    					año=Console.readString("ingrese el año que se publica");
	    					paginas=Console.readInt("ingrese la cantidad de  paginas");
	    					numero=Console.readInt("ingrese el numero de la revista");
	    					precio=Console.readInt("ingrese el precio del periodico");
	    					codigo=Console.readInt("ingrese el codigo");
	    					r=new Revistas( codigo, paginas,precio,titulo,responsable,editor,mes,año,numero,t_tapa);
	    					m.agregarPublicacion(r);
		    				System.out.println("***************************");
		    				break;
		    				}
					}		
		    	break;
		    	}
		    	case 2:{
		    		int k;
		    		k=Console.readInt("ingrese el codigo de la publicacion que desea sacar");
		    		m.quitarPublicaciones(k);
		    	break;
		    	}
		    	case 3:{
		    		m.mostrarPublicaciones();
		    	}
		    }
		}while(opcion !=0);
	}
}