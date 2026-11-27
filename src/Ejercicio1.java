import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> coches = new ArrayList<>();
        String marca;
        System.out.println("Introduce marcas de coches:");
        do {
            marca = sc.nextLine();
                coches.add(marca);
        } while (!marca.isEmpty());

        Collections.sort(coches);

        System.out.println("Marcas ordenadas:");

        for (String coche : coches) {
            System.out.print(coche);
        }
    }
}
