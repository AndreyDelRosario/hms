import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Dashboard extends JFrame {
    private JButton btnHome, btnSettings, btnLogout;
    private JLabel lblStatus;
    private JComboBox<String> viewOptions;
    private String[] views = {"Overview", "Detailed Report", "Analytics"};
    public Dashboard(String title) {
        super(title);
        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        btnHome = new JButton("Home");
        btnSettings = new JButton("Settings");
        btnLogout = new JButton("Logout");
        viewOptions = new JComboBox<>(views);
        lblStatus = new JLabel("Welcome to the Dashboard");
        container.add(lblStatus);
        container.add(new JLabel("Select View:"));
        container.add(viewOptions);
        container.add(btnHome);
        container.add(btnSettings);
        container.add(btnLogout);
        DashboardHandler handler = new DashboardHandler();
        btnHome.addActionListener(handler);
        btnSettings.addActionListener(handler);
        btnLogout.addActionListener(handler);
        viewOptions.addItemListener(handler);
        setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    private class DashboardHandler implements ActionListener, ItemListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == btnLogout) {
                JOptionPane.showMessageDialog(null, "Logging out...");
                System.exit(0);
            } else {
                lblStatus.setText("Navigated to: " + e.getActionCommand());
            }
        }
        public void itemStateChanged(ItemEvent e) {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                lblStatus.setText("Viewing: " + viewOptions.getSelectedItem());
            }
        }
    }
    public static void main(String[] args) {
        new Dashboard("System Dashboard");
    }
}
