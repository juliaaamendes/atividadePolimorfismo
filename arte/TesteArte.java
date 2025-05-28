package arte;

import java.util.Scanner;

public class TesteArte {
    public static void main(String[] args) {
        Cores cores = new Cores();
        CirculoCromatico circuloCromatico = new CirculoCromatico();
        CombinacaoCores combinacaoCores = new CombinacaoCores();
        System.out.println("Bem-vindo ao Teste de Arte!");
        System.out.println("Escolha uma das opções abaixo para aprender mais sobre cores:");
        System.out.println("1.Cores" + "\n2. Círculo Cromático" + "\n 3. Combinação de Cores");
    
        Scanner scanner = new Scanner(System.in);
        int escolha = Integer.parseInt(scanner.nextLine());
        switch (escolha) {
            case 1:
                System.out.println("O que você gostaria de saber sobre cores?");
                System.out.println("1. Definição de Cores");
                System.out.println("2. Exercício sobre Cores");
                int opcao = Integer.parseInt(scanner.nextLine());
                if (opcao == 1) {
                    System.out.println(cores.getDefinicao());
                } else if (opcao == 2) {
                    System.out.println(cores.getExercio());
                } else {
                    System.out.println("Opção inválida.");
                }
                break;
            case 2:
                System.out.println("O que você gostaria de saber sobre o Círculo Cromático?");
                System.out.println("1. Definição do Círculo Cromático");
                System.out.println("2. Exercício sobre o Círculo Cromático");
                int opcaoCirculo = Integer.parseInt(scanner.nextLine());
                if (opcaoCirculo == 1) {
                    System.out.println(circuloCromatico.getDefinicao());
                } else if (opcaoCirculo == 2) {
                    System.out.println(circuloCromatico.getExercio());
                } else {
                    System.out.println("Opção inválida.");
                }
                break;
            case 3:
                
                System.out.println("O que você gostaria de saber sobre Combinação de Cores?");
                System.out.println("1. Definição de Combinação de Cores");
                System.out.println("2. Exercício sobre Combinação de Cores");
                int opcaoCombinacao = Integer.parseInt(scanner.nextLine());
                if (opcaoCombinacao == 1) {
                    System.out.println(combinacaoCores.getDefinicao());
                } else if (opcaoCombinacao == 2) {
                    System.out.println(combinacaoCores.getExercio());
                } else {
                    System.out.println("Opção inválida.");
                }
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }
}
