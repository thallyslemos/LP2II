package Q5;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        List<Contato> contatos = new ArrayList<Contato>();
        boolean continuar;
        Scanner s = new Scanner(System.in);

        do {
            continuar = true;
            int op = 0;
            System.out.println(
                    "***********************************\nSystema de cadastro de Contatos\n1 - Cadastrar novo contato\n2 - Listar Contatos\n3 - Encerrar\n***********************************");
            op = s.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Cadastro de contato");
                    s.nextLine();
                    System.out.println("Insira o nome do novo contato: ");
                    String nome = s.nextLine();
                    System.out.println("Insira o Telefone: ");
                    long telefone = s.nextLong();
                    System.out.println("Insira a data do seu nascimento: ");
                    int dia, mes, ano;
                    do {
                        System.out.println("Dia: ");
                        dia = s.nextInt();
                    } while (dia < 0 || dia > 31);
                    do {
                        System.out.println("Mês: ");
                        mes = s.nextInt() - 1;
                    } while (mes < 0 || mes > 11);
                    do {
                        System.out.println("Ano: ");
                        ano = s.nextInt();

                    } while (ano < 1800 || ano > 2023);

                    GregorianCalendar data = new GregorianCalendar(ano, mes, dia);

                    Contato novoContato = new Contato(nome, telefone, data);

                    contatos.add(novoContato);

                    break;
                case 2:
                    Set<Integer> anos = new HashSet<>();

                    for (Contato c : contatos) {
                        anos.add(c.getDataNascimento().get(GregorianCalendar.YEAR));
                        // anos +="* " + c.getDataNascimento().get(GregorianCalendar.YEAR) + "\n";
                    }

                    String listaAnos = "De qual ano?\n";
                    for (Integer a : anos) {
                        listaAnos += "* " + a.intValue() + "\n";
                    }
                    System.out.println(listaAnos);
                    int anoPesquisa = s.nextInt();
                    // Pesquisar contato pelo ano

                    System.out.println("Listagem de contatos");
                    for (Contato c : contatos) {
                        int anoContato = c.getDataNascimento().get(GregorianCalendar.YEAR);
                        if (anoPesquisa == anoContato)
                            System.out.println(c.toString());
                    }
                    break;
                case 3:
                    System.out.println("Programa encerrado");
                    continuar = false;
                    break;
                default:
                    break;
            }
        } while (continuar);
        s.close();
    }
}
