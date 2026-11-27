import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> paises = new HashMap<>();
        paises.put("España", "Madrid");
        paises.put("Francia", "Paris");
        paises.put("Alemaña", "Berlin");

        System.out.println("Introduce un país para saber su capital: ");
        String pais = sc.nextLine();
        String capital = paises.get(pais);

        if (capital != null) {
            System.out.println("La capital de " + pais + " es " + capital);
        }else {
            System.out.println("No se ha encontrado el pais");
        }

    }
}
