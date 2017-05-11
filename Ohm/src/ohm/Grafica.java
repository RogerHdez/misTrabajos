/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohm;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author roger
 */
public class Grafica extends JFrame {

    public JTextField num1 = new JTextField("");
    public JTextField num2 = new JTextField("");
    public JTextField num3 = new JTextField("");
    public JButton voltaje = new JButton("Voltaje");
    public JButton resistencia = new JButton("Resistencia");
    public JButton amper = new JButton("Amperaje");
    public double valor1;
    public double valor2;
    public double valor3;

    public Grafica() {
        init();
    }

    public void init() {
        setLayout(new GridLayout(3, 3));
        setTitle("Ley de OHMS");
        setSize(600, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(num1);
        add(voltaje);
        add(num2);
        add(resistencia);
        add(num3);
        add(amper);
        
        voltaje.addActionListener(new Voltaje());
        resistencia.addActionListener(new Resis());
        amper.addActionListener(new Amper());
        

    }

    private class Voltaje implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            Volts volt = new Volts();
            try {
                valor1 = Double.parseDouble(num2.getText());
                valor2 = Double.parseDouble(num3.getText());
               

                volt.Operacion(valor1, valor2);

                JOptionPane.showMessageDialog(null,"El valor del voltaje es: "+ volt);
                
                String a = String.valueOf(volt);
                
                num1.setText(a);
                
                 valor3 = Double.parseDouble(num1.getText());

            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Pusiste algo que no es vato :v");
            }
        }

    }
    
    private class Resis implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            Resistencia resistencia = new Resistencia();
            try {
                valor1 = Double.parseDouble(num1.getText());
                valor2 = Double.parseDouble(num3.getText());
                
                 
                resistencia.Operacion(valor1, valor2);

                JOptionPane.showMessageDialog(null, "Resultado de la resistencia: "+resistencia);
                
                String a = String.valueOf(resistencia);
                
                num2.setText(a);
                
                valor3 = Double.parseDouble(num2.getText());


            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Pusiste algo que no es vato :v");
            }
        }

    }
    
      private class Amper implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            Resistencia resistencia = new Resistencia();
            try {
                valor1 = Double.parseDouble(num1.getText());
                valor2 = Double.parseDouble(num2.getText());
                

                resistencia.Operacion(valor1, valor2);

                JOptionPane.showMessageDialog(null, "El resultado del amperaje es: "+resistencia);
                
                String a = String.valueOf(resistencia);
                
                num3.setText(a);
                
                valor3 = Double.parseDouble(num3.getText());


            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Pusiste algo que no es vato :v");
            }
        }

    }
    
}
