package calculadora;

public class Por {

    public Por(){}
    
    public double resultado;

    @Override
    public String toString() {

        return "" + this.resultado;
    }

    public double Resta(double num1, double num2) {
        this.resultado = num1 * num2;

        return resultado;
    }
}