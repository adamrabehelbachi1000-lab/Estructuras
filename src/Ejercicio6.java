import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, ArrayList<String>> telefonos = new HashMap<>();

        ArrayList<String> lucas = new ArrayList<>();
        lucas.add("666327562");
        lucas.add("611222333");

        ArrayList<String> mario = new ArrayList<>();
        mario.add("626920531");
        mario.add("622333444");
        ArrayList<String> ben = new ArrayList<>();
        ben.add("743501920");

        telefonos.put("Lucas", lucas);
        telefonos.put("Mario", mario);
        telefonos.put("Ben", ben);

        System.out.print("Introduce el nombre del contacto: ");
        String contacto = sc.nextLine();

        ArrayList<String> listaTelefonos = telefonos.get(contacto);
        if (listaTelefonos != null) {
            System.out.println("Teléfonos de " + contacto + ":");
            for (String numero : listaTelefonos) {
                System.out.println(numero);
            }
        } else {
            System.out.println("No se ha encontrado el contacto");
        }
    }
}

