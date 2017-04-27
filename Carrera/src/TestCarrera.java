
import java.util.Random;

public class TestCarrera {

    public static void main(String[] pony) {
        Random rd = new Random();
        Animales animal = new Galgo("Chibrerto", 3);
        Animales animal2 = new Oruga("Magdalena", 3);
        System.out.println(animal);
        System.out.println(animal2);

        int avance = 0;
        int meta = 10;
        int parti1 = 0;
        int part2 = 0;

        while (parti1 < 10 || part2 < 10) {

            avance = rd.nextInt(9) + 1;

            if (avance < 6) {

                parti1 += animal.getVelocidad();
            } else {

                part2 += animal2.getVelocidad();
            }

        }

        if (parti1 > part2) {
            System.out.println("El ganador es: " + animal.getNombre());
        } else {
            System.out.println("El ganador es: " + animal2.getNombre());
        }
    }

}
