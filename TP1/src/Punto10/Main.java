package Punto10;

import Punto8.Console;

public class Main {

	public String titulo,p_responsable,nom_emisora,nombre,apellido,p_musicalizacion;
	public int codigo,duracion,H_inicio,cXtanda,DNI,comerciales;
	Empresa e=new Empresa();
	Radio r;
	Television t;
	Persona p,p1;
	int opcion;
	   do{
	      System.out.println("*********************************");
	      System.out.println("       Menu PROGRAMAS");
	      System.out.println("1-Agregar Programa");
	      System.out.println("2-eliminar Programa ");
	      System.out.println("3-Mostrar Programas");
	      System.out.println("*********************************");
	    opcion=Console.readInt();
	    switch(opcion){
	    	case 1:{
	    		System.out.println("<><><><><><><><><><><><><><><><><><>");
				System.out.println("1-Agregar Programa de Radio");
				System.out.println("2-Agregar Programa de Television");
				System.out.println("<><><><><><><><><><><><><><><><><><>");
				opcion=Console.readInt();
				switch(opcion){
	    			case 1:{
	    				System.out.println("***************************");
	    					nombre=Console.readString("nombre de la persona responsable de musicalizacion");
	    					apellido=Console.readString("apellido de la persona responsable de musicalizacion");
	    					DNI=Console.readInt("ingrese su DNI");
	    					p=new Persona(nombre,apellido,DNI);
	    					comerciales=Console.readInt("ingrese los minutos de los comerciales");
	    					nom_emisora=Console.readString("ingrese el nombre de la emisora");
	    					titulo=Console.readString("ingrese el nombre del programa");
	    					codigo=Console.readInt("ingrese el codigo de la radio");
	    					duracion=Console.readInt("ingrese la duracion del programa");
	    					H_inicio=Console.readInt("ingrese la hora en la que empiza el programa");
	    					nombre=Console.readString("nombre de la persona responsable");
	    					apellido=Console.readString("apellido de la persona responsable");
	    					DNI=Console.readInt("ingrese su DNI");
	    					p1=new Persona(nombre,apellido,DNI);
	    					r=new Radio(titulo,nom_emisora,codigo,duracion,H_inicio,p1,p,comerciales);
	    					e.agregarProgramas(r);
	    				System.out.println("***************************");
	    			break;	
	    			}
	    				case 2:{
	    					System.out.println("***************************");
	    					cXtanda=Console.readInt("ingrese la cantidad de comerciales");
	    					nom_emisora=Console.readString("ingrese el nombre de la emisora");
	    					titulo=Console.readString("ingrese el nombre del programa");
	    					codigo=Console.readInt("ingrese el codigo de la radio");
	    					duracion=Console.readInt("ingrese la duracion del programa");
	    					H_inicio=Console.readInt("ingrese la hora en la que empiza el programa");
	    					nombre=Console.readString("nombre de la persona responsable");
	    					apellido=Console.readString("apellido de la persona responsable");
	    					DNI=Console.readInt("ingrese su DNI");
	    					p1=new Persona(nombre,apellido,DNI);
	    					t=new Television(titulo,nom_emisora,codigo,duracion,H_inicio,p1,cXtanda);
	    					e.agregarProgramas(t);
	    				System.out.println("***************************");
	    				break;
	    				}
				}		
	    	break;
	    	}
	    	case 2:{
	    		int k;
	    		k=Console.readInt("ingrese la posicion del programa que desea quitar");
	    		e.quitarPrograma(k);
	    		
	    		
	    	break;
	    	}
	    		case 3:{
	    			e.mostrarProgramas();
	    		break;
	    		}
	    	
	    }	
	 }while(opcion !=0);
	    
	   }
}
