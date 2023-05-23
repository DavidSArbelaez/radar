package Launcher;

import Controlador.ImageController;
import Controlador.controlador;
import Modelo.ImageModel;
import Modelo.LectorFicheros;
import vista.ImageView;

import java.io.File;
public class Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ImageModel model = new ImageModel();
        ImageView view = new ImageView();
        ImageController controller = new ImageController(model, view);
        
        // Actualizar la vista
        controller.updateView();*/
		
		
		controlador c = new controlador();
		c.Prueba();
	}

}
