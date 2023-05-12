package Q3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> l = new ArrayList<>();
        ArrayList<String> l2 = new ArrayList<>();
        final int tam = 3;
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < tam; i++) {
            Boolean nomeRepetido = false;
            String nome;
            do{
                System.out.println("Insira o nome do animmal n° " + (i + 1) + " : ");
                nome = s.nextLine();
                for(String name: l) {
                    if(name == nome) {
                        nomeRepetido = true;
                    }
                }
            }while(nomeRepetido);
            l.add(nome);
        }

        for(int i = tam-1; i >= 0 ; i --) {
            String nome = l.get(i);
            if(nome.length() >= 5) {
                l2.add(l.remove(i));
            }
        }

        System.out.println(l.toString());
        System.out.println(l2.toString());

    }
}
