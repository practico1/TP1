package Punto10;

public  class Programa {
private String titulo,nom_Emisora;
private int codigo,duracion,H_inicio;
Persona P_responsable;


		public Programa(String titulo, String nom_Emisora, int codigo, int duracion, int h_inicio, Persona p_responsable) {
	super();
	this.titulo = titulo;
	this.nom_Emisora = nom_Emisora;
	this.codigo = codigo;
	this.duracion = duracion;
	H_inicio = h_inicio;
	P_responsable = p_responsable;
}

		public String getTitulo() {
			return titulo;
		}

		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
		
		public String getNom_Emisora() {
			return nom_Emisora;
		}

		public void setNom_Emisora(String nom_Emisora) {
			this.nom_Emisora = nom_Emisora;
		}

		public int getCodigo() {
			return codigo;
		}

		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}

		public int getDuracion() {
			return duracion;
		}

		public void setDuracion(int duracion) {
			this.duracion = duracion;
		}

		public int getH_inicio() {
			return H_inicio;
		}

		public void setH_inicio(int h_inicio) {
			H_inicio = h_inicio;
		}

		public Persona getP_responsable() {
			return P_responsable;
		}

		public void setP_responsable(Persona p_responsable) {
			P_responsable = p_responsable;
		}

		public String toString(){
			return getP_responsable()+""+getNom_Emisora()+""+getCodigo()+""+getDuracion()+""+getH_inicio();
		}
	}
