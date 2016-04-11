package Punto11;

public class Diarios extends Publicacion {
	private String semana;
	private int semanal,recargo,pTotal;
	
	public Diarios(int codigo, int paginas, int precio, String titulo, String responsable, String editor, String mes,
			String año, String semana, int semanal, int recargo) {
		super(codigo, paginas, precio, titulo, responsable, editor, mes, año);
		this.semana = semana;
		this.semanal = semanal;
		this.recargo = recargo;
	}
	
	public String getSemana() {
		return semana;
	}
	public void setSemana(String semana) {
		this.semana = semana;
	}
	public int getSemanal() {
		return semanal;
	}
	public void setSemanal(int semanal) {
		this.semanal = semanal;
	}
	public int getRecargo() {
		return recargo;
	}
	public void setRecargo(int recargo) {
		this.recargo = recargo;
	}
		
	public int precioTotal(){
		pTotal=getPrecio();
		return pTotal;
	}
	public int recardoTotal(){
		pTotal=getRecargo()+getPrecio();
		return pTotal;
	}
	public String  toString (){
		System.out.println("<><><><><><><><><><><><><><><><><><>");
		return "DIARIO"+"\n El titulo es: "+getTitulo()+" \n El responsable es: "+getResponsable()+" \n El editor es: "+getEditor()+" \n Tiene: "+getPaginas()+" paginas"+" \n El precio es de: "+getPrecio()+" \n Semanal: "+getSemanal()+" \n Semana de publicacion: "+getSemana()+" \n su mes depublicacion es: "+getMes()+" \n el año de publicacion es: "+getAño()+" \n Su codigo es: "+getCodigo()+" \n El recargo es de: "+getRecargo()+" \n El total es de: "+pTotal;
		
	}
}
