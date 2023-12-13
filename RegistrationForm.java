import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationForm {

    private JFrame frame;
    private JTextField textFieldUsername;
    private JTextField textFieldEmail;
    private JPasswordField passwordFieldPassword;
    private JTextField textFieldDOB;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    RegistrationForm window = new RegistrationForm();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public RegistrationForm() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame("Registration Form");
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel lblUsername = new JLabel("Username:");
        lblUsername.setBounds(10, 11, 80, 14);
        frame.getContentPane().add(lblUsername);

        textFieldUsername = new JTextField();
        textFieldUsername.setBounds(100, 8, 240, 20);
        frame.getContentPane().add(textFieldUsername);
        textFieldUsername.setColumns(10);

        JLabel lblEmail = new JLabel("Email:");
        lblEmail.setBounds(10, 46, 80, 14);
        frame.getContentPane().add(lblEmail);

        textFieldEmail = new JTextField();
        textFieldEmail.setBounds(100, 43, 240, 20);
        frame.getContentPane().add(textFieldEmail);
        textFieldEmail.setColumns(10);

        JLabel lblPassword = new JLabel("Password:");
        lblPassword.setBounds(10, 81, 80, 14);
        frame.getContentPane().add(lblPassword);

        passwordFieldPassword = new JPasswordField();
        passwordFieldPassword.setBounds(100, 78, 240, 20);
        frame.getContentPane().add(passwordFieldPassword);

        JLabel lblDOB = new JLabel("DOB:");
        lblDOB.setBounds(10, 116, 80, 14);
        frame.getContentPane().add(lblDOB);

        textFieldDOB = new JTextField();
        textFieldDOB.setBounds(100, 113, 240, 20);
        frame.getContentPane().add(textFieldDOB);
        textFieldDOB.setColumns(10);

        JButton btnSubmit = new JButton("Submit");
        btnSubmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                // add code here to process the form data
                System.out.println("Username: " + textFieldUsername.getText());
                System.out.println("Email: " + textFieldEmail.getText());
                System.out.println("Password: " + new String(passwordFieldPassword.getPassword()));
                System.out.println("DOB: " + textFieldDOB.getText());
            }
        });
        btnSubmit.setBounds(190, 177, 89, 23);
        frame.getContentPane().add(btnSubmit);
    }
}