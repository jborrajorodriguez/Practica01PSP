package practica01;

import java.util.Scanner;

/**
 * @author {Juan Borrajo Rodriguez}
 */
public class NewThread extends Thread {

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        int numero, fibo1, fibo2, i;
        do {
            System.out.print("Introduce numero mayor que 1 para que el resultado sea correcto: ");
            numero = sc.nextInt();
        } while (numero <= 1);
        System.out.println("Los " + numero + " primeros términos de la serie de Fibonacci son:");

        fibo1 = 1;
        fibo2 = 1;

        System.out.print(fibo1 + " ");
        for (i = 2; i <= numero; i++) {
            System.out.print(fibo2 + " ");
            fibo2 = fibo1 + fibo2;
            fibo1 = fibo2 - fibo1;
        }
        System.out.println();
    }

}
