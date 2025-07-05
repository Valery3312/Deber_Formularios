import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraForm extends JFrame {
    private JPanel JPanel1;
    private JTextField Valor1_Suma;
    private JTextField Valor2_Suma;
    private JButton B_Borrar_Suma;
    private JButton B_Sumar;
    private JTextField Valor1_Resta;
    private JTextField Valor2_Resta;
    private JButton B_Restar;
    private JButton B_Borrar_Resta;
    private JTextField Valor1_Multiplicacion;
    private JTextField Valor2_Multiplicacion;
    private JButton B_Borrar_Multiplicacion;
    private JButton B_Multiplicar;
    private JTextField Valor1_Division;
    private JTextField Valor2_Divsion;
    private JButton B_Dividir;
    private JButton B_Borrar_Division;
    private JLabel Resultado_Suma;
    private JLabel Resultado_Resta;
    private JLabel Resultado_Multiplicacion;
    private JLabel Resultado_Division;

    //Método construcotr//
    public CalculadoraForm(){
        setTitle("Operaciones Básicas");
        setContentPane(JPanel1);
        setSize(600,600);
        setVisible(true);
        setLocationRelativeTo(null);

    //Botones//
        // Botón suma //
        B_Sumar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double V1_S = Double.parseDouble(Valor1_Suma.getText());
                double V2_S = Double.parseDouble(Valor2_Suma.getText());
                double resultado = V1_S + V2_S ;
                Resultado_Suma.setText(String.format("Resultado: " + "%.2f", resultado));

                if (resultado % 1 == 0) {
                    // Es un número entero
                    Resultado_Suma.setText(String.valueOf((int) resultado));
                } else {
                    // Es decimal, mostrar con 2 decimales
                    Resultado_Suma.setText(String.format("%.2f", resultado));
                }
            }
        });
        // Botón borrar suma //
        B_Borrar_Suma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Valor1_Suma.setText("");
                Valor2_Suma.setText("");
                Resultado_Suma.setText("");
            }
        });
        // Boton Restar //
        B_Restar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double V1_R = Double.parseDouble(Valor1_Resta.getText());
                double V2_R = Double.parseDouble(Valor2_Resta.getText());
                double resultado = V1_R - V2_R ;
                Resultado_Resta.setText("Resultado: " + resultado);

                if (resultado % 1 == 0) {
                    // Es un número entero
                    Resultado_Resta.setText(String.valueOf((int) resultado));
                } else {
                    // Es decimal, mostrar con 2 decimales
                    Resultado_Resta.setText(String.format("%.2f", resultado));
                }
            }
        });
        // Boton borrar resta //
        B_Borrar_Resta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Valor1_Resta.setText("");
                Valor2_Resta.setText("");
                Resultado_Resta.setText("");
            }
        });
        // Boton Multiplicacion //
        B_Multiplicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double V1_M = Double.parseDouble(Valor1_Multiplicacion.getText());
                double V2_M = Double.parseDouble(Valor2_Multiplicacion.getText());
                double resultado = V1_M * V2_M ;
                Resultado_Multiplicacion.setText("Resultado: " + resultado);


                if (resultado % 1 == 0) {
                    // Es un número entero
                    Resultado_Multiplicacion.setText(String.valueOf((int) resultado));
                } else {
                    // Es decimal, mostrar con 2 decimales
                    Resultado_Multiplicacion.setText(String.format("%.2f", resultado));
                }
            }
        });
        // Boton borrar multiplicación
        B_Borrar_Multiplicacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Valor1_Multiplicacion.setText("");
                Valor2_Multiplicacion.setText("");
                Resultado_Multiplicacion.setText("");
            }
        });
        // Boton división //
        B_Dividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               double V1_D = Double.parseDouble(Valor1_Division.getText());
               double V2_D = Double.parseDouble(Valor2_Divsion.getText());
               double resultado = V1_D / V2_D;
               Resultado_Division.setText(String.format("Resultado: " + "%.2f", resultado));

                if (resultado % 1 == 0) {
                    // Es un número entero
                    Resultado_Division.setText(String.valueOf((int) resultado));
                } else {
                    // Es decimal, mostrar con 2 decimales
                    Resultado_Division.setText(String.format("%.2f", resultado));
                }
            }
        });
        // Boton borrar división //
        B_Borrar_Division.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Valor1_Division.setText("");
                Valor2_Divsion.setText("");
                Resultado_Division.setText("");
            }
        });
    }
    public static void main(String[] args){
        new CalculadoraForm();


    }
}
