import java.awt.*;
import javax.swing.*;

public class Jobsearches extends JFrame {

    public Jobsearches() {
        // Frame properties
        setSize(1000, 600);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setTitle("Create New Job Sheet");
        setLocation(200, 100);

        // Panel for heading with blue background
        JPanel headerPanel = new JPanel();
        headerPanel.setBackground(Color.BLUE);
        headerPanel.setBounds(20, 20, 960, 50); // Full width with 20 px padding on sides
        headerPanel.setLayout(new FlowLayout(FlowLayout.CENTER));

        JLabel headerLabel = new JLabel("CREATE NEW JOB SHEET");
        headerLabel.setForeground(Color.WHITE);
        headerLabel.setFont(new Font("Arial", Font.BOLD, 24));
        headerPanel.add(headerLabel);
        add(headerPanel);

        // Scrollable panel for form
        JPanel formPanel = new JPanel();
        formPanel.setLayout(null);
        formPanel.setPreferredSize(new Dimension(960, 900)); // Adjust height to accommodate all fields

        JScrollPane scrollPane = new JScrollPane(formPanel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setBounds(20, 80, 960, 470);
        add(scrollPane);

        // Labels and Text Fields aligned vertically
        int labelWidth = 200;
        int fieldWidth = 920; // Full width - 40 px for padding (20 each side)
        int xPadding = 20;
        int yPadding = 20;
        int fieldHeight = 30;
        int labelHeight = 20;
        int verticalGap = 50; // Space between components

        // Add labels and text fields in vertical order, aligned to the left
        int currentY = yPadding;

        // Client Name Label and Field
        JLabel clientNameLabel = new JLabel("Client Name:");
        clientNameLabel.setBounds(xPadding, currentY, fieldWidth, labelHeight);
        clientNameLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        formPanel.add(clientNameLabel);

        currentY += labelHeight;
        JTextField clientNameField = new JTextField();
        clientNameField.setBounds(xPadding, currentY, fieldWidth, fieldHeight);
        formPanel.add(clientNameField);

        currentY += verticalGap;

        // Contact Info Label and Field
        JLabel contactInfoLabel = new JLabel("Contact Info (Phone 10nos):");
        contactInfoLabel.setBounds(xPadding, currentY, fieldWidth, labelHeight);
        contactInfoLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        formPanel.add(contactInfoLabel);

        currentY += labelHeight;
        JTextField contactInfoField = new JTextField();
        contactInfoField.setBounds(xPadding, currentY, fieldWidth, fieldHeight);
        formPanel.add(contactInfoField);

        currentY += verticalGap;

        // Received Date Label and Field
        JLabel receivedDateLabel = new JLabel("Received Date:");
        receivedDateLabel.setBounds(xPadding, currentY, fieldWidth, labelHeight);
        receivedDateLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        formPanel.add(receivedDateLabel);

        currentY += labelHeight;
        JTextField receivedDateField = new JTextField("dd-mm-yyyy");
        receivedDateField.setBounds(xPadding, currentY, fieldWidth, fieldHeight);
        formPanel.add(receivedDateField);

        currentY += verticalGap;

        // Inventory Received Label and Field
        JLabel inventoryReceivedLabel = new JLabel("Inventory Received:");
        inventoryReceivedLabel.setBounds(xPadding, currentY, fieldWidth, labelHeight);
        inventoryReceivedLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        formPanel.add(inventoryReceivedLabel);

        currentY += labelHeight;
        JTextField inventoryReceivedField = new JTextField();
        inventoryReceivedField.setBounds(xPadding, currentY, fieldWidth, fieldHeight);
        formPanel.add(inventoryReceivedField);

        currentY += verticalGap;

        // Upload Inventory Image/Document/Video Label and File Chooser
        JLabel uploadLabel = new JLabel("Upload Inventory Image/Document/Video:");
        uploadLabel.setBounds(xPadding, currentY, fieldWidth, labelHeight);
        uploadLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        formPanel.add(uploadLabel);

        currentY += labelHeight;
        JButton uploadButton = new JButton("Choose File");
        uploadButton.setBounds(xPadding, currentY, fieldWidth, fieldHeight);
        formPanel.add(uploadButton);

        currentY += verticalGap;

        // Reported Issues Label and TextArea
        JLabel reportedIssuesLabel = new JLabel("Reported Issues:");
        reportedIssuesLabel.setBounds(xPadding, currentY, fieldWidth, labelHeight);
        reportedIssuesLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        formPanel.add(reportedIssuesLabel);

        currentY += labelHeight;
        JTextArea reportedIssuesArea = new JTextArea();
        reportedIssuesArea.setBounds(xPadding, currentY, fieldWidth, 70);
        reportedIssuesArea.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        formPanel.add(reportedIssuesArea);

        currentY += 80; // Increase gap for larger text area

        // Client Notes Label and TextArea
        JLabel clientNotesLabel = new JLabel("Client Notes:");
        clientNotesLabel.setBounds(xPadding, currentY, fieldWidth, labelHeight);
        clientNotesLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        formPanel.add(clientNotesLabel);

        currentY += labelHeight;
        JTextArea clientNotesArea = new JTextArea();
        clientNotesArea.setBounds(xPadding, currentY, fieldWidth, 70);
        clientNotesArea.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        formPanel.add(clientNotesArea);

        currentY += 80;

        // Assigned Technicians Label and Field
        JLabel assignedTechniciansLabel = new JLabel("Assigned Technicians:");
        assignedTechniciansLabel.setBounds(xPadding, currentY, fieldWidth, labelHeight);
        assignedTechniciansLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        formPanel.add(assignedTechniciansLabel);

        currentY += labelHeight;
        JTextField assignedTechniciansField = new JTextField();
        assignedTechniciansField.setBounds(xPadding, currentY, fieldWidth, fieldHeight);
        formPanel.add(assignedTechniciansField);

        currentY += verticalGap;

        // Deadline Label and Field
        JLabel deadlineLabel = new JLabel("Deadline:");
        deadlineLabel.setBounds(xPadding, currentY, fieldWidth, labelHeight);
        deadlineLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        formPanel.add(deadlineLabel);

        currentY += labelHeight;
        JTextField deadlineField = new JTextField("dd-mm-yyyy");
        deadlineField.setBounds(xPadding, currentY, fieldWidth, fieldHeight);
        formPanel.add(deadlineField);

        currentY += verticalGap;

        // Estimated Amount Label and Field
        JLabel estimatedAmountLabel = new JLabel("Estimated Amount:");
        estimatedAmountLabel.setBounds(xPadding, currentY, fieldWidth, labelHeight);
        estimatedAmountLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        formPanel.add(estimatedAmountLabel);

        currentY += labelHeight;
        JTextField estimatedAmountField = new JTextField();
        estimatedAmountField.setBounds(xPadding, currentY, fieldWidth, fieldHeight);
        formPanel.add(estimatedAmountField);

        currentY += verticalGap;

        // Status Label and Field
        JLabel statusLabel = new JLabel("Status:");
        statusLabel.setBounds(xPadding, currentY, fieldWidth, labelHeight);
        statusLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        formPanel.add(statusLabel);

        currentY += labelHeight;
        JTextField statusField = new JTextField();
        statusField.setBounds(xPadding, currentY, fieldWidth, fieldHeight);
        formPanel.add(statusField);

        currentY += verticalGap;

        // Save Job Sheet Button
        JButton saveButton = new JButton("Save Job Sheet");
        saveButton.setBounds(xPadding, currentY, fieldWidth, fieldHeight);
        saveButton.setBackground(Color.BLUE);
        saveButton.setForeground(Color.WHITE);
        saveButton.setFont(new Font("Arial", Font.BOLD, 16));
        formPanel.add(saveButton);

        // Set frame visibility
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Jobsearches();
    }
}
