import java.io.IOException;
 import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class SenhaFixa {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
 Scanner sc = new Scanner(System.in);
        int senha;
        do {
            senha = Integer.valueOf(sc.nextLine());
            if(senha != 2002) {
               System.out.println("Senha Invalida");
            }
        } while (senha != 2002);
        System.out.println("Acesso Permitido");
    }
 
}