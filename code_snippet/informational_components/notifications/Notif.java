import javax.swing.*;
public class Notif {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Operation Successful!", "Info", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Warning: Low Disk Space", "Warning", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, "Error: Connection Failed", "Error", JOptionPane.ERROR_MESSAGE);
        String name = JOptionPane.showInputDialog(null, "Enter your name:");
        int choice = JOptionPane.showConfirmDialog(null, "Do you want to proceed?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.YES_OPTION) {
            System.out.println("Proceeding...");
        } else {
            System.out.println("Cancelled.");
        }
    }
}
