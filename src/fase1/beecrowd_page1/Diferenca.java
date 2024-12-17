import java.io.IOException;
import java.util.Scanner;
public class Diferenca {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
                 Scanner sc = new Scanner(System.in);
        int a = Integer.valueOf(sc.nextLine());
        int b = Integer.valueOf(sc.nextLine());
        int c = Integer.valueOf(sc.nextLine());
        int d = Integer.valueOf(sc.nextLine());
        int dif = a * b - c * d;
        System.out.println("DIFERENCA = " + dif);
 
    }
 
}