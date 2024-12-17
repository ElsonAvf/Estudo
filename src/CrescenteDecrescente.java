import java.io.IOException;
 import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class CrescenteDecrescente {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
Scanner sc = new Scanner(System.in);
        while (true) {
            String[] array = sc.nextLine().split("\\s");
            int x = Integer.valueOf(array[0]);
            int y = Integer.valueOf(array[1]);
            if (x > y) {
                System.out.println("Decrescente");
            } else if (x < y) {
                System.out.println("Crescente");
            } else {
                break;
            }
        }
    }
 
}