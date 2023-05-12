package Q2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class App {
    public static int getNumeroReverso(int n) {
        int ultimoDigito;
        int nReverso = 0;
        while (n != 0) {
            ultimoDigito = n % 10;
            nReverso = nReverso * 10 + ultimoDigito;
            n = n / 10;
        }
        return nReverso;
    }

    public static void main(String[] args) throws Exception {
        ArrayList<Integer> l = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        final int tam = 3;
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < tam; i++) {
            Integer numero;
            System.out.println("Insira um número inteiro: ");
            numero = s.nextInt();
            l.add(numero);
        }

        for (int i = tam - 1; i >= 0; i--) {
            int numero = l.get(i);
            int reversivel = getNumeroReverso(numero);
            String primeiro = Integer.toString(numero);
            String ultimo = Integer.toString(reversivel);

            if (primeiro.charAt(0) == ultimo.charAt(0)) {
                l2.add(l.remove(i));
            }
        }

        System.out.println(l.toString());
        System.out.println(l2.toString());

    }
}
