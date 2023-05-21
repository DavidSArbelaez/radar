package Launcher;

import Controlador.ImageController;
import Modelo.ImageModel;
import vista.ImageView;

public class Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImageModel model = new ImageModel();
        ImageView view = new ImageView();
        ImageController controller = new ImageController(model, view);
        
        // Actualizar la vista
        controller.updateView();
	}

}
