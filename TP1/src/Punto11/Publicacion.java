package Punto11;

public class Publicacion {
private int codigo,paginas,precio;
private String titulo,responsable,editor,mes,año;

	public Publicacion(int codigo, int paginas, int precio, String titulo, String responsable, String editor, String mes,
		String año) {
	super();
	this.codigo = codigo;
	this.paginas = paginas;
	this.precio = precio;
	this.titulo = titulo;
	this.responsable = responsable;
	this.editor = editor;
	this.mes = mes;
	this.año = año;
}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getPaginas() {
		return paginas;
	}
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public String getMes() {
		return mes;
	}
	public void setMes(String mes) {
		this.mes = mes;
	}
	public String getAño() {
		return año;
	}
	public void setAño(String año) {
		this.año = año;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getResponsable() {
		return responsable;
	}
	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}
	public String getEditor() {
		return editor;
	}
	public void setEditor(String editor) {
		this.editor = editor;
	}

	
	
}
