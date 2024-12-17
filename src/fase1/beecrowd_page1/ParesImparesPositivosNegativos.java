import java.io.IOException;
 import java.util.Scanner;

public class ParesImparesPositivosNegativos {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
 Scanner sc = new Scanner(System.in);
        double[] array = new double[5];
        for (int i = 0; i < 5; i++) {
            array[i] = Double.valueOf(sc.nextLine());
        }
        int qntPares = 0;
        int qntImpares = 0;
        int qntPos = 0;
        int qntNeg = 0;
        for (int i = 0; i < 5; i++) {
            if (array[i] % 2 == 0) {
                qntPares++;
            } else {
                qntImpares++;
            }
            
            if (array[i] > 0) {
                qntPos++;
            } else if (array[i] < 0) {
                qntNeg++;
            }
        }
        System.out.println(qntPares + " valor(es) par(es)");
        System.out.println(qntImpares + " valor(es) impar(es)");
        System.out.println(qntPos + " valor(es) positivo(s)");
        System.out.println(qntNeg + " valor(es) negativo(s)");
    }
 
}
