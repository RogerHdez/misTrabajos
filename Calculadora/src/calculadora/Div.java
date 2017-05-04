package calculadora;

public class Div {

    public Div(){}
    
    public double resultado;

    @Override
    public String toString() {

        return "" + this.resultado;
    }

    public double Div(double num1, double num2) {
        this.resultado = num1 / num2;

        return resultado;
    }
}