import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> numeros = new HashMap<>();
        numeros.put("666327562", "Lucas");
        numeros.put("626920531", "Mario");
        numeros.put("743501920", "Ben");

        System.out.print("Introduce un numero de telefono para saber el contacto: ");
        String numero = sc.nextLine();
        String contacto = numeros.get(numero);

        if (contacto != null) {
            System.out.println("El contacto de " + numero + " es " + contacto);
        }else {
            System.out.println("No se ha encontrado el contacto");
        }

    }
}
