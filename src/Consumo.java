import java.io.IOException;
 import java.util.Scanner;

public class Consumo {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
 Scanner sc = new Scanner(System.in);
        int km = Integer.valueOf(sc.nextLine());
        double l = Double.valueOf(sc.nextLine());
        double kml = km / l;
        System.out.println(String.format("%.3f", kml) + " km/l");
    
    }
 
}