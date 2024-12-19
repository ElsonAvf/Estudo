package fase1.beecrowd_page2;

import java.util.Scanner;

public class Quadrante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String[] array = sc.nextLine().split("\\s");
            int x = Integer.valueOf(array[0]);
            int y = Integer.valueOf(array[1]);
            if (x == 0 || y == 0) {
                break;
            } else if (x > 0 && y > 0) {
                System.out.println("primeiro");
            } else if (x > 0 && y < 0) {
                System.out.println("quarto");
            } else if (x < 0 && y > 0) {
                System.out.println("segundo");
            } else {
                System.out.println("terceiro");
            }
        }
    }
}