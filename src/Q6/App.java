package Q6;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        Deque<Livro> pilhaLivros = new ArrayDeque<>();
        boolean continuar;
        final int qnt = 5;
        Scanner scn = new Scanner(System.in);

        System.out.println("Cadastro de Livros");
        for (int i = 0; i < qnt; i++) {
            System.out.println("Livro - " + (i + 1) + ": ");
            System.out.println("Insira o título: ");
            String titulo = scn.next();
            System.out.println("Insira o(s) nome(s) do(s) autor(es): ");
            String autores = scn.next();
            System.out.println("Insira o número da edição: ");
            int edicao = scn.nextInt();
            System.out.println("Insira o ano: ");
            int ano = scn.nextInt();

            Livro livro = new Livro(titulo, autores, edicao, ano);

            pilhaLivros.addLast(livro);

            if (pilhaLivros.size() == qnt) {
                System.out.println(pilhaLivros.toString());

                Stack<Livro> pilhaAuxiliar = new Stack<>();

                for (int j = 0; j <= 2; j++) {
                    pilhaAuxiliar.add(pilhaLivros.removeLast());
                }
                for (int j = 0; j <= 1; j++) {
                    if (j == 0)
                        System.out.println(pilhaAuxiliar.pop());
                    pilhaLivros.addLast(pilhaAuxiliar.pop());
                }
                System.out.println(pilhaLivros.toString());

            }

        }
        scn.close();
    }
}
