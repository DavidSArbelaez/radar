package Controlador;

import javax.swing.ImageIcon;

import Modelo.ImageModel;
import vista.ImageView;

public class ImageController {
	private ImageModel model;
    private ImageView view;
    
    public ImageController(ImageModel model, ImageView view) {
        this.model = model;
        this.view = view;
    }
    
    public void updateView() {
        ImageIcon image1 = model.getImage1();
        ImageIcon image2 = model.getImage2();
        
        view.setImage1(image1);
        view.setImage2(image2);
    }
}
