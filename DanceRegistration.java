import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DanceRegistration {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Dance Registration");
        frame.setSize(350, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 2, 5, 5));

        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField();

        JLabel ageLabel = new JLabel("Age:");
        JTextField ageField = new JTextField();

        JLabel styleLabel = new JLabel("Dance Style:");
        JTextField styleField = new JTextField();

        JLabel contactLabel = new JLabel("Contact:");
        JTextField contactField = new JTextField();

        JButton submitButton = new JButton("Register");

        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(ageLabel);
        panel.add(ageField);
        panel.add(styleLabel);
        panel.add(styleField);
        panel.add(contactLabel);
        panel.add(contactField);
        panel.add(new JLabel()); // empty cell
        panel.add(submitButton);

        frame.add(panel);
        frame.setVisible(true);

        // Action Listener
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String info = "Name: " + nameField.getText() +
                              "\nAge: " + ageField.getText() +
                              "\nStyle: " + styleField.getText() +
                              "\nContact: " + contactField.getText();

                JOptionPane.showMessageDialog(frame, "Registered Successfully!\n" + info);
            }
        });
    }
}

