package Q8;

import java.util.HashMap;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hash = new HashMap<>(23);
        Scanner scn = new Scanner(System.in);
        int op;
        boolean continuar = true;

        do {
            System.out.println("\n********************MENU*****************");
            System.out.println("* 1 - inserir novo valor                *");
            System.out.println("* 2 - Encerrar programa                 *");
            int fim = hash.size();
            if (hash.size() > 0) {
                System.out.println("* 3 - Listar valor por chave informada  *");
            }
            System.out.println("*****************************************\n");

            op = scn.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Informe o valor: ");
                    int novoValor = scn.nextInt();
                    int chave = (hash.size());
                    hash.put(chave, novoValor);
                    break;
                case 2:
                    System.out.println("Programa encerrado!");
                    continuar = false;
                    break;
                case 3:
                    fim = hash.size();
                    System.out.println("Informe a chave (0" + "-" + (fim - 1) + ") : ");
                    chave = scn.nextInt();
                    System.out.println("Valor: " + hash.get(chave));
                    break;
                default:
                    break;

            }

        } while (continuar);

        scn.close();
    }
}