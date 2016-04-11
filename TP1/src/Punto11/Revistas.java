package Punto11;

public class Revistas extends Publicacion {
private int numero;
private String t_tapa;
	
	
public Revistas(int codigo, int paginas, int precio, String titulo, String responsable, String editor, String mes,
		String año, String t_tapa) {
	super(codigo, paginas, precio, titulo, responsable, editor, mes, año);
	this.t_tapa = t_tapa;
}
public String getT_tapa() {
	return t_tapa;
}
public void setT_tapa(String t_tapa) {
	this.t_tapa = t_tapa;
}
public int getNumero() {
	return numero;
}
public void setNumero(int numero) {
	this.numero = numero;
}

public String  toString (){
	System.out.println("<><><><><><><><><><><><><><><><><><>");
	return"El titulo es: "+getTitulo()+" /nEl responsable es: "+getResponsable()+" /nEl editor es: "+getEditor()+" /nTiene: "+getPaginas()+" paginas"+"/nEl titulo de la tapa es: "+getT_tapa()+"/nEl numero es: "+getNumero()+" /nEl precio es de: "+getPrecio()+" /nsu mes depublicacion es: "+getMes()+" /nel año de publicacion es: "+getAño()+" /nSu codigo es: "+getCodigo();
	
}
}
