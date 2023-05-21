package ModeloVista;

import java.util.ArrayList;

import Modelo.Coordenadas;

public class ComponenteGraficos implements IGraficos{
	private ArrayList<Avion> aviones;

	
	
	public ComponenteGraficos() {
		super();
		this.aviones = new ArrayList<Avion>();
	}

	public void add(IGraficos hoja) {
		this.add(hoja);
	}
	
	@Override
	public void moverAvion(Coordenadas c,int id) {
		for (Avion avion : aviones) {
			if(avion.isAvion(id)) {
				avion.moverAvion(c, id);
				break;
			}
		}
	}

	@Override
	public void dibujar() {
		for (Avion avion : aviones) {
			avion.dibujar();
		}
	}
}
