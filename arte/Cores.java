package arte;

import java.util.Scanner;

public class Cores extends Arte {
    public static void exibirBlocoColorido(int r, int g, int b, String nome) {
        String cor = "\033[48;2;" + r + ";" + g + ";" + b + "m";
        String reset = "\033[0m";
        
        // Bloco colorido e nome na mesma linha
        System.out.print(cor + "   " + reset + " " + nome + "\t");
    }
    
    public static void mostrarCoresPrimarias() {
        System.out.println("\n=== CORES PRIMÁRIAS ===");
        exibirBlocoColorido(255, 0, 0, "Vermelho");
        exibirBlocoColorido(0, 0, 255, "Azul");
        exibirBlocoColorido(255, 255, 0, "Amarelo");
        System.out.println(); // Quebra de linha após todas as cores primárias
    }
    
    public static void mostrarCoresSecundarias() {
        System.out.println("\n=== CORES SECUNDÁRIAS ===");
        exibirBlocoColorido(255, 0, 255, "Magenta");
        exibirBlocoColorido(0, 128, 0, "Verde");
        exibirBlocoColorido(255, 165, 0, "Laranja");
        System.out.println(); // Quebra de linha após todas as cores secundárias
    }
    
    public static void mostrarCoresTerciarias() {
        System.out.println("\n=== CORES TERCIÁRIAS ===");
        exibirBlocoColorido(255, 192, 203, "Rosa");
        exibirBlocoColorido(128, 0, 128, "Roxo");
        exibirBlocoColorido(0, 255, 255, "Ciano");
        exibirBlocoColorido(255, 215, 0, "Dourado");
        System.out.println(); // Quebra de linha após todas as cores terciárias
    }
    
    public static void mostrarTodasPaletas() {
        mostrarCoresPrimarias();
        mostrarCoresSecundarias();
        mostrarCoresTerciarias();
    }

    @Override
    public String getDefinicao() {
        System.out.println("Cores são percepções visuais criadas pela luz refletida em objetos. " +
               "\nAs cores primárias (vermelho, azul e amarelo) são as bases para criar todas as outras cores. ");
        mostrarCoresPrimarias();
        System.out.println("\nAs cores secundárias (magenta, verde e laranja) são formadas pela mistura de duas cores primárias. " +
               "\nAs cores terciárias são combinações de uma cor primária com uma cor secundária.");
        mostrarCoresSecundarias();
        System.out.println("\nAs cores terciárias (rosa, roxo, ciano e dourado) são formadas pela mistura de uma cor primária com uma cor secundária.");
        mostrarCoresTerciarias();
        return "Cores são fundamentais na arte e no design, influenciando emoções e percepções.";
    }

    @Override
    public String getExercio() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\n=== IDENTIFIQUE O TIPO DE COR ===");
        exibirBlocoColorido(0, 255, 255, "----");
        System.out.println(); // Quebra de linha após o bloco colorido
        System.out.print("Qual é o nome da cor acima? \n 1- Ciano \n 2- Verde \n 3- Dourado \nDigite o número da opção: ");
        int userInput = Integer.parseInt(scanner.nextLine());
        
        String resultado;
        switch (userInput) {
            case 1:
                resultado = "";
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
        if ( userInput == 1) {
            System.out.println("Muito bem! Agora você sabe diser de qual grupo de cores ela faz parte?" 
                    + "\n 1- Primária \n 2- Secundária \n 3- Terciária \nDigite o número da opção: ");
            int userInput2 = Integer.parseInt(scanner.nextLine());
            switch (userInput2) {
                case 1:
                    System.out.println("Incorreto! Ciano é uma cor terciária.");
                    break;
                case 2:
                    System.out.println("Incorreto! Ciano é uma cor terciária.");
                    break;
                case 3:
                    System.out.println("Correta! Ciano é uma cor terciária, você sabe de que cores ela é feita?" 
                    + "\n 1- Azul e Verde \n 2- Vermelho e Amarelo \n 3- Azul e Vermelho \nDigite o número da opção: ");
                    int userInput3 = Integer.parseInt(scanner.nextLine());
                    switch (userInput3) {
                        case 1:
                            System.out.println("Muito bem! Ciano é uma mistura de Azul e Verde! Você é muito vom nisso!");
                            break;
                        case 2:
                            System.out.println("Incorreto! Ciano não é feito de Vermelho e Amarelo.");
                            break;
                        case 3:
                            System.out.println("Incorreto! Ciano não é feito de Azul e Vermelho.");
                            break;
                        default:
                            System.out.println("Opção inválida.");
                    }
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
                
        } else {
            System.out.println("Tente novamente! A cor correta é Ciano, que é uma mistura de azul e verde.");
            
        }
        
        scanner.close();
        return resultado;
    }
}