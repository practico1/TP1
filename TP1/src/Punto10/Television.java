package Punto10;

public class Television extends Programa {
	private int c_tanda;

	
	public Television(String titulo, String nom_Emisora, int codigo, int duracion, int h_inicio, Persona p_responsable,
			int c_tanda) {
		super(titulo, nom_Emisora, codigo, duracion, h_inicio, p_responsable);
		this.c_tanda = c_tanda;
	}

	public int getC_tanda() {
		return c_tanda;
	}

	public void setC_tanda(int c_tanda) {
		this.c_tanda = c_tanda;
	}


	public String toString(){ 
		return "TELEVISION :"+" /nCantidad de Propagandas "+getC_tanda()+" /nPersona Responsable: "+getP_responsable()+"¨/nNombre de la emisora "+getNom_Emisora()+" /nCodigo: "+getCodigo()+"/nDuracion: "+getDuracion()+" /nHora de inicio: "+getH_inicio();
	}
	
	
	
}
