import javax.swing.*;
import java.awt.*;

public class PanelDibujo extends JPanel {
    public void paintComponent (Graphics g) { //dibuja una x desde las esquinas del panel
        super.paintComponent(g); //Llama a paintComponent para que el panel se muestre correctamente
        int ancho = getWidth();
        int alto = getHeight();
        g.draw3DRect(50,10,75,25, true); //dibuja linea desde esquina superior izquierda a esquina inferior derecha
        g.draw3DRect(50,100,75,25, true);//dibuja linea desde esquina inferior izquierda a superior derecha
        g.draw3DRect(25,10,25,115, true);
        g.draw3DRect(50,55,55,25, true);
    }
}
