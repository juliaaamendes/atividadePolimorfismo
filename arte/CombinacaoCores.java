package arte;

import java.util.Scanner;

public class CombinacaoCores extends Arte {
    @Override
    public String getDefinicao() {
        System.out.println("----O que são combinações de cores?----" + "\n \nCombinação de cores é a prática de unir diferentes cores " +
                   "para criar harmonia visual. " +
                   "\nAs cores podem ser combinadas de várias maneiras, como complementar, análoga ou tríade.");
        System.out.println("\n \nCombinações complementares usam cores opostas no círculo cromático, ");
        System.out.println("como \u001B[91mVermelho\u001B[0m e \u001B[31mVerde\u001B[0m, criando contraste.");
        System.out.println("\nCombinações análogas usam cores adjacentes no círculo, ");
        System.out.println("como \u001B[36mAzul\u001B[0m, \u001B[33mAmarelo\u001B[0m,  e \u001B[31mVerde\u001B[0m, criando harmonia suave.");
        System.out.println("\nCombinações tríades usam três cores equidistantes no círculo, ");
        System.out.println("como \u001B[91mVermelho\u001B[0m, \u001B[33mAmarelo\u001B[0m e \u001B[96mAzul\u001B[0m ");
        return  "criando equilíbrio dinâmico.";
        }
    

    @Override
    public String getExercio() {
        System.out.println("----Vamos fazer um exercício sobre combinação de cores!----");
        System.out.println("\nTente criar uma paleta de cores usando três cores analogas (adjacentes no círculo cromático).");
        System.out.println("Vou te dar uma ajudinha e te exibir um círculo cromático:");
        CirculoCromatico.desenharCirculoDegrade(10, 15, 15);
        System.out.println("\nEscolha a primeira cor (1. Vermelho, 2. Azul, 3. Amarelo):");
        Scanner scanner = new Scanner(System.in);
        int escolha = scanner.nextInt();
        switch (escolha) {
            case 1:
                System.out.println("Você escolheu Vermelho! Agora, escolha uma cor análoga (adjacente):");
                System.out.println("1. Laranja" + "\n2. Verde");
                int escolhaVermelho = scanner.nextInt();
                if (escolhaVermelho == 1) {
                    System.out.println("Boa! Vermelho e Laranja são cores análogas." + "Vamos tentar mais uma vez?");
                    System.out.println("Agora, escolha uma cor análoga ao Laranja:");
                    System.out.println("1. Verde" + "\n2. Amarelo");
                    int escolhaLaranja = scanner.nextInt();
                    if (escolhaLaranja == 1) {
                        System.out.println("Verde não é uma cor análoga ao Laranja, que pena!");
                    } else {
                        System.out.println("Parabens! Você fez uma palheta de cores análogas: Vermelho, Laranja e Amarelo.");
                        Cores.exibirBlocoColorido(255, 0, 0, "Vermelho");
                        Cores.exibirBlocoColorido(255, 165, 0, "Laranja");
                        Cores.exibirBlocoColorido(255, 255, 0, "Amarelo");
                    }
                } else {
                    System.out.println("Verde não é uma cor análoga ao Vermelho, que pena!");
                }
                break;
            case 2:
                System.out.println("Você escolheu Azul! Agora, escolha uma cor análoga (adjacente):");
                System.out.println("1. Verelho" + "\n2. Roxo");
                int escolhaAzul = scanner.nextInt();
                if (escolhaAzul == 1) {
                    System.out.println("Azul não é uma cor análoga ao Vermelho, que pena!");
                } else {
                    System.out.println("Boa! Azul e Roxo são cores análogas." + "Vamos tentar mais uma vez?");
                    System.out.println("Agora, escolha uma cor análoga ao Roxo:");
                    System.out.println("1. Verde" + "\n2. Vermelho");
                    int escolhaRoxo = scanner.nextInt();
                    if (escolhaRoxo == 1) {
                        System.out.println("Verde não é uma cor análoga ao Roxo, que pena!");
                    } else {
                        System.out.println("Parabens! Você fez uma palheta de cores análogas: Azul, Roxo e Vermelho.");
                        Cores.exibirBlocoColorido(0, 0, 255, "Azul");
                        Cores.exibirBlocoColorido(128, 0, 128, "Roxo");
                        Cores.exibirBlocoColorido(255, 0, 0, "Vermelho");
                    }
                }
                break;
            case 3:
                System.out.println("Você escolheu Amarelo! Agora, escolha uma cor análoga (adjacente):");
                System.out.println("1. Vermelho" + "\n2. Verde");
                int escolhaAmarelo = scanner.nextInt();
                if (escolhaAmarelo == 1) {
                    System.out.println("Vermelho não é uma cor análoga ao Amarelo, que pena!");
                } else {
                    System.out.println("Boa! Amarelo e Verde são cores análogas." + "Vamos tentar mais uma vez?");
                    System.out.println("Agora, escolha uma cor análoga ao Verde:");
                    System.out.println("1. Azul" + "\n2. Vermelho");
                    int escolhaVerde = scanner.nextInt();
                    if (escolhaVerde == 1) {
                        System.out.println("Azul não é uma cor análoga ao Verde, que pena!");
                    } else {
                        System.out.println("Parabens! Você fez uma palheta de cores análogas: Amarelo, Verde e Azul.");
                        Cores.exibirBlocoColorido(255, 255, 0, "Amarelo");
                        Cores.exibirBlocoColorido(0, 255, 0, "Verde");
                        Cores.exibirBlocoColorido(0, 0, 255, "Azul");
                    }
                }
        
        };
        return "Pronto! Você aprendeu sobre combinações de cores análogas!" +
               "\nTente criar suas próprias paletas de cores usando o círculo cromático!";
    }
}
