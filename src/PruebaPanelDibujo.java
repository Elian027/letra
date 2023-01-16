import javax.swing.*;
public class PruebaPanelDibujo {
    public static void main(String[] args) {
        PanelDibujo panel = new PanelDibujo();
        JFrame ap = new JFrame();
        ap.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ap.add(panel);
        ap.setSize(400,400);
        ap.setVisible(true);
    }
}
