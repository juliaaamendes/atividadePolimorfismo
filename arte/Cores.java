package arte;

import java.util.Scanner;

public class Cores extends Arte {
    public static void exibirBlocoColorido(int r, int g, int b, String nome) {
        String cor = "\033[48;2;" + r + ";" + g + ";" + b + "m";
        String reset = "\033[0m";
        
        //bloco colorido e nome
        System.out.print(cor + "   " + reset + " " + nome + "\t");
    }
    
    public static void mostrarCoresPrimarias() {
        System.out.println("\n=== CORES PRIMÁRIAS ===");
        exibirBlocoColorido(255, 0, 0, "Vermelho");
        exibirBlocoColorido(0, 0, 255, "Azul");
        exibirBlocoColorido(255, 255, 0, "Amarelo");
        System.out.println(); //quebra linha depois de todas as cores primarias
    }
    
    public static void mostrarCoresSecundarias() {
        System.out.println("\n=== CORES SECUNDÁRIAS ===");
        exibirBlocoColorido(128, 0, 128, "Roxo (Vermelho + Azul)");
        exibirBlocoColorido(0, 128, 0, "Verde (Azul + Amarelo)");
        exibirBlocoColorido(255, 165, 0, "Laranja (Vermelho + Amarelo)");
        System.out.println();  //quebra linha depois de todas as cores secundarias
    }
    
    public static void mostrarCoresTerciarias() {
        System.out.println("\n=== CORES TERCIÁRIAS ===");
        exibirBlocoColorido(255, 192, 203, "Rosa (Vermelho + Branco)");
        exibirBlocoColorido(0, 255, 255, "Ciano (Azul + Verde)");
        System.out.println();  //quebra linha depois de todas as cores terciarias
    }
    
    public static void mostrarTodasPaletas() {
        mostrarCoresPrimarias();
        mostrarCoresSecundarias();
        mostrarCoresTerciarias();
    }

    @Override
    public String getDefinicao() {
        System.out.println("----O que são cores?----" + "\n \nCores são percepções visuais criadas pela luz refletida em objetos. " +
               "\nAs cores primárias (vermelho, azul e amarelo) são as bases para criar todas as outras cores. ");
        mostrarCoresPrimarias();
        System.out.println("\nAs cores secundárias (roxo, verde e laranja) são formadas pela mistura de duas cores primárias. ");
        mostrarCoresSecundarias();
        System.out.println("\nAs cores terciárias (rosa, ciano e dourado) são formadas pela mistura de uma cor primária com uma cor secundária.");
        mostrarCoresTerciarias();
        return "Cores são fundamentais na arte e no design, influenciando emoções e percepções."; 
    } //tem que retornar uma string, por isso essa gambiara

    @Override
    public String getExercio() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\n----Vamos fazer um exercício sobre cores!----");
        System.out.println("Primeiro, vamos exibir um bloco colorido. Você precisa adivinhar qual é a cor.");
        exibirBlocoColorido(0, 255, 255, "");
        System.out.println(); //quebra linha pra ficar mais bonito
        System.out.print("Qual é o nome da cor acima? \n 1- Ciano \n 2- Verde \n 3- Dourado \nDigite o número da opção: ");
        int userInput = Integer.parseInt(scanner.nextLine());
        
        String resultado;
        switch (userInput) {
            case 1:
                //se a pessoa acertar ela vai ter que responder outra pergunta, de novo, meio gambiara
                if (userInput == 1) {

                    System.out.println("Muito bem! Agora você sabe dizer de qual grupo de cores ela faz parte?" 
                            + "\n 1- Primária \n 2- Secundária \n 3- Terciária \nDigite o número da opção: ");
                    int userInput2 = Integer.parseInt(scanner.nextLine());
                    switch (userInput2) {
                        case 1:
                            resultado = "Incorreto! Ciano é uma cor terciária.";
                            break;
                        case 2:
                            resultado = "Incorreto! Ciano é uma cor terciária.";
                            break;
                        case 3:
                            if (userInput2 == 3) {
                                System.out.println("Correta! Ciano é uma cor terciária, você sabe de que cores ela é feita?" 
                                        + "\n 1- Azul e Verde \n 2- Vermelho e Amarelo \n 3- Azul e Vermelho \nDigite o número da opção: ");
                                int userInput3 = Integer.parseInt(scanner.nextLine());
                                switch (userInput3) {
                                    case 1:
                                        resultado = "Muito bem! Ciano é uma mistura de Azul e Verde! Você é muito bom nisso!";
                                        break;
                                    case 2:
                                        resultado = "Incorreto! Ciano não é feito de Vermelho e Amarelo.";
                                        break;
                                    case 3:
                                        resultado = "Incorreto! Ciano não é feito de Azul e Vermelho.";
                                        break;
                                    default:
                                        resultado = "Opção inválida.";
                                }
                            }
                            break;
                        default:
                            resultado = "Opção inválida.";
                    }
                }

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
        scanner.close();
        return resultado;
    }
}