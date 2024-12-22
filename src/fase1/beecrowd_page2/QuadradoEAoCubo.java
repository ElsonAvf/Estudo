package fase1.beecrowd_page2;
import java.util.Scanner;

public class QuadradoEAoCubo {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int qnt = Integer.valueOf(sc.nextLine());
        
        for (int i = 1; i <= qnt; i++) {
            System.out.println(i + " " + String.format("%.0f", Math.pow(i, 2)) + " " + String.format("%.0f", Math.pow(i, 3)));
        }
    }
}