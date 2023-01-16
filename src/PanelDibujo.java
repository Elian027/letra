import javax.swing.*;
import java.awt.*;

public class PanelDibujo extends JPanel {
    public void paintComponent (Graphics g) { //dibuja una x desde las esquinas del panel
        super.paintComponent(g); //Llama a paintComponent para que el panel se muestre correctamente
        int ancho = getWidth();
        int alto = getHeight();
        g.drawLine(110,50,110,300); //dibuja linea desde esquina superior izquierda a esquina inferior derecha
        g.drawLine(110,50,300,50);//dibuja linea desde esquina inferior izquierda a superior derecha
        g.drawLine(110,180,270,180);
        g.drawLine(110,300,300,300);
    }
}
