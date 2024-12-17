import java.io.IOException;
 import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Intervalo2 {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
 Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine());
        int countIn = 0;
        int countOut = 0;
        if (n < 10000) {
        for (int i = 0; i < n; i++) {
            int x = Integer.valueOf(sc.nextLine());
            if (x < Math.pow(10, 7) && x > Math.pow(-10, 7)) {
                if (x >= 10 && x <= 20) {
                    countIn++;
                } else {
                    countOut++;
                }
            }
        }
        }
        System.out.println(countIn +" in");
        System.out.println(countOut +" out");
    }
 
}