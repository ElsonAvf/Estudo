import java.io.IOException;
 import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class SomaDeImparesConsecutivosII {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
 Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine());
        int[] arrayOfSum = new int[n];
        for (int i = 0; i < n; i++) {
            String[] array = sc.nextLine().split("\\s");
            int x = Integer.valueOf(array[0]);
            int y = Integer.valueOf(array[1]);
            if (x > y) {
                int temp = x;
                x = y;
                y = temp;
            }
            int sum = 0;
            for (int j = x + 1; j < y; j++) {
                if (j % 2 != 0) {
                    sum += j;
                }
            }
            arrayOfSum[i] = sum;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arrayOfSum[i]);
        }
    }
 
}