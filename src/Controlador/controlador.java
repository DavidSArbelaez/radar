package Controlador;

import java.util.List;
import modelo.Horario;
import vista.VentanaHorarioAviones;
import java.util.ArrayList;
import java.util.Date;
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
	
	private List<Horario> vuelos;
    private VentanaHorarioAviones vista;

    public Controlador() {
        vuelos = obtenerVuelosEjemplo();
        vista = new VentanaHorarioAviones(vuelos);
    }

    private List<Horario> obtenerVuelosEjemplo() {
        // Crear una lista de vuelos de ejemplo utilizando la clase Horario
        List<Horario> vuelos = new ArrayList<>();

        vuelos.add(new Horario(
                new Date(2023, 5, 31, 10, 0),
                new Date(2023, 5, 31, 12, 0)
        ));
        vuelos.add(new Horario(
                new Date(2023, 5, 31, 12, 30),
                new Date(2023, 5, 31, 14, 30)
        ));
        vuelos.add(new Horario(
                new Date(2023, 5, 31, 14, 45),
                new Date(2023, 5, 31, 16, 45)
        ));
        vuelos.add(new Horario(
                new Date(2023, 5, 31, 16, 20),
                new Date(2023, 5, 31, 18, 20)
        ));
        vuelos.add(new Horario(
                new Date(2023, 5, 31, 18, 15),
                new Date(2023, 5, 31, 20, 15)
        ));

        return vuelos;
    }

	
}


