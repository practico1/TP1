package Punto10;

public class Television extends Programa {
	private int c_tanda;

	public Television(String titulo, String p_responsable, String nom_Emisora, int codigo, int duracion, int h_inicio,
			String nombre, String apellido, int dNI, String titulo2, String p_responsable2, String nom_Emisora2,
			int codigo2, int duracion2, int h_inicio2, int c_tanda) {
		super(titulo, p_responsable, codigo, nombre, apellido, titulo2,
				codigo2, duracion2, h_inicio2);
		this.c_tanda = c_tanda;
	}

	public int getC_tanda() {
		return c_tanda;
	}

	public void setC_tanda(int c_tanda) {
		this.c_tanda = c_tanda;
	}

	
	
	
}
