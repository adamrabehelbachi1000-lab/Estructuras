import java.util.HashMap;
import java.util.Map;

public class Ejercicio7 {
    public static void main(String[] args) {
        String[] boletos = {"58975","25894","52985", "98598"};
        Map<Character, Integer> digitos_finales = new HashMap<>();
        for (String boleto : boletos) {
            char ultimo_digito = boleto.charAt(boleto.length() - 1);
            digitos_finales.put(ultimo_digito, digitos_finales.getOrDefault(ultimo_digito, 0) + 1);
        }
        System.out.print(digitos_finales);
    }
}
