import java.awt.*;
import javax.swing.*;

public class JobSearchess extends JFrame {

    public JobSearchess() {
        // Frame properties
        setSize(1000, 800);
        setTitle("View Job Sheet");
        setLocation(200, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create the main panel with null layout
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(null); // Null layout to set bounds manually
        mainPanel.setBackground(Color.WHITE);
        
        // Panel for heading with blue background
        JPanel headerPanel = new JPanel();
        headerPanel.setBackground(Color.BLUE);
        headerPanel.setBounds(20, 20, 960, 50); // Full width with 20 px padding on sides
        headerPanel.setLayout(new FlowLayout(FlowLayout.CENTER));

        JLabel headerLabel = new JLabel("VIEW JOB SHEET");
        headerLabel.setForeground(Color.WHITE);
        headerLabel.setFont(new Font("Arial", Font.BOLD, 24));
        headerPanel.add(headerLabel);
        mainPanel.add(headerPanel);

        // Labels and Text Fields aligned horizontally
        int labelWidth = 200;
        int fieldWidth = 760; // Adjusted to fit within frame width
        int xPadding = 20;
        int yPadding = 20;
        int fieldHeight = 30;
        int labelHeight = 30; // Match label height to field height
        int verticalGap = 20; // Space between components

        // Start Y-coordinate for placing fields (just below headerPanel)
        int currentY = 90; // Adjust based on header height

        // Helper method to increment the currentY position
        currentY = addLabelAndField(mainPanel, "Client Name:", "John Doe", currentY, xPadding, labelWidth, fieldWidth, labelHeight, fieldHeight, verticalGap);
        currentY = addLabelAndField(mainPanel, "Contact Info:", "1234567890", currentY, xPadding, labelWidth, fieldWidth, labelHeight, fieldHeight, verticalGap);
        currentY = addLabelAndField(mainPanel, "Received Date:", "12-09-2024", currentY, xPadding, labelWidth, fieldWidth, labelHeight, fieldHeight, verticalGap);
        currentY = addLabelAndField(mainPanel, "Inventory Received:", "Laptop", currentY, xPadding, labelWidth, fieldWidth, labelHeight, fieldHeight, verticalGap);

        // "Inventory Image/Document/Video" Label and View File Button
        JLabel inventoryImageLabel = createBlueLabel("Inventory Image/Document/Video:");
        inventoryImageLabel.setBounds(xPadding, currentY, labelWidth, labelHeight);
        mainPanel.add(inventoryImageLabel);

        currentY += labelHeight;
        JButton viewFileButton = new JButton("View File");
        viewFileButton.setBounds(xPadding + labelWidth, currentY, fieldWidth - labelWidth, fieldHeight);
        mainPanel.add(viewFileButton);

        currentY += fieldHeight + verticalGap;

        currentY = addLabelAndField(mainPanel, "Reported Issues:", "Power failure, Screen not working", currentY, xPadding, labelWidth, fieldWidth, labelHeight, fieldHeight, verticalGap);
        currentY = addLabelAndField(mainPanel, "Client Notes:", "Client mentioned it happens frequently.", currentY, xPadding, labelWidth, fieldWidth, labelHeight, fieldHeight, verticalGap);
        currentY = addLabelAndField(mainPanel, "Assigned Technicians:", "James Tech", currentY, xPadding, labelWidth, fieldWidth, labelHeight, fieldHeight, verticalGap);
        currentY = addLabelAndField(mainPanel, "Estimated Amount:", "$200", currentY, xPadding, labelWidth, fieldWidth, labelHeight, fieldHeight, verticalGap);
        currentY = addLabelAndField(mainPanel, "Deadline:", "15-09-2024", currentY, xPadding, labelWidth, fieldWidth, labelHeight, fieldHeight, verticalGap);
        currentY = addLabelAndField(mainPanel, "Status:", "In Progress", currentY, xPadding, labelWidth, fieldWidth, labelHeight, fieldHeight, verticalGap);

        // "Add or Update Note" Label and Field
        JLabel addOrUpdateNoteLabel = createBlueLabel("Add or Update Note:");
        addOrUpdateNoteLabel.setBounds(xPadding, currentY, labelWidth, labelHeight);
        mainPanel.add(addOrUpdateNoteLabel);

        currentY += labelHeight;
        JTextField addOrUpdateNoteField = new JTextField();
        addOrUpdateNoteField.setBounds(xPadding + labelWidth, currentY, fieldWidth - labelWidth, fieldHeight);
        mainPanel.add(addOrUpdateNoteField);

        currentY += fieldHeight + verticalGap;

        // "Save Note" Button
        JButton saveNoteButton = new JButton("Save Note");
        saveNoteButton.setBounds(xPadding, currentY, fieldWidth, fieldHeight);
        saveNoteButton.setBackground(Color.BLUE);
        saveNoteButton.setForeground(Color.WHITE);
        mainPanel.add(saveNoteButton);

        currentY += fieldHeight + verticalGap;

        // "Edit Delete" and "Back" Buttons
        JButton editDeleteButton = new JButton("Edit Delete");
        editDeleteButton.setBounds(xPadding, currentY, 150, fieldHeight);
        editDeleteButton.setForeground(Color.BLUE);
        editDeleteButton.setBackground(Color.WHITE);
        mainPanel.add(editDeleteButton);

        JButton backButton = new JButton("Back");
        backButton.setBounds(fieldWidth - 100, currentY, 80, fieldHeight); // Align to right with some padding
        backButton.setForeground(Color.BLUE);
        backButton.setBackground(Color.WHITE);
        mainPanel.add(backButton);

        // Set the preferred size of the mainPanel based on content
        mainPanel.setPreferredSize(new Dimension(1000, currentY + fieldHeight + verticalGap));

        // Add a JScrollPane to the JFrame
        JScrollPane scrollPane = new JScrollPane(mainPanel);
        scrollPane.setBounds(0, 0, 1000, 800);
        getContentPane().add(scrollPane);

        // Set frame visibility
        setVisible(true);
    }

    // Function to create blue header labels
    private JLabel createBlueLabel(String text) {
        JLabel label = new JLabel(text);
        label.setOpaque(true);
        label.setBackground(Color.BLUE);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Arial", Font.PLAIN, 16));
        return label;
    }

    // Helper method to add labels and fields
    private int addLabelAndField(JPanel panel, String labelText, String fieldText, int currentY, int xPadding, int labelWidth, int fieldWidth, int labelHeight, int fieldHeight, int verticalGap) {
        // Create and add the label
        JLabel label = createBlueLabel(labelText);
        label.setBounds(xPadding, currentY, labelWidth, labelHeight);
        panel.add(label);
        
        // Create and add the text field
        JTextField field = new JTextField(fieldText);
        field.setBounds(xPadding + labelWidth, currentY, fieldWidth - labelWidth, fieldHeight); // Position the field next to the label
        panel.add(field);
        
        // Update currentY for the next component
        return currentY + fieldHeight + verticalGap;
    }

    public static void main(String[] args) {
        new JobSearchess();
    }
}
