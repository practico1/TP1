package Punto12;

public class Fecha {
	int dia, mes, anio, num;
	
	public Fecha(){
	 dia=1;mes=1;anio=0;num=NumAnio(dia,mes,anio);
	}
	public int NumAnio(int dia,int mes,int anio){
		return (dia+ (DiaMes(mes-1)));
	}
	public int DiaMes(int ms){
		if (ms==0){
			return 0;
		}
		if (ms==1){
			return 31;
		}
		if (ms==2){
			return (DiaMes(ms-1))+28;
		}
		if (ms%2==0){
			if(ms <8){
				return (DiaMes(ms-1))+30;
			}else{
				return (DiaMes(ms-1))+31;
			}
		}else{
			if(ms <8){
				return (DiaMes(ms-1))+31;
			}else{
				return (DiaMes(ms-1))+30;
			}
		}
	}
	public boolean VerificarDia(int dia){
		return (dia>0 && dia<(CantidadMes()));
	}
	public boolean VerificarMes(int mes){
		return(mes>0 && mes<13);
	}
	public boolean VerificarFecha(){
		return ( VerificarDia(dia) && VerificarMes(mes));
	}
	public int CantidadMes(){
		if (mes==1){
			return 31;
		}
		if (mes==2){
			return 28;
		}
		if (mes%2==0){
			if(mes <8){
				return 30;
			}else{
				return 31;
			}
		}else{
			if(mes <8){
				return 31;
			}else{
				return 30;
			}
		}
	}
	public void Mostrar(){
		System.out.print(dia+"/"+mes+"/"+anio);
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		if(VerificarDia(dia)){
			this.dia = dia;
		}else{
			System.out.println("Numero Incorrecto, ingrese otro: ");
			setDia(Console.readInt());
		}
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		if(VerificarDia(mes)){
			this.mes = mes;
		}else{
			System.out.println("Numero Incorrecto, ingrese otro: ");
			setMes(Console.readInt());
		}
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	public int getNum() {
		return num;
	}
	public void setNum() {
		this.num = NumAnio(dia,mes,anio);
	}
	
}
