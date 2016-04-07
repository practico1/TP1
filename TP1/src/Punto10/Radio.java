package Punto10;

public class Radio extends Programa{
	private String P_musicalizacion;
	private int comerciales;
	public Radio(String titulo, String p_responsable, String nom_Emisora, int codigo, int duracion, int h_inicio,
			String nombre, String apellido, int dNI, String titulo2, String p_responsable2, String nom_Emisora2,
			int codigo2, int duracion2, int h_inicio2, String p_musicalizacion, int comerciales) {
		super(titulo, p_responsable, codigo, nombre, apellido, titulo2,
				codigo2, duracion2, h_inicio2);
		P_musicalizacion = p_musicalizacion;
		this.comerciales = comerciales;
	}
	public String getP_musicalizacion() {
		return P_musicalizacion;
	}
	public void setP_musicalizacion(String p_musicalizacion) {
		P_musicalizacion = p_musicalizacion;
	}
	public int getComerciales() {
		return comerciales;
	}
	public void setComerciales(int comerciales) {
		this.comerciales = comerciales;
	}
	
	
	
}
