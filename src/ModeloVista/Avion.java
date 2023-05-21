package ModeloVista;

import Modelo.Coordenadas;

public class Avion extends AvionG {

	private int id;

	public Avion(Coordenadas cords, int Id) {
		super(cords);
		this.id = Id;
	}

	public int getId() {
		return id;
	}

	public boolean isAvion(Avion Avi) {
		return Avi.getId() == this.getId() ? true : false;
	}

	public boolean isAvion(int idA) {
		return idA == this.getId() ? true : false;
	}

}
