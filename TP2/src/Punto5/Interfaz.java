package Punto5;

public class Interfaz {

		public void mostrar(Archivo A) throws Error1{
			
			if (A.getExtencion()=="bin"){
				throw new Error1();
			}
			System.out.println(A);
		}
}
