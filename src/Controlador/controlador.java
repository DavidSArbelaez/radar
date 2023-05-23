package Controlador;
import java.util.List;

import Modelo.Aeropuerto;
import Modelo.LectorFicheros;
public class controlador {
	
	private List<Aeropuerto> Aeropuertos;
	private LectorFicheros lf= new LectorFicheros();
	
	public controlador() {
		super();
		this.Aeropuertos = crearAeropuertos();
	}
	
	

	
	

	private List<Aeropuerto> crearAeropuertos() {
		return lf.ObtenerDatosArchivoAero("C:\\Users\\david\\Documents\\Nueva carpeta\\radar\\src\\Info\\aeropuertos.txt");
	}
	
	public void Prueba() {
		for (Aeropuerto aeropuerto : Aeropuertos) {
			System.out.println(aeropuerto.toString());
		}
	}
}
