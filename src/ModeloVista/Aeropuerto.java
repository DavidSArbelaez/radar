package ModeloVista;

import java.util.ArrayList;

import Modelo.Coordenadas;

public class Aeropuerto {
	private Coordenadas cords;
	private ArrayList<Vuelo> vuelos;
	private String nombre;
	private int contIds;

	public Aeropuerto(Coordenadas cords, String name) {
		super();
		this.cords = cords;
		this.vuelos = new ArrayList<Vuelo>();
		this.nombre = name;
		this.contIds = 0;
	}

	public void add(Vuelo v) {
		vuelos.add(v);
	}

	public void remove(int id) {
		for (int i = 0; i < vuelos.size(); i++) {
			if (vuelos.get(i).getId() == id) {
				vuelos.remove(i);
				break;
			}
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void crearVuelo(Vuelo v) {
		add(v);
	}

	public void crearVuelo(Avion av,String AirP) {
		add(new Vuelo(AirP, this.nombre, av, getContIds()));
	}

	private int getContIds() {
		contIds+=1;
		return contIds;
	}
	
	
}
