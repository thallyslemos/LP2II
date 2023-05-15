package Q4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Collection<String> l = new ArrayList<String>();
        Collection<String> l2 = new ArrayList<String>();
        final int tam = 3;
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < tam; i++) {
            String novoNome;
            Boolean nomeRepetido;
            do {
                nomeRepetido = false;
                System.out.println("Insira o nome do animmal n° " + (i + 1) + " : ");
                novoNome = s.nextLine();
                for (String nomeCadastrado : l) {
                    /*
                     * A comparação entre Strings em java deve ser feita com o método equals()
                     * pois o operador "==" pode não funcionar como o esperado para esse caso
                     * uma vez dessa forma iremos comparar o conteúdo das variáveis e não
                     * necessáriamente as Strings
                     */
                    if (nomeCadastrado.toLowerCase().equals(novoNome.toLowerCase())) {
                        nomeRepetido = true;
                        System.out.println("Esse nome já está em uso, tente outra opção.");
                    }
                }
            } while (nomeRepetido);
            l.add(novoNome);
        }

        Iterator<String> iterator = l.iterator();
        do {
            String nome = iterator.next();
            if(nome.length() >= 5) {
                l2.add(nome);
                iterator.remove();
            }
        } while (iterator.hasNext());
        // for (int i = tam - 1; i >= 0; i--) {
        // String nome = l.get(i);
        // if (nome.length() >= 5) {
        // l2.add(l.remove(i));
        // }
        // }

        System.out.println("Nomes curtos: " + l.toString());
        System.out.println("Nomes longos: " + l2.toString());
        s.close();
    }
}
