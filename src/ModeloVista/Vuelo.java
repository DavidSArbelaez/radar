package ModeloVista;

import java.time.LocalDateTime;

public class Vuelo {
	private Horario horario;
	private String Aeropuertollegada;
	private String Aeropuertosalida;
	private Avion avion;
	private String estado;
	private int id;

	public Vuelo(String aeropuertollegada, String aeropuertosalida, Avion av,int Id) {
		super();
		// this.horario =
		LocalDateTime fechaActual = LocalDateTime.now();
		generarHorario(fechaActual.getYear(), fechaActual.getMonth().getValue(), fechaActual.getDayOfMonth(),
				fechaActual.getHour(), fechaActual.getMinute());

		this.Aeropuertollegada = aeropuertollegada;
		this.Aeropuertosalida = aeropuertosalida;
		this.avion = av;
		this.estado="Vuelo creado";
		this.id=Id;
	}

	private void generarHorario(int year, int month, int day, int hr, int min) {
		this.horario = new Horario(year, month, day, hr, min, year, month, day, hr, min);
	}

	public void mostrarHorario() {

	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getAeropuertollegada() {
		return Aeropuertollegada;
	}

	public String getAeropuertosalida() {
		return Aeropuertosalida;
	}

	public Avion getAvion() {
		return avion;
	}

	public int getId() {
		return id;
	}

	
	
}
