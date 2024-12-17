import java.io.IOException;
 import java.util.Scanner;

public class SeisNumerosImpares {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
 Scanner sc = new Scanner(System.in);
        int num = Integer.valueOf(sc.nextLine());
        int count = 0;
        while (count < 6) {
            if (num % 2 != 0) {
                System.out.println(num);
                count++;
            }
            num++;
        }
    }
 
}