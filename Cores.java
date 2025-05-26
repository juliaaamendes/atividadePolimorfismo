import java.util.Scanner;

public class Cores extends Arte {
    public static void exibirBlocoColorido(int r, int g, int b, String nome) {
        String cor = "\033[48;2;" + r + ";" + g + ";" + b + "m";
        String reset = "\033[0m";
        
        // Bloco grande (3x3) com a cor
        for (int i = 0; i < 3; i++) {
            System.out.print(cor + "   " + reset + " ");
        }
        System.out.println(" " + nome);
        System.out.println();
    }
    
    public static void mostrarCoresPrimarias() {
        System.out.println("\n=== CORES PRIMÁRIAS ===");
        exibirBlocoColorido(255, 0, 0, "Vermelho");
        exibirBlocoColorido(0, 0, 255, "Azul");
        exibirBlocoColorido(255, 255, 0, "Amarelo");
    }
    
    public static void mostrarCoresSecundarias() {
        System.out.println("\n=== CORES SECUNDÁRIAS ===");
        exibirBlocoColorido(255, 0, 255, "Magenta (Vermelho + Azul)");
        exibirBlocoColorido(0, 255, 255, "Ciano (Azul + Verde)");
        exibirBlocoColorido(255, 165, 0, "Laranja (Vermelho + Amarelo)");
    }
    
    public static void mostrarCoresTerciarias() {
        System.out.println("\n=== CORES TERCIÁRIAS ===");
        exibirBlocoColorido(255, 192, 203, "Rosa");
        exibirBlocoColorido(128, 0, 128, "Roxo");
        exibirBlocoColorido(0, 128, 0, "Verde");
        exibirBlocoColorido(255, 215, 0, "Dourado");
    }
    
    public static void mostrarTodasPaletas() {
        mostrarCoresPrimarias();
        mostrarCoresSecundarias();
        mostrarCoresTerciarias();
    }
    @Override
    public String getDefinicao() {
        mostrarCoresPrimarias();
        mostrarCoresSecundarias();
        mostrarCoresTerciarias();
        return "Cores são percepções visuais criadas pela luz refletida em objetos. " +
               "As cores primárias (vermelho, azul e amarelo) são as bases para criar todas as outras cores. " +
               "As cores secundárias (magenta, ciano e laranja) são formadas pela mistura de duas cores primárias. " +
               "As cores terciárias são combinações de uma cor primária com uma cor secundária.";
    }

    @Override
    public String getExercio() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\n=== IDENTIFIQUE O TIPO DE COR ===");
        exibirBlocoColorido(0, 255, 255, "----");
        System.out.print("Qual é o nome da cor acima? \n 1- Ciano \n 2- Verde \n 3- Dourado \nDigite o número da opção: ");
        int userInput = Integer.parseInt(scanner.nextLine());
        
        String resultado;
        switch (userInput) {
            case 1:
                resultado = "Correta! A cor é Ciano.";
                break;
            case 2:
                resultado = "Incorreta. A cor não é Verde.";
                break;
            case 3:
                resultado = "Incorreta. A cor não é Dourado.";
                break;
            default:
                resultado = "Opção inválida.";
        }
        
        scanner.close();
        return resultado;
    }

    @Override
    public String getDesafio() {
        mostrarTodasPaletas();
        return "Desafio: Crie um programa que exiba blocos coloridos representando " +
               "as cores primárias, secundárias e terciárias. " +
               "Use as cores mencionadas acima e adicione pelo menos uma cor terciária adicional.";
    }
}

