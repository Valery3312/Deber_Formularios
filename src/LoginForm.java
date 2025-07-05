import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame {
    private JPanel JPanel2;
    private JTextField Text_Usuario;
    private JPasswordField Text_Password;
    private JButton B_Acceso;
    private JButton B_Limpiar;
    private JLabel Resultado_Login;

    public LoginForm() {
        setTitle("Ingreso de usuario");
        setContentPane(JPanel2);
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        B_Acceso.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = Text_Usuario.getText();
                String clave = new String(Text_Password.getPassword());

                if (usuario.equals("CENESTUR") && clave.equals("C1234")) {
                    Resultado_Login.setText("✅ Acceso permitido");
                } else {
                    Resultado_Login.setText("❌ Acceso denegado");
                }
            }
        });

        B_Limpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Text_Usuario.setText("");
                Text_Password.setText("");
                Resultado_Login.setText("");
            }
        });
    }

    public static void main(String[] args) {
        new LoginForm(); // ya hereda de JFrame, no necesitas crear otro frame
    }
}