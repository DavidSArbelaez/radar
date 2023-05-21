package ModeloVista;

import java.util.Date;

public class Horario {
	private Date FechaSalida;
	private Date FechaLlegada ;
	public Horario(int yearS,int monthS,int dateS,int hrsS,int minS,int yearL,int monthL,int dateL,int hrsL,int minL) {
		super();
		
		DateLConstructor(yearL, monthL, dateL, hrsL, minL);
		DateSConstructor(yearS, monthS, dateS, hrsS, minS);
	}
	
	private void DateLConstructor(int year,int month,int day,int hr,int min) {
		if(year>1900 && month>=0 && month<=11 && day>=0 && day<=31 && hr>=0 && hr<=23 && min>=0 && min<=59) {
			this.FechaLlegada= new Date(year, month, day, hr, min);
		}else {
			//Mensaje en pantalla de que los daots no son los correctos
		}
	}
	
	private void DateSConstructor(int year,int month,int day,int hr,int min) {
		if(year>1900 && month>=0 && month<=11 && day>=0 && day<=31 && hr>=0 && hr<=23 && min>=0 && min<=59) {
			this.FechaSalida= new Date(year, month, day, hr, min);
		}else {
			//Mensaje en pantalla de que los daots no son los correctos
		}
	}

	public Date getFechaSalida() {
		return FechaSalida;
	}

	public Date getFechaLlegada() {
		return FechaLlegada;
	}

	@Override
	public String toString() {
		return "Horario [FechaSalida=" + FechaSalida + ", FechaLlegada=" + FechaLlegada + "]";
	}
	
	
}
