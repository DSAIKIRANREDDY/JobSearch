import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

public class Jobsearch extends JFrame implements ActionListener {

    JTextField searchField;
    JButton searchButton;

    Jobsearch() {
        // Frame properties
        setSize(1200, 600);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setTitle("Home");
        setLocation(200, 100);

        // Panel for the Title with blue background
        JPanel titlePanel = new JPanel();
        titlePanel.setBackground(Color.BLUE);
        titlePanel.setBounds(20, 20, 1160, 40); // Adjusted width for a wider frame
        titlePanel.setLayout(new BorderLayout());

        // Title Label
        JLabel titleLabel = new JLabel("HARDIK TRADERS - CLIENT MANAGEMENT DASHBOARD", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Serif", Font.BOLD, 20));
        titleLabel.setForeground(Color.WHITE); // White text color
        titlePanel.add(titleLabel, BorderLayout.CENTER);
        add(titlePanel);

        // Search Bar
        searchField = new JTextField();
        searchField.setBounds(50, 80, 950, 30); // Position and size for search bar
        add(searchField);

        // Search Button
        searchButton = new JButton("SEARCH");
        searchButton.setBackground(Color.BLUE);
        searchButton.setForeground(Color.WHITE);
        searchButton.setBounds(1020, 80, 120, 30); // Position and size for search button
        searchButton.addActionListener(this);
        add(searchButton);

        // Panel for "NEW JOB SHEET" label with blue background
        JPanel newJobPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 0)); // Tight fitting panel
        newJobPanel.setBackground(Color.BLUE);
        newJobPanel.setBounds(500, 130, 200, 40); // Adjusted size to fit label tightly

        // "NEW JOB SHEET" Label
        JLabel newJobSheetLabel = new JLabel("NEW JOB SHEET", SwingConstants.CENTER);
        newJobSheetLabel.setFont(new Font("Serif", Font.BOLD, 16));
        newJobSheetLabel.setForeground(Color.WHITE); // White text color
        newJobPanel.add(newJobSheetLabel); // Add label to panel
        add(newJobPanel);

        // Table Headers and Data
        String[] columnNames = { "#", "Client Id", "Contact Info", "Received Date", "Inventory Received", 
                "Reported Issues", "Client Notes", "Assigned Technician", "Eliminated Amount", "Deadline", "Status", "Action" };

        // Job search details data
        Object[][] data = {
                { "1", "nand9953", "1234567890", "2024-09-05", "mouse", "high", "None", "1", "None", "2024-09-18", "In-progress", "" },
                { "2", "nand1234", "9876543210", "2024-09-01", "keyboard", "medium", "Some issue", "2", "None", "2024-09-15", "Completed", "" }
        };

        // Table Model to prevent editing of fields
        DefaultTableModel model = new DefaultTableModel(data, columnNames) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return column == 11; // Only the "Action" column is editable
            }
        };

        // Creating the table
        JTable table = new JTable(model);

        // Set the row height to accommodate buttons
        table.setRowHeight(60); // Adjusted height for visibility

        // Custom renderer for buttons in the "Action" column
        table.getColumn("Action").setCellRenderer(new ButtonRenderer());
        table.getColumn("Action").setCellEditor(new ButtonEditor(new JCheckBox()));

        // Set column widths
        TableColumnModel columnModel = table.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(40); // "#"
        columnModel.getColumn(1).setPreferredWidth(100); // "Client Id"
        columnModel.getColumn(2).setPreferredWidth(150); // "Contact Info"
        columnModel.getColumn(3).setPreferredWidth(120); // "Received Date"
        columnModel.getColumn(4).setPreferredWidth(150); // "Inventory Received"
        columnModel.getColumn(5).setPreferredWidth(120); // "Reported Issues"
        columnModel.getColumn(6).setPreferredWidth(150); // "Client Notes"
        columnModel.getColumn(7).setPreferredWidth(150); // "Assigned Technician"
        columnModel.getColumn(8).setPreferredWidth(120); // "Eliminated Amount"
        columnModel.getColumn(9).setPreferredWidth(120); // "Deadline"
        columnModel.getColumn(10).setPreferredWidth(100); // "Status"
        columnModel.getColumn(11).setPreferredWidth(200); // "Action"

        // Set custom header renderer to increase header height
        JTableHeader header = table.getTableHeader();
        header.setBackground(Color.BLUE);
        header.setForeground(Color.WHITE);
        header.setFont(new Font("Serif", Font.BOLD, 16));
        header.setPreferredSize(new Dimension(header.getPreferredSize().width, 40)); // Increased header height

        // Scroll Pane for table
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(20, 180, 1160, 300); // Set bounds for the table
        add(scrollPane);

        // Footer Panel with text "@ 2024 Hardik Traders" and blue background
        JPanel footerPanel = new JPanel();
        footerPanel.setBackground(Color.BLUE);
        footerPanel.setBounds(20, 500, 1160, 40); // Position and size for the footer panel

        // Footer Label
        JLabel footerLabel = new JLabel("@ 2024 Hardik Traders", SwingConstants.CENTER);
        footerLabel.setFont(new Font("Serif", Font.BOLD, 16));
        footerLabel.setForeground(Color.WHITE); // White text color
        footerPanel.add(footerLabel); // Add label to footer panel
        add(footerPanel);

        // Make frame visible
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Define actions for the search button click event
        if (e.getSource() == searchButton) {
            String searchText = searchField.getText();
            // Add logic to handle the search functionality
            JOptionPane.showMessageDialog(this, "Search for: " + searchText);
        }
    }

    // Custom Button Renderer
    class ButtonRenderer extends JPanel implements TableCellRenderer {

        public ButtonRenderer() {
            setLayout(new FlowLayout(FlowLayout.CENTER, 5, 0));
        }

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
                                                       boolean hasFocus, int row, int column) {
            removeAll(); // Clear previous components

            // Creating buttons for each row
            JButton viewButton = new JButton("VIEW");
            viewButton.setPreferredSize(new Dimension(80, 30));
            viewButton.setBackground(Color.BLUE);
            viewButton.setForeground(Color.WHITE);

            JButton editButton = new JButton("EDIT");
            editButton.setPreferredSize(new Dimension(80, 30));
            editButton.setBackground(Color.YELLOW);
            editButton.setForeground(Color.BLACK);

            JButton deleteButton = new JButton("DELETE");
            deleteButton.setPreferredSize(new Dimension(80, 30));
            deleteButton.setBackground(Color.RED);
            deleteButton.setForeground(Color.WHITE);

            // Add buttons to panel
            add(viewButton);
            add(editButton);
            add(deleteButton);

            return this;
        }
    }

    // Custom Button Editor to allow action on buttons
    class ButtonEditor extends DefaultCellEditor {
        protected JButton viewButton, editButton, deleteButton;
        private JPanel panel;

        public ButtonEditor(JCheckBox checkBox) {
            super(checkBox);

            panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 5, 0));

            // View Button
            viewButton = new JButton("VIEW");
            viewButton.setPreferredSize(new Dimension(80, 30));
            viewButton.setBackground(Color.BLUE);
            viewButton.setForeground(Color.WHITE);
            viewButton.addActionListener(e -> JOptionPane.showMessageDialog(null, "View button clicked"));

            // Edit Button
            editButton = new JButton("EDIT");
            editButton.setPreferredSize(new Dimension(80, 30));
            editButton.setBackground(Color.YELLOW);
            editButton.setForeground(Color.BLACK);
            editButton.addActionListener(e -> JOptionPane.showMessageDialog(null, "Edit button clicked"));

            // Delete Button
            deleteButton = new JButton("DELETE");
            deleteButton.setPreferredSize(new Dimension(80, 30));
            deleteButton.setBackground(Color.RED);
            deleteButton.setForeground(Color.WHITE);
            deleteButton.addActionListener(e -> JOptionPane.showMessageDialog(null, "Delete button clicked"));

            panel.add(viewButton);
            panel.add(editButton);
            panel.add(deleteButton);
        }

        @Override
        public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected) {
            return panel;
        }

        @Override
        public Object getCellEditorValue() {
            return null;
        }
    }

    public static void main(String[] args) {
        new Jobsearch();
    }
}
