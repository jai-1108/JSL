import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("String Search and Replace");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2));

        JLabel label1 = new JLabel("Enter the string: ");
        JTextField textField1 = new JTextField();

        JLabel label2 = new JLabel("Enter the search string: ");
        JTextField textField2 = new JTextField();

        JLabel label3 = new JLabel("Enter the replace string: ");
        JTextField textField3 = new JTextField();

        JButton button = new JButton("Search and Replace");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = textField1.getText();
                String searchString = textField2.getText();
                String replaceString = textField3.getText();

                int count = 0;
                String replacedString = input;
                int index = replacedString.indexOf(searchString);
                while (index != -1) {
                    count++;
                    replacedString = replacedString.substring(0, index) + replaceString + replacedString.substring(index + searchString.length());
                    index = replacedString.indexOf(searchString);
                }

                JOptionPane.showMessageDialog(frame, "Number of occurrences: " + count);
                JOptionPane.showMessageDialog(frame, "Replaced string: " + replacedString);
            }
        });

        panel.add(label1);
        panel.add(textField1);
        panel.add(label2);
        panel.add(textField2);
        panel.add(label3);
        panel.add(textField3);
        panel.add(button);

        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
}