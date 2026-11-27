import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Ejercicio8 {
    public static void main(String[] args) {
        int participantes = 2;
        int[] billetes = {10, 20, 50, 200, 500};
        Map<Integer, ArrayList<Integer>> reparto = repartirBotin(participantes, billetes);
        System.out.println(reparto);
    }
    public static Map<Integer, ArrayList<Integer>> repartirBotin(
            int participantes, int[] billetes) {
        Map<Integer, ArrayList<Integer>> reparto = new HashMap<>();
        for (int i = 0; i < participantes; i++) {
            reparto.put(i, new ArrayList<>());
        }
        for (int i = 0; i < billetes.length; i++) {
            int participante = i % participantes;
            reparto.get(participante).add(billetes[i]);
        }
        return reparto;
    }
}
