import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class v1 {
    private JPanel panel1;
    private JTextField peso;
    private JTextField altura;
    private JButton calcularButton;
    private JButton cancelarButton;
    private JLabel respuesta;

    public v1() {
        cancelarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                peso.setText("");
                altura.setText("");
                respuesta.setText("");
            }
        });
        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DecimalFormat dfr = new DecimalFormat("#.00");
                double a = Double.parseDouble(peso.getText());
                double b = Double.parseDouble(altura.getText());
                double res = (a/Math.pow(b,2));
                String msj = "Su IMC es -> "+dfr.format(res);
                respuesta.setText(msj);
                //String msj = "Su IMC es -> "+res;
                //JOptionPane.showMessageDialog(null,msj+res);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("v1");
        frame.setContentPane(new v1().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
    public void setPeso (JTextField peso) {
        this.peso = peso;
    }
    public void setAltura (JTextField altura) {
        this.altura = altura;
    }
}
