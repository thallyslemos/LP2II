package Q6;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        Deque<Livro> pilhaLivros = new ArrayDeque<>();
        final int qnt = 3;
        Scanner scnStr = new Scanner(System.in);
        Scanner scnInt = new Scanner(System.in);

        System.out.println("Cadastro de Livros");
        for (int i = 0; i < qnt; i++) {
            System.out.println("Livro - " + (i + 1) + ": ");
            System.out.println("Insira o título: ");
            String titulo = scnStr.nextLine();
            System.out.println("Insira o(s) nome(s) do(s) autor(es): ");
            String autores = scnStr.nextLine();
            System.out.println("Insira o número da edição: ");
            int edicao = (scnInt.nextInt());
            System.out.println("Insira o ano: ");
            int ano = (scnInt.nextInt());

            Livro livro = new Livro(titulo, autores, edicao, ano);

            pilhaLivros.addLast(livro);

            if (pilhaLivros.size() == qnt) {
                System.out.println(pilhaLivros.toString());

                Stack<Livro> pilhaAuxiliar = new Stack<>();

                // Remoção dos três primeiros elemntos da pilha
                for (int j = 0; j <= 2; j++) {
                    pilhaAuxiliar.add(pilhaLivros.removeLast());
                }
                for (int j = 0; j <= 1; j++) {
                    if (j == 0)
                        // remoção do antepenultimo item
                        System.out.println(pilhaAuxiliar.pop());
                    // devolução dos demais itens para a pilha original
                    pilhaLivros.addLast(pilhaAuxiliar.pop());
                }

                System.out.println(pilhaLivros.toString());

            }

        }
        scnInt.close();
        scnStr.close();
    }
}
