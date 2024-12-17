import java.io.IOException;
 import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class MediaPonderada {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
 Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine());
        double[] medias = new double[n];
        for (int i = 0; i < n; i++) {
            String[] values = sc.nextLine().split("\\s");
            double a = Double.valueOf(values[0]);
            double b = Double.valueOf(values[1]);
            double c = Double.valueOf(values[2]);
            medias[i] = (a * 2 + b * 3 + c * 5) / 10;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(String.format("%.1f", medias[i]));   
        }
    }
 
}