package framematriz;

public class Determinante {
    private double respuesta;
    public Determinante() {
    }

    @Override
    public String toString() {
        return ""+respuesta;
    }

    public double Resultado(double matriz[]) {
        this.respuesta = ((matriz[0]*matriz[4]*matriz[8])+(matriz[1]*matriz[5]*
                matriz[6])+(matriz[2]*matriz[3]*matriz[7]) - (matriz[1]*matriz[3]*matriz[7])-
                (matriz[0]*matriz[5]*matriz[7])-(matriz[2]*matriz[4]*matriz[6]));
        return respuesta;
    }
}
