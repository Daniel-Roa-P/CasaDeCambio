
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
        casa.setSize(500, 230);
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
        
        cuadro2.setVisible(true);
        cuadro2.setBounds(50, 150, 400, 20);
        
        lista.addItem("Dolar");
        lista.addItem("Yen");
        lista.addItem("Euro");
        lista.addItem("Libra");
        lista.addItem("Bolivar");
        lista.addItem("Rupia");
        lista.addItem("Sol");
        lista.setVisible(true);
        lista.setBounds(150,100,100,20);
        
        boton.setVisible(true);
        boton.setBackground(Color.YELLOW);
        boton.setBounds(260, 100, 150, 20);
        boton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==boton){
        
           CadenaDeResponsabilidad c = new CadenaDeResponsabilidad();
           c.setMoneda(lista.getSelectedItem().toString());
           c.setValor(Double.parseDouble(cuadro1.getText()));
            
           cuadro2.setText(c.pasoDeResponsabilidades());
           
        }
        
    }
    
}
