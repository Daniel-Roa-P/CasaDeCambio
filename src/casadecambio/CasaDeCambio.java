
package casadecambio;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CasaDeCambio extends JFrame implements ActionListener{

    JTextField cuadro1 = new JTextField();
    JTextField cuadro2 = new JTextField();
    JLabel texto = new JLabel("Ingrese la cantidad de pesos colombianos:");
    JLabel texto2 = new JLabel("Converir peso a:");
    JLabel texto3 = new JLabel("$");
    JButton boton = new JButton("Realizar conversion");
    JComboBox lista = new JComboBox();
    
    public static void main(String[] args) {
        
        CasaDeCambio casa = new CasaDeCambio();
        casa.setSize(500, 200);
        casa.setVisible(true);
        
    }
    
    public CasaDeCambio(){
    
        Container c = getContentPane();
        c.setLayout(null);
        
        c.add(cuadro1);
        c.add(cuadro2);
        c.add(texto);
        c.add(texto2);
        c.add(texto3);
        c.add(boton);
        c.add(lista);
        
        texto.setVisible(true);
        texto.setBounds(50, 50, 250, 20);
        
        texto2.setVisible(true);
        texto2.setBounds(50, 100, 250, 20);
        
        texto3.setVisible(true);
        texto3.setBounds(405, 50, 250, 20);
        
        cuadro1.setVisible(true);
        cuadro1.setBounds(300,50,100,20);
        
        lista.addItem("Dolares");
        lista.addItem("Yenes");
        lista.addItem("Euros");
        lista.addItem("Libras");
        lista.addItem("Bolivares");
        lista.addItem("Rupias");
        lista.addItem("Soles");
        lista.setVisible(true);
        lista.setBounds(150,100,100,20);
        
        boton.setVisible(true);
        boton.setBackground(Color.YELLOW);
        boton.setBounds(260, 100, 150, 20);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
