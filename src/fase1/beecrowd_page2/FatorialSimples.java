package fase1.beecrowd_page2;
import java.util.Scanner;

public class FatorialSimples {
    public static void main(String[] args) {
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
 Scanner sc = new Scanner(System.in);
        int x = Integer.valueOf(sc.nextLine());
        int z;
        while (true) {
            z = Integer.valueOf(sc.nextLine());
            if (z > x) {
                break;
            }
        }
        int contador = 0;
        int sum = 0;
        while (sum <= z) {
            sum += x;
            x++;
            contador++;
        }
        System.out.println(contador);
    }
}