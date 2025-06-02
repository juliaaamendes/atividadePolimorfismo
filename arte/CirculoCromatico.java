package arte;

import java.util.Scanner;

public class CirculoCromatico extends Arte {
    int tamanho;
    @Override
    public String getDefinicao() {
        System.out.println("----O que é o Círculo Cromático?----");
        desenharCirculoDegrade(10, 15, 15);
        System.out.println("\nO círculo cromático é uma representação visual das cores, " +
                "\norganizando-as em um círculo para mostrar suas relações. " +
                "\nEle ajuda a entender como as cores se combinam e interagem entre si.");
        return "Ele organiza cores primárias, secundárias e terciárias," + 
        "\npermitindo a exploração da interação entre as cores e suas combinações," + 
        "\ntanto na arte quanto em design.";
    } //tem que retornar uma string, por isso essa gambiara
    
    @Override
    public String getExercio() {
        System.out.println("----Vamos fazer um exercício sobre o Círculo Cromático!----");
        System.out.println("Tente desenhar um círculo cromático digital com degradê usando cores RGB no terminal!" +
                "\nDiferentes tamanhos de círculos podem trazer diferentes efeitos visuais. vamos testar alguns tamanhos!" + 
                "Digite um tamanho de círculo (atenção circulos cromaticos maiores que 35 não cabem no terminal):");
        Scanner scanner = new Scanner(System.in);
        tamanho = scanner.nextInt();
        desenharCirculoDegrade(tamanho, tamanho/2 + tamanho, tamanho/2 + tamanho);
        
        
    
        return "Círculo Cromático Digital com Degradê (Terminal RGB)";
    }
    
    public static String desenharCirculoDegrade(int radius, int centerX, int centerY) {
        StringBuilder sb = new StringBuilder();

        //percorre uma matriz de caracteres
        for (int y = 0; y < centerY*2; y++) {
            for (int x = 0; x < centerX*2; x++) {
                //calcula a distancia do ponto atual ao centro
                double dx = x - centerX;
                double dy = y - centerY;
                double distance = Math.sqrt(dx * dx + dy * dy);

                //se estiver dentro do raio, calcula a cor
                if (distance <= radius) {
                    //calcula o angulo (matiz) em graus
                    double angle = Math.toDegrees(Math.atan2(dy, dx));
                    if (angle < 0) angle += 360;

                    //normaliza para 0-1
                    double hue = angle / 360.0;

                    //converte HSV para RGB
                    int[] rgb = hsvToRgb(hue, 1.0, 1.0);

                    //codigo ANSI para a cor
                    String ansiColor = String.format("\u001B[48;2;%d;%d;%dm", rgb[0], rgb[1], rgb[2]);
                    sb.append(ansiColor).append("  ");
                } else {
                    // Espaço vazio (fundo padrão)
                    sb.append("\u001B[0m  ");
                }
            }
            sb.append("\u001B[0m\n"); //reset na ultima linha
        }
        System.out.print(sb.toString());
        return sb.toString();
    }

    
    //convertendo 
    private static int[] hsvToRgb(double h, double s, double v) {
        double r = 0, g = 0, b = 0;
        
        int i = (int) (h * 6);
        double f = h * 6 - i;
        double p = v * (1 - s);
        double q = v * (1 - f * s);
        double t = v * (1 - (1 - f) * s);
        
        switch (i % 6) {
            case 0: r = v; g = t; b = p; break;
            case 1: r = q; g = v; b = p; break;
            case 2: r = p; g = v; b = t; break;
            case 3: r = p; g = q; b = v; break;
            case 4: r = t; g = p; b = v; break;
            case 5: r = v; g = p; b = q; break;
        }
        
        return new int[] {
            (int) (r * 255),
            (int) (g * 255),
            (int) (b * 255)
        };
    };
}
