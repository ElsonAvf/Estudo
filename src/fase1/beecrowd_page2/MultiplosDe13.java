package fase1.beecrowd_page2;
import java.util.Scanner;

public class MultiplosDe13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = Integer.valueOf(sc.nextLine());
        int end = Integer.valueOf(sc.nextLine());
        if(start > end) {
            int temp = start;
            start = end;
            end = temp;
        }
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (i % 13 != 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}