package Punto10;

public class Radio extends Programa{
	Persona P_musicalizacion;
	private int comerciales;
	
	public Radio(String titulo, String nom_Emisora, int codigo, int duracion, int h_inicio, Persona p_responsable,
			Persona p_musicalizacion, int comerciales) {
		super(titulo, nom_Emisora, codigo, duracion, h_inicio, p_responsable);
		P_musicalizacion = p_musicalizacion;
		this.comerciales = comerciales;
	}
	public Persona getP_musicalizacion() {
		return P_musicalizacion;
	}
	public void setP_musicalizacion(Persona p_musicalizacion) {
		P_musicalizacion = p_musicalizacion;
	}
	public int getComerciales() {
		return comerciales;
	}
	public void setComerciales(int comerciales) {
		this.comerciales = comerciales;
	}

	public String toString(){
		return " Radio"+" /nResponsable de musicalizacion: "+getP_musicalizacion()+" /nPersona Responsable del programa: "+ getP_responsable()+" /nNombre de la emisora: "+getNom_Emisora()+" /nCodigo: "+getCodigo()+" /nDuracion del programa: "+getDuracion()+" /nHora de inicio: "+getH_inicio()+ " /nComerciales: "+getComerciales();
	}
	
	
}
