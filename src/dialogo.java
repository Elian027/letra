import javax.swing.*;
import java.text.DecimalFormat;

public class dialogo {
    public static void main(String[] args) {
        DecimalFormat dfr = new DecimalFormat("#.00");
        try {
            String nom = JOptionPane.showInputDialog("Ingrese su nombre: ");
            double peso =
                    Double.parseDouble(JOptionPane.showInputDialog("¿Cuál es tu peso? [kg]"));
            double alt =
                    Double.parseDouble(JOptionPane.showInputDialog("¿Cuál es tu altura? [m]"));
            double res = ((peso)/alt*alt);
            String msj =
                    String.format("%s su IMC es -> %f",nom, res);
            JOptionPane.showMessageDialog(null,msj);
        } catch (Exception ex) {
            System.out.println("Error :"+ex.getMessage());
        }
    }
}
