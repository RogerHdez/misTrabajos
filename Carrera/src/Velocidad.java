
public class Velocidad extends Animales {

    private int velocidad;

    public Velocidad(String nombre , int velocidad) {
        super(nombre);
        this.velocidad = velocidad;
    }
    
    public String toString(){
    return super.toString() + " con velocidad de " + velocidad;
    }

    @Override
    public void velocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public int getVelocidad() {
        return this.velocidad;
    }

}
