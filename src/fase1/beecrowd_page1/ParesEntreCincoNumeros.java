import java.io.IOException;
import java.util.Scanner;

public class ParesEntreCincoNumeros {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
 Scanner sc = new Scanner(System.in);
        double[] array = new double[5];
        for (int i = 0; i < 5; i++) {
            array[i] = Double.valueOf(sc.nextLine());
        }
        int qnt = 0;
        for (int i = 0; i < 5; i++) {
            if (array[i] % 2 == 0) { qnt++; }
        }
        System.out.println(qnt + " valores pares");
    }
 
}