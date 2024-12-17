import java.io.IOException;
 import java.util.Scanner;

public class Media2 {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
   Scanner sc = new Scanner(System.in);
        double a = Double.valueOf(sc.nextLine());
        double b = Double.valueOf(sc.nextLine());
        double c = Double.valueOf(sc.nextLine());
        double media = ((a * 2) + (b * 3) + (c * 5)) / 10;
        System.out.println("MEDIA = " + String.format("%.1f", media));
    
    
    }
 
}