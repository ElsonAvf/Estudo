package fase1.beecrowd_page2;
import java.io.IOException;
import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class ValidacaoDeNota {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
 Scanner sc = new Scanner(System.in);
        int notasValidas = 0;
        double[] array = new double[2];
        while (notasValidas < 2) {
            double nota = Double.valueOf(sc.nextLine());
            if (nota < 0 || nota > 10) {
                System.out.println("nota invalida");
            } else {
                array[notasValidas] = nota; 
                notasValidas++;
            }
        }
        System.out.println("media = " + ((array[0] + array[1]) / 2));
        
    }
 
}
