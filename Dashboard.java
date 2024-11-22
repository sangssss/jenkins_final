import javax.swing.*;
import java.awt.*;

public class Dashboard {

    public static void main(String[] args) {
        // Creating the frame for the dashboard
        JFrame frame = new JFrame("Simple Dashboard");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        
        // Creating the main panel
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Adding title label
        JLabel titleLabel = new JLabel("Simple Dashboard", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        panel.add(titleLabel);

        // Adding a button to update data (example action)
        JButton updateButton = new JButton("Update Data");
        updateButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "Data Updated!");
        });
        panel.add(updateButton);

        // Adding a label for showing some static information
        JLabel infoLabel = new JLabel("Some info: Sample Data");
        infoLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        panel.add(infoLabel);

        // Adding panel to the frame
        frame.add(panel);
        frame.setVisible(true);
    }
}
