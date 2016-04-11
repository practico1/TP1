package Punto11;

public class Revistas extends Publicacion {
private int numero;
private String t_tapa;
	
	

public Revistas(int codigo, int paginas, int precio, String titulo, String responsable, String editor, String mes,
		String año, int numero, String t_tapa) {
	super(codigo, paginas, precio, titulo, responsable, editor, mes, año);
	this.numero = numero;
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
	return"REVISTA"+"\n El titulo es: "+getTitulo()+"\n El responsable es: "+getResponsable()+" \n El editor es: "+getEditor()+" \n Tiene: "+getPaginas()+" paginas"+"\n El titulo de la tapa es: "+getT_tapa()+"\n El numero es: "+getNumero()+" \n El precio es de: "+getPrecio()+" \n su mes depublicacion es: "+getMes()+" \n el año de publicacion es: "+getAño()+" \n Su codigo es: "+getCodigo();
	
}
}
