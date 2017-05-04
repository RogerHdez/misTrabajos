package calculadora;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Interfaz extends JFrame {

    public JButton mas = new JButton("+");
    public JButton menos = new JButton("-");
    public JButton por = new JButton("x");
    public JButton entre = new JButton("/");
    public JButton pasar = new JButton("Pasar sin operacion");
    public JButton borrar = new JButton("Acumulador = 0");
    public JButton raiz = new JButton("Raiz Cuadrada");
    public JTextField texto = new JTextField("", 20);
    public JLabel resultados = new JLabel();
    public double acu = 0;

    public Interfaz() {
        init();
    }

    private void init() {

        setLayout(new GridLayout(3,1));
        setTitle("Mi ventana");
        setSize(400, 600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mas.addActionListener(new BotonMas());
        menos.addActionListener(new BotonMenos());
        por.addActionListener(new BotonPor());
        entre.addActionListener(new BotonDiv());
        pasar.addActionListener(new BotonPasar());
        borrar.addActionListener(new BotonC());
        raiz.addActionListener(new BotonRaiz());

        add(resultados);
        add(texto);
        add(mas);
        add(menos);
        add(por);
        add(entre);
        add(raiz);
        add(pasar);
        add(borrar);

    }

    private class BotonMas implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Suma suma = new Suma();

            double valor;
            String res;
            String cad = texto.getText();

            valor = Double.parseDouble(cad);
            suma.Suma(acu, valor);
            texto.setText("");

            res = String.valueOf(suma);

            resultados.setText(res);

            acu = suma.resultado;

        }
    }

    private class BotonMenos implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            Resta resta = new Resta();

            double valor;
            String res;
            String cad = texto.getText();

            valor = Double.parseDouble(cad);
            resta.Resta(acu, valor);
            texto.setText("");

            res = String.valueOf(resta);

            resultados.setText(res);

            acu = resta.resultado;

        }

    }

    private class BotonPor implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            Por por = new Por();

            double valor;
            String res;
            String cad = texto.getText();

            valor = Double.parseDouble(cad);
            por.Resta(acu, valor);
            texto.setText("");

            res = String.valueOf(por);

            resultados.setText(res);

            acu = por.resultado;

        }

    }

    private class BotonDiv implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            Div div = new Div();

            double valor;
            String res;
            String cad = texto.getText();

            valor = Double.parseDouble(cad);
            div.Div(acu, valor);
            texto.setText("");

            res = String.valueOf(div);

            resultados.setText(res);

            acu = div.resultado;

        }

    }

    private class BotonPasar implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            String pasar = texto.getText();
            double num;
            
            num = Integer.parseInt(pasar);
            
            acu = num;
            
            resultados.setText(pasar);
            
            texto.setText("");

        }

    }
    
    private class BotonC implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            acu = 0;
            resultados.setText("0");
            
            texto.setText("");

        }

    }
    
      private class BotonRaiz implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            double raiz;
            String res;
            
            
            raiz = Math.sqrt(acu);
            res = String.valueOf(raiz);
            
            resultados.setText(res);
            
            texto.setText("");
            
            acu = raiz;

        }

    }

}
