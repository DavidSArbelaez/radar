package ModeloVista;

import Modelo.Coordenadas;

public abstract class AvionG implements IGraficos{
	
	protected Coordenadas cords;
	
	public AvionG(Coordenadas cords) {
		super();
		this.cords = cords;
	}

	@Override
	public void dibujar() {
				
	}

	@Override
	public void moverAvion(Coordenadas c, int id) {

		/*
		 * Este cod sirve pero para la clase hija
		 * if (this.isAvion(id)) { this.cords.setX(c.getX()); this.cords.setY(c.getY());
		 * dibujar(); }
		 */
		this.cords.setX(c.getX());
		this.cords.setY(c.getY());
		dibujar();
	}
}
