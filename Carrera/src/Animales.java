
public abstract class Animales {

    private final String nombre;

    public Animales(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public abstract void velocidad(int velocidad);

    public abstract int getVelocidad();
}
