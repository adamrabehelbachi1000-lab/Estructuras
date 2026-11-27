import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> alturas = new ArrayList<>();
        int alumnos = numeroAlumnos();
        leerAlturas(alturas, alumnos);
        double media = calcularMedia(alturas, alumnos);
        mostrarResultados(alturas, media);

    }
    public static int numeroAlumnos (){
        Scanner sc = new Scanner(System.in);
        int Nalumnos;
        System.out.println("Introduce el numero de alumnos: ");
        Nalumnos = sc.nextInt();
        return Nalumnos;
    }
    public static void leerAlturas(List<Double> alturas, int Nalumnos) {
        double altura;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < Nalumnos; i++) {
            System.out.println("Introduce la altura del alumno " + (i + 1) + ": ");
            altura = sc.nextDouble();
            alturas.add(altura);
        }
    }
    public static double calcularMedia(List<Double> alturas, int Nalumnos){
        double media = 0;
        double suma = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < Nalumnos; i++) {
            suma = suma +  alturas.get(i);
        }
        media = suma/Nalumnos;
        return media;
    }
    public static double calcularAlumnosAlturaSuperior(List<Double> alturas, int Nalumnos){
        double max_altura = alturas.get(0);
        for (int i = 0; i < Nalumnos; i++) {
            if (alturas.get(i) > max_altura) {
                max_altura = alturas.get(i);
            }
        }
        return max_altura;
    }
    public static double calcularAlumnosAlturaInferior(List<Double> alturas, int Nalumnos){
        double min_altura = alturas.get(0);
        for (int i = 0; i < Nalumnos; i++) {
            if (alturas.get(i) < min_altura) {
                min_altura = alturas.get(i);
            }
        }
        return min_altura;
    }
    public static void mostrarResultados(List<Double> alturas, double media){
        System.out.println("Las alturas de los alumnos de la clase son los siguientes: ");
        for (Double altura : alturas) {
            System.out.println(altura);
        }
        System.out.println("Superior a la media: ");
        for (Double altura : alturas) {
            if (altura > media) {
                System.out.println(altura);
            }
        }
        System.out.println("Inferior a la media: ");
        for (Double altura : alturas) {
            if (altura < media) {
                System.out.println(altura);
            }
        }
    }
}
