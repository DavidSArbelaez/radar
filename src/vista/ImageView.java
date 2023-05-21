package vista;

import javax.swing.*;
import java.awt.*;

public class ImageView extends JFrame {
	private JPanel panel1;
    private JPanel panel2;
    
    public ImageView() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Ejemplo MVC");
        setLayout(new GridLayout(1, 2));
        
        panel1 = new JPanel();
        panel2 = new JPanel();
        
        add(panel1);
        add(panel2);
        
        pack();
        setVisible(true);
    }
    
    public void setImage1(ImageIcon image) {
        JLabel label = new JLabel(image);
        panel1.removeAll();
        panel1.add(label);
        panel1.revalidate();
        panel1.repaint();
    }
    
    public void setImage2(ImageIcon image) {
        JLabel label = new JLabel(image);
        panel2.removeAll();
        panel2.add(label);
        panel2.revalidate();
        panel2.repaint();
    }
}
