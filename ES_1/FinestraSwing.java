import javax.swing.*;
import java.awt.*;
class FinestraSwing{
    public static void main(String args[]) {
        JFrame frame=new JFrame();                          //contenitore principale
        JPanel panel=new JPanel();                          //contenitore intermedio
        JLabel lbl=new JLabel("Etichetta");                 //contenitore atomico
        JButton btn=new JButton("Bottone");
        panel.add(lbl);
        panel.add(btn);
        Container container=frame.getContentPane();         //contenitore intermedio
        container.add(panel);
        
        frame.setSize(300,200);
        /*
            CENTRARE la finestra 
        */
        frame.setLocationRelativeTo(null);
        
        frame.setVisible(true);
    }
}