package arte;

import java.util.Scanner;

public class CirculoCromatico extends Arte {
    private int tamanho = 10; 
    
    
    @Override
    public String getDefinicao() {
        desenharCirculoDegrade();
        System.out.println("O círculo cromático é uma representação visual das cores, " +
                "organizadas em um círculo para mostrar as relações entre elas. " +
                "Neste exercício, criamos um círculo cromático digital com um degradê de cores, " +
                "utilizando o modelo de cor RGB (Vermelho, Verde, Azul).");
        return "O círculo cromático é uma ferramenta essencial na teoria das cores, " +
                "ajudando a entender como as cores se relacionam e como podem ser combinadas.";
    }
    
    @Override
    public String getExercio() {
        
        return "Círculo Cromático Digital com Degradê (Terminal RGB)";
    }
    
    private void desenharCirculoDegrade() {
        int centroX = tamanho;
        int centroY = tamanho / 2; // Ajuste para proporção do terminal
        
        for (int y = 0; y < centroY * 2; y++) {
            for (int x = 0; x < tamanho * 2; x++) {
                double distancia = Math.sqrt(Math.pow(x - centroX, 2) + Math.pow(y - centroY, 2));
                
                if (distancia <= tamanho) {
                    double angulo = Math.atan2(y - centroY, x - centroX);
                    if (angulo < 0) angulo += 2 * Math.PI;
                    
                    int hue = (int) (angulo * 180 / Math.PI);
                    int[] rgb = hsvParaRgb(hue, 1.0, 1.0);
                    
                    System.out.print("\033[48;2;" + rgb[0] + ";" + rgb[1] + ";" + rgb[2] + "m \033[0m");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
    private int[] hsvParaRgb(int hue, double saturation, double value) {
        double c = value * saturation;
        double x = c * (1 - Math.abs((hue / 60.0) % 2 - 1));
        double m = value - c;
        
        double r, g, b;
        
        if (hue < 60) {
            r = c; g = x; b = 0;
        } else if (hue < 120) {
            r = x; g = c; b = 0;
        } else if (hue < 180) {
            r = 0; g = c; b = x;
        } else if (hue < 240) {
            r = 0; g = x; b = c;
        } else if (hue < 300) {
            r = x; g = 0; b = c;
        } else {
            r = c; g = 0; b = x;
        }
        
        return new int[] {
            (int) ((r + m) * 255),
            (int) ((g + m) * 255),
            (int) ((b + m) * 255)
        };
    }
}