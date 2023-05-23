package Q7;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

public class App {
    public static void main(String[] args) throws Exception {
        Queue<Integer> fatoresPrimos = new ArrayDeque<Integer>();
        int numero;
        Scanner scn = new Scanner(System.in);

        System.out.println("Digite o numero a ser fatorado: ");
        numero = scn.nextInt();

        for (int i = 2; i <= numero; i++) {
            while (numero % i == 0) {
                fatoresPrimos.add(i);
                numero /= i;
            }
        }

        
        String fatores = "";
        while (!fatoresPrimos.isEmpty()) {
            fatores += fatoresPrimos.poll();

            if (!fatoresPrimos.isEmpty()) {
               fatores += " x ";
            }
        }
        System.out.println("Os fatores primos de " + numero + " são: " + fatores);
        scn.close();
    }
}
