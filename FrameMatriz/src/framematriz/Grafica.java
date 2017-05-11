package framematriz;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Grafica extends JFrame{
    public JTextField unoUno = new JTextField("");
    public JTextField unoDos = new JTextField("");
    public JTextField unoTres = new JTextField("");
    public JTextField dosUno = new JTextField("");
    public JTextField dosDos = new JTextField("");
    public JTextField dosTres = new JTextField("");
    public JTextField tresUno = new JTextField("");
    public JTextField tresDos = new JTextField("");
    public JTextField tresTres = new JTextField("");
    public JLabel resultado = new JLabel("Determinantes");
    public JButton ok = new JButton("OK");
    public String valores [] = new String [9];
    public double numCadena [] =  new double [9];
    
    public Grafica(){
        init();
    }
    
    private void init(){
     setLayout(new GridLayout(4,3));
        setTitle("Determinantes");
        setSize(600, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        add(unoUno);
        add(unoDos);
        add(unoTres);
        add(dosUno);
        add(dosDos);
        add(dosTres);
        add(tresUno);
        add(tresDos);
        add(tresTres);
        add(ok);
        
        ok.addActionListener(new Boton());
    }
    
     private class Boton implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Determinante res = new Determinante();
            
            valores [0] = unoUno.getText();
            valores [1] = unoDos.getText();
            valores [2] = unoTres.getText();
            valores [3] = dosUno.getText();
            valores [4] = dosDos.getText();
            valores [5] = dosTres.getText();
            valores [6] = tresUno.getText();
            valores [7] = tresDos.getText();
            valores [8] = tresTres.getText();
            
            try{
                for (int i = 0 ; i < numCadena.length ; i++){
                numCadena[i] = Double.parseDouble(valores[i]);
                }
                res.Resultado(numCadena);
                JOptionPane.showMessageDialog(null, "El resultado es: " + res);
            }catch (NumberFormatException nfe){
                JOptionPane.showMessageDialog(null, "Alguno de los valores no es un número, dejate de jaladas y hazlo bien");
            }
        }
    }
}
