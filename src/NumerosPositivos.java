import java.io.IOException;
import java.util.Scanner;

public class NumerosPositivos {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
 Scanner sc = new Scanner(System.in);
        double[] array = new double[6];
        for (int i = 0; i < 6; i++) {
            array[i] = Double.valueOf(sc.nextLine());
        }
        int qnt = 0;
        for (int i = 0; i < 6; i++) {
            if (array[i] > 0) { qnt++; }
        }
        System.out.println(qnt + " valores positivos");
    }
 
}