package fase1.beecrowd_page2;

import java.util.Scanner;

public class DividindoXPorY {
    public static void main(String[] args) {
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