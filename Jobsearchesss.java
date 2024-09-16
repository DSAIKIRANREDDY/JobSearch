import java.awt.*;
import javax.swing.*;

public class Jobsearchesss extends JFrame {

    public Jobsearchesss() {
        // Frame properties
        setSize(1000, 800);
        setTitle("View Job Sheet");
        setLocation(200, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create main panel with GridBagLayout
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(10, 10, 10, 10); // Padding for components

        // Heading label
        gbc.gridy = 0;
        gbc.gridx = 0;
        gbc.gridwidth = GridBagConstraints.REMAINDER; // Span both columns
        JLabel headingLabel = new JLabel("EDIT JOB SHEET", JLabel.CENTER);
        headingLabel.setOpaque(true);
        headingLabel.setBackground(Color.BLUE);
        headingLabel.setForeground(Color.WHITE);
        headingLabel.setFont(new Font("Arial", Font.BOLD, 20)); // Set font size
        mainPanel.add(headingLabel, gbc);

        // Define rows of the form
        String[] labels = {
            "Client Name:", "Contact Info:", "Received Date:", "Inventory Received:",
            "Inventory Image/Document/Video:", "Reported Issues:", "Client Notes:",
            "Assigned Technicians:", "Estimated Amount:", "Deadline:", "Status:"
        };
        String[] defaultValues = {
            "John Doe", "1234567890", "12-09-2024", "Laptop",
            "Image/Document/Video info", "Power failure\nScreen not working\nOther issues",
            "Client mentioned it happens frequently.\nNeeds urgent attention.\nCheck the warranty.",
            "James Tech", "$200", "15-09-2024", "In Progress"
        };

        // Add labels and text fields to the panel
        for (int i = 0; i < labels.length; i++) {
            gbc.gridy = i + 1; // Start from the second row
            JLabel label = new JLabel(labels[i]);
            gbc.gridx = 0;
            gbc.gridwidth = 1; // Reset grid width
            mainPanel.add(label, gbc);

            gbc.gridx = 1;
            gbc.gridwidth = GridBagConstraints.REMAINDER; // Take up remaining space
            JTextField textField = new JTextField(defaultValues[i]);
            textField.setPreferredSize(new Dimension(400, 30)); // Set preferred size for width
            mainPanel.add(textField, gbc);
        }

        // "Save Changes" button
        gbc.gridy = labels.length + 1;
        gbc.gridx = 0;
        gbc.gridwidth = GridBagConstraints.REMAINDER; // Span both columns
        JButton saveButton = new JButton("Save Changes");
        saveButton.setBackground(Color.BLUE);
        saveButton.setForeground(Color.WHITE);
        mainPanel.add(saveButton, gbc);

        // "Cancel" button
        gbc.gridy = labels.length + 2;
        gbc.gridx = 0;
        gbc.gridwidth = GridBagConstraints.REMAINDER; // Take up remaining space
        JButton cancelButton = new JButton("Cancel");
        cancelButton.setBackground(Color.WHITE);
        cancelButton.setForeground(Color.BLUE);
        mainPanel.add(cancelButton, gbc);

        // Add main panel to the frame
        getContentPane().add(mainPanel);

        // Set frame visibility
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Jobsearchesss()); // Ensure GUI creation is on the Event Dispatch Thread
    }
}
