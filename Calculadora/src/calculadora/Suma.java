package calculadora;

public class Suma {

    public Suma() {
    }

    public double resultado;

    @Override
    public String toString() {

        return "" + this.resultado;
    }

    public double Suma(double num1, double num2) {
        this.resultado = num1 + num2;

        return resultado;
    }
}

