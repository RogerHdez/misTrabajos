package piladinamica;

/**
 *
 * @author roger
 */
public class PilaDinamica {

    private int tope = -1;
    private int max = 10;
    private Object pila[];
    private Object nuevaPila[];
    public Object datoPila;

    public PilaDinamica() {
        pila = new Object[max];
    }

    private boolean isEmpty() {
        boolean resp = false;
        if (tope == -1) {
            resp = true;
        }
        return resp;
    }

    private boolean isFull() {
        boolean resp = false;
        if (tope == pila.length-1) {
            resp = true;
        }
        return resp;
    }

    /**
     * Agregar un dato
     */
    void push(Object Dato) {

        if (!isFull()) {
            tope++;
            pila[tope] = Dato;
            System.out.println("Valor agregado correctamente");
        } else {
            max = max + 10;
            nuevaPila = new Object[max];
            for (int i = 0; i <= pila.length - 1; i++) {
                nuevaPila[i] = pila[i];
            }

            pila = new Object[max];
            for (int i = 0; i <= nuevaPila.length - 1; i++) {
                pila[i] = nuevaPila[i];

            }

            tope++;
            pila[tope] = Dato;
        }
    }

    /**
     * Quitar un dato
     */
    void pop() {

        if (!isEmpty()) {
            datoPila = pila[tope];
            tope--;
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

            System.out.println(pila[tope]);
        } else {
            System.out.println("Está vacia");
        }

    }

}
