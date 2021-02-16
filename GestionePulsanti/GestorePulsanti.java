import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class GestorePulsanti implements ActionListener{
    private JTextArea area;
    public GestorePulsanti(JTextArea area){
        this.area=area;
    }
    public void actionPerformed(ActionEvent e){
        String pulsante= e.getActionCommand();
        if(pulsante.equals("Superiore")){
            area.append("Premuto pulsante superiore");
        }
        if(pulsante.equals("Inferiore")){
            area.append("Premuto pulsante inferiore");
        }
    }
    
}
