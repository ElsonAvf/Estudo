import java.io.IOException;
import java.util.Scanner; 

public class ProdutoSimples {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
         Scanner sc = new Scanner(System.in);
        int a = Integer.valueOf(sc.nextLine());
        int b = Integer.valueOf(sc.nextLine());
        System.out.println("PROD = " + (a * b));
 
    }
 
}