package pilas;

/**
 *
 * @author roger
 */
public class Pilas {

    private int Tope = -1;
    private int Max;
    private int Pila[];
    public int DatoPila;

    public Pilas(int CantMax) {
        Pila = new int[CantMax];
        Max = CantMax;
    }

    private boolean isEmpty() {
        boolean resp = false;
        if (Tope == -1) {
            resp = true;
        }
        return resp;
    }

    private boolean isFull() {
        boolean resp = false;
        if ((Tope - 1) == Max) {
            resp = true;
        }
        return resp;
    }

    /**
     * Agregar un dato
     */
    void push(int Dato) {

        if (!isFull()) {
            Tope++;
            Pila[Tope] = Dato;
            System.out.println("Valor agregado correctamente");
        } else {
            System.out.println("Error...Pila llena");
        }
    }

    /**
     * Quitar un dato
     */
    void pop() {

        if (!isEmpty()) {
            DatoPila = Pila[Tope];
            Tope--;
            System.out.println("Valor eliminado correctamente");
        } else {
            System.out.println("Error... Pila vacia");
        }

    }

    /**
     * Ver ultimo dato agregado
     */
    void peek() {
        if (!isEmpty()) {

            System.out.println(Pila[Tope]);
        } else {
            System.out.println("Está vacia");
        }

    }

}
