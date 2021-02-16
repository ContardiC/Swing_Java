import javax.swing.*;
import java.awt.*;

public class Bordi {
    public static void main(String args[]) {
        JFrame frame = new JFrame("Esempio BorderLayout");
        JPanel panel = new JPanel();
        JTextField txtNome = new JTextField(30);
        JTextArea txtCommento = new JTextArea("Scrivi qui il tuo commento...");
        JButton btnInvio = new JButton("Invio");
        panel.setLayout(new BorderLayout());
        frame.add(txtNome,"North");
        frame.add(txtCommento,"Center");
        frame.add(btnInvio,BorderLayout.SOUTH); //seconda possibilita'
        frame.setSize(600,600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
    }
    
}
