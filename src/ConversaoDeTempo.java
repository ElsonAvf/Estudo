import java.io.IOException;
 import java.util.Scanner;

public class ConversaoDeTempo {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
 Scanner sc = new Scanner(System.in);
        int segTot = Integer.valueOf(sc.nextLine());
        int h = segTot / 3600;
        int min = segTot % 3600 / 60;
        int seg = segTot % 3600 % 60;
        System.out.println(h + ":" + min + ":" + seg);
    }
 
}