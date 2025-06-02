package arte;

import java.util.Scanner;

public class TesteArte {
    public static void executar() {
        Cores cores = new Cores();
        CirculoCromatico circuloCromatico = new CirculoCromatico();
        CombinacaoCores combinacaoCores = new CombinacaoCores();
        System.out.println("----Bem-vindo ao Teste de Arte!----");
        System.out.println("Escolha uma das opções abaixo para aprender mais sobre cores:");
        System.out.println("1. Cores" + "\n2. Círculo Cromático" + "\n3. Combinação de Cores" + "\n0. Sair");
    
        Scanner scanner = new Scanner(System.in);
        int escolha = Integer.parseInt(scanner.nextLine());
        while (escolha != 0 && escolha < 3 && escolha > 0) {
            switch (escolha) {
                case 1:
                    System.out.println("----O que você gostaria de saber sobre cores?----");
                    System.out.println("Escolha uma opção: ");
                    System.out.println("1. Definição de Cores");
                    System.out.println("2. Exercício sobre Cores");
                    System.out.println("0. Sair");
                    
                        int opcao = Integer.parseInt(scanner.nextLine());
                    while (opcao != 0) {
                        if (opcao == 1) {
                            System.out.println(cores.getDefinicao());
                        } else if (opcao == 2) {
                            System.out.println(cores.getExercio());
                        } else {
                            System.out.println("Opção inválida.");
                            opcao = Integer.parseInt(scanner.nextLine());
                        }
                        System.out.println("Escolha uma opção: \n1. Definição de Cores \n2. Exercício sobre Cores \n0. Sair");
                    }
                    
                    break;
                case 2:
                    System.out.println("----O que você gostaria de saber sobre o Círculo Cromático?----");
                    System.out.println("Escolha uma opção: ");
                    System.out.println("1. Definição do Círculo Cromático");
                    System.out.println("2. Exercício sobre o Círculo Cromático");
                    System.out.println("0. Sair");

                    int opcaoCirculo = Integer.parseInt(scanner.nextLine());
                    while ((opcaoCirculo != 0)) {
                        if (opcaoCirculo == 1) {
                            System.out.println(circuloCromatico.getDefinicao());
                        } else if (opcaoCirculo == 2) {
                            System.out.println(circuloCromatico.getExercio());
                        } else {
                            System.out.println("Opção inválida.");
                            opcaoCirculo = Integer.parseInt(scanner.nextLine());
                        }
                        System.out.println("Escolha uma opção: \n1. Definição do Círculo Cromático \n2. Exercício sobre o Círculo Cromático \n0. Sair");
                        opcaoCirculo = Integer.parseInt(scanner.nextLine());
                        
                    }
                    break;
                case 3:
                    
                    System.out.println("----O que você gostaria de saber sobre Combinação de Cores?----");
                    System.out.println("Escolha uma opção: ");
                    System.out.println("1. Definição de Combinação de Cores");
                    System.out.println("2. Exercício sobre Combinação de Cores");
                    System.out.println("0. Sair");

                    int opcaoCombinacao = Integer.parseInt(scanner.nextLine());
                    while (opcaoCombinacao != 0) {
                        if (opcaoCombinacao == 1) {
                            System.out.println(combinacaoCores.getDefinicao());
                        
                           
                            opcaoCombinacao = Integer.parseInt(scanner.nextLine());
                        } else if (opcaoCombinacao == 2) {
                            System.out.println(combinacaoCores.getExercio());
                            
                            
                            opcaoCombinacao = Integer.parseInt(scanner.nextLine());
                        } else {
                            System.out.println("Opção inválida.");
                            opcaoCombinacao = Integer.parseInt(scanner.nextLine());
                        }
                         System.out.println("Escolha uma opção: \n1. Definição de Combinação de Cores \n2. Exercício sobre Combinação de Cores \n0. Sair");
                        opcaoCombinacao = Integer.parseInt(scanner.nextLine());
                    }
                    break;
                default:
                    System.out.println("Opção inválida.");
            } 
        } if (escolha != 0 && (escolha < 1 || escolha > 3)) {
            System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
        }
    }
}
