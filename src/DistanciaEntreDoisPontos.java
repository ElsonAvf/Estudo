import java.io.IOException;
 import java.util.Scanner;

public class DistanciaEntreDoisPontos {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
 Scanner sc = new Scanner(System.in);
        String[] firstTerms = sc.nextLine().split("\\s");
        String[] secondTerms = sc.nextLine().split("\\s");
        double x1 = Double.valueOf(firstTerms[0]);
        double y1 = Double.valueOf(firstTerms[1]);
        double x2 = Double.valueOf(secondTerms[0]);
        double y2 = Double.valueOf(secondTerms[1]);
        double dist = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println(String.format("%.4f", dist));
    }
 
}