package Punto11;

public class Diarios extends Publicacion {
	private String titulo,semana;
	private int semanal,recargo;
	
	public Diarios(int codigo, int paginas, int precio, String titulo, String responsable, String editor, String mes,
			String año, String titulo2, String semana, int semanal, int recargo) {
		super(codigo, paginas, precio, titulo, responsable, editor, mes, año);
		titulo = titulo2;
		this.semana = semana;
		this.semanal = semanal;
		this.recargo = recargo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
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
	
	public String  toString (){
		System.out.println("<><><><><><><><><><><><><><><><><><>");
		return "DIARIO"+"El titulo es: "+getTitulo()+" /nEl responsable es: "+getResponsable()+" /nEl editor es: "+getEditor()+" /nTiene: "+getPaginas()+" paginas"+" /nEl precio es de: "+getPrecio()+" /nSemanal: "+getSemanal()+" /nSemana de publicacion: "+getSemana()+" /nsu mes depublicacion es: "+getMes()+" /nel año de publicacion es: "+getAño()+" /nSu codigo es: "+getCodigo()+" /nEl recargo es de: "+getRecargo();
		
	}
}
