package QE;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * (Peso: 1,5) Considere implementação de classe para encapsulamento de
         * atributos típicos de um punhado de moedas assumindose,
         * para tal, que todas elas são de um mesma valor (5, 10, 25, 50 ou 75 centavos
         * ou R$ 1,00).
         */
        /*
         * Para demonstração das capacidades da classe acima mencionada, implemente uma
         * classe utilitária que disponha de método
         * estático main através do qual possam ser executadas, a qualquer momento,
         * alguma das seguintes operações:
         * a) Cadastro de novo punhado de moedas, pela entrada, pelo usuário, do valor e
         * da quantidade delas;
         * b) Identificação e exibição de valor total em moedas considerando todos os
         * punhados de moedas até então cadastrados;
         * c) Identificação e exibição do valor de moeda que dispõe de maior quantidade
         * considerando, para tal, todos os punhados de
         * moedas até então cadastrados;
         * d) Encerramento da aplicação.
         * Em caso de seleção de alguma das operações elencadas pelos itens a, b e c,
         * após executada, deverá ser permitido ao usuário
         * selecionar novamente outra operação. Por fim, para manutenção das instâncias
         * da classe PunhadoMoedas, exige-se o uso de
         * alguma classe concreta da biblioteca de coleções genéricas da linguagem Java
         * que implemente a interface java.util.List<E>
         * (a exemplo de java.util.ArrayList<E> e java.util.LinkedList<E>).
         * Observação: para a realização das operações de consulta sobre os punhados de
         * moeda até então cadastrados (itens b e c), exigese
         * adicionalmente que sejam usados iteradores da instância da classe concreta
         * escolhida da biblioteca de coleções genéricas.
         */

        List<PunhadoMoedas> lista_punhados = new ArrayList<>();
        int op;
        boolean encerrar_programa = false;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println(
                    "\n *** Selecione uma das opções enumeradas *** \n* 1 - Cadastrar novo punhado de moedas \n* 2 - Valor total das moedas \n* 3 - Moeda que pussui maior quantidade \n* 4 - Encerrar");
            op = input.nextInt();
            Iterator<PunhadoMoedas> it = lista_punhados.iterator();

            switch (op) {
                case 1:
                    boolean valorInvalido = true;
                    int quantidade = 0;
                    while (valorInvalido) {
                        try {
                            System.out.println("Insira a quantidade de moedas(número inteiro): ");
                            quantidade = input.nextInt();
                            valorInvalido = false;

                        } catch (Exception e) {
                            input.next();
                            System.err.println("Número inválido");
                        }
                    }
                    do {

                        System.out.println("Insira o valor das moedas (0,05, 0,10, 0,25, 0,50, 0,75 ou 1): ");
                        double valor = input.nextDouble();
                        PunhadoMoedas punhado = new PunhadoMoedas(valor, quantidade);
                        if (punhado.getQuantidade() != 0) {
                            lista_punhados.add(punhado);
                            valorInvalido = false;
                        } else {
                            System.out.println("Valor inválido!");
                            valorInvalido = true;
                        }
                    } while (valorInvalido);

                    break;
                case 2:
                    double valor_total = 0;
                    // Correção dométodo usando Iterator.
                    while (it.hasNext()) {
                        valor_total += it.next().getTotalPunhado();
                    }
                    // for (PunhadoMoedas p : lista_punhados) {
                    // valor_total += p.getTotalPunhado();
                    // }
                    System.out.println("O valor total em moedas é: " + valor_total);
                    break;
                case 3:

                    int maior_quantidade = 0;
                    double valor_moeda = 0;

                        while(it.hasNext()){
                            // double val = it.next().getValor();
                            // int qnt =  it.next().getQuantidade();
                            System.out.println(it.next());
                            System.out.println(it.next());
                            while(it.hasNext()){
                                // System.out.println(it.next());
                                // if(val == it.next().getValor()){
                                //     qnt += it.next().getQuantidade();
                                // }
                            }
                        }
                    System.out.println("Método não implementado...");
                    break;
                case 4:
                    encerrar_programa = true;
                    System.out.println("Programa encerrado...");
                    break;
                default:
                    System.out.println("Opção não encontrada, digite uma das disponíneis...");
                    break;
            }

        } while (!encerrar_programa);

        input.close();
    }
}
