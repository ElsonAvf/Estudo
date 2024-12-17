import java.io.IOException;
 import java.util.Scanner;

public class GastoDeCombustivel {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
 Scanner sc = new Scanner(System.in);
        int tempoHoras = Integer.valueOf(sc.nextLine());
        int kmPorHora = Integer.valueOf(sc.nextLine());
        double gasto = (double)tempoHoras * kmPorHora / 12;
        System.out.println(String.format("%.3f", gasto));
    }
 
}