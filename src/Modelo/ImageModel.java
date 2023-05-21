package Modelo;
import javax.swing.*;

public class ImageModel {
	private ImageIcon image1;
    private ImageIcon image2;
    
    public ImageModel() {
        image1 = new ImageIcon("ruta_de_la_imagen_1.jpg");
        image2 = new ImageIcon("ruta_de_la_imagen_2.jpg");
    }
    
    public ImageIcon getImage1() {
        return image1;
    }
    
    public ImageIcon getImage2() {
        return image2;
    }
}
