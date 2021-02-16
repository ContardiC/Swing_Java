import javax.swing.*;
import java.awt.*;
public class Pulsanti {
    public static void main(String args[]) {
        JFrame frame= new JFrame("Gestione pulsanti");
        JPanel panel=new JPanel();
        JButton btnSup = new JButton("Superiore");
        JButton btnInf = new JButton("Inferiore");
        JTextArea area=new JTextArea(50,100);
        panel.setLayout(new BorderLayout());
        panel.add(btnSup,BorderLayout.NORTH);
        panel.add(area,BorderLayout.CENTER);
        panel.add(btnInf,BorderLayout.SOUTH);
        btnSup.addActionListener(new GestorePulsanti(area));
        btnInf.addActionListener(new GestorePulsanti(area));
        area.setEditable(false);
        frame.getContentPane().add(panel);
        frame.setSize(500,500);
        frame.setVisible(true);
    }
}
