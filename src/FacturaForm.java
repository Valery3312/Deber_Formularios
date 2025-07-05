import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FacturaForm extends JFrame {
    private JTextField Text_Codigo;
    private JTextField Text_Producto;
    private JButton B_Calcular;
    private JPanel JPanel3;
    private JLabel Label_Subtotal;
    private JLabel Label_Total_A_Pagar;
    private JTextField Text_Precio;
    private JTextField Text_Cantidad;
    private JLabel Label_Iva;
    private JButton B_Nuevo_Ingreso;


    public FacturaForm() {
        setTitle("Operaciones Básicas");
        setContentPane(JPanel3);
        setSize(600, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);

        B_Calcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String codigo = Text_Codigo.getText();
                    String producto = Text_Producto.getText();

                    double precioUnitario = Double.parseDouble(Text_Precio.getText());
                    double cantidad = Double.parseDouble(Text_Cantidad.getText());
                    double iva = 15.0;

                    double subtotal = precioUnitario * cantidad;
                    double valorIva = subtotal * (iva / 100);
                    double total = subtotal + valorIva;

                    Label_Subtotal.setText(String.format("Subtotal: $%.2f", subtotal));
                    Label_Total_A_Pagar.setText(String.format("TOTAL A PAGAR: $%.2f", total));
                    Label_Iva.setText(String.format("Iva correspondiente: $%.2f", valorIva));

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null,
                            "Por favor, ingrese valores numéricos válidos para precio, cantidad e IVA.",
                            "Error de entrada",
                            JOptionPane.ERROR_MESSAGE);

                }
            }
        });
        B_Nuevo_Ingreso.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Text_Codigo.setText("");
                Text_Producto.setText("");
                Text_Precio.setText("");
                Text_Cantidad.setText("");
                Label_Subtotal.setText("");
                Label_Iva.setText("");
                Label_Total_A_Pagar.setText("");


            }
        });
    }


    public static void main(String[] args) {
        new FacturaForm();
    }
}
