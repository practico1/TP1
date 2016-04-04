package Punto8;

public class Main {

	public static void main(String[] args) {
		int altura,base,longitud,k;
		String colorFondo,colorBorde;
		double radio;
		Pizarra p=new Pizarra("");
		Circunferencia c;
		Rectangulo r;
		Linea l;
		int opcion;
		   do{
		      System.out.println("*********************************");
		      System.out.println("       Menu PIZARRA");
		      System.out.println("1-Agregar figura");
		      System.out.println("2-eliminar figura ");
		      System.out.println("3-Limpiar Pizarra");
		      System.out.println("4-Calcular Superficie");
		      System.out.println("5-Calcular Perimetros");
		      System.out.println("6-Cambiar Color del fondo de figura");
		      System.out.println("7-Cambiar color del borde de figura");
		      System.out.println("8-Cambiar color de pizarra");
		      System.out.println("9-Mostrar Pizarra");
		      System.out.println("*********************************");
		    opcion=Console.readInt();
	
		    switch(opcion){
	        case 1:{
	        	System.out.println("*********************************");
			      System.out.println("        PIZARRA");
			      System.out.println("1-Agregar Circunferencia");
			      System.out.println("2-Agregar Rectangulo ");
			      System.out.println("3-Agregar Linea");
			      System.out.println("*********************************");
	        	opcion=Console.readInt();
	        	switch(opcion){
	        		case 1:{
	        			System.out.println("<><><><><><><><><><><><><><><><><><>");
	        			radio=Console.readDouble("ingrese el radio");
	        			colorFondo=Console.readString("ingrese el color de fondo de la figura");
	        			colorBorde=Console.readString("ingrese le color del borde de la figura");
	        			c=new Circunferencia(radio,colorFondo,colorBorde);
	        			p.agregar(c);
	        			break;
	        			}
	        		case 2:{
	        			altura=Console.readInt("ingrese la altura");
	        			base=Console.readInt("ingrese la base");
	        			colorFondo=Console.readString("ingrese el color de fondo de la figura");
	        			colorBorde=Console.readString("ingrese le color del borde de la figura");
	        			r=new Rectangulo(altura,base,colorFondo,colorBorde);
	        			p.agregar(r);
	        			break;
	        		}
	        		case 3:{
	        			longitud=Console.readInt("ingrese la longitud");
	        			colorFondo=Console.readString("ingrese el color de fondo de la figura");
	        			colorBorde=Console.readString("ingrese le color del borde de la figura");
	        			l=new Linea(colorFondo,colorBorde,longitud);
	        			p.agregar(l);
	        			break;
	        		}
	        	}
	        break;
	        }
	        case 2:{
	        	k=Console.readInt("ingrese la pocision de la figura que desea eliminar");
	        	p.eliminar(k);
	        break;
	        }
	        case 3:{
	        	p.limpiar();
	        break;
	        }
	        case 4:{
	        	System.out.println("el area total de las figuras en la pizarra es: "+p.area());
	        break;
	        }
	        case 5:{
	        	System.out.println("el perimetro total de las figuras den la pizarra es: "+p.perimetro());
	        break;
	        }
	        case 6:{
	        	k=Console.readInt("ingrese la posicion del la figura");
	        	colorFondo=Console.readString("ingrese el color del fondo");
	        	p.setFondo_figura(colorFondo, k);
	        break;	
	        }
	        case 7:{
	        	k=Console.readInt("ingrese la posicion de la figura");
	        	colorBorde=Console.readString("ingrese el color del borde");
	        	p.setBorde_Figura(colorBorde, k);
	        break;
	        }
	        case 8:{
	        	colorFondo=Console.readString("ingrese el color del fondo de la pizarra");
	        	p.setColorFondo(colorFondo);
	        break;
	        }
	        case 9:{
	        	p.mostrarFiguras();
	        break;	
	        }
	     }   
	   }while(opcion !=0);
	   
	}
}
