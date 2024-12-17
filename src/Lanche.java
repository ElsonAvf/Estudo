import java.io.IOException;
import java.util.Scanner;

public class Lanche {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
 Scanner sc = new Scanner(System.in);
        double[] list = {4.0, 4.5, 5.0, 2.0, 1.5};
        String[] array = sc.nextLine().split("\\s");
        double total = list[Integer.valueOf(array[0]) - 1] * Double.valueOf(array[1]);
        System.out.println("Total: R$ " + String.format("%.2f", total));
    }
 
}