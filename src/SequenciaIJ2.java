import java.io.IOException;
 import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class SequenciaIJ2 {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
 int i = 1;
        int j = 7;
        while (i <= 9 && j >= 5) {
            System.out.println("I=" + i + " J=" + j);
            j--;
            if(j < 5) {
                j = 7;
                i += 2;
            }
        }
    }
 
}