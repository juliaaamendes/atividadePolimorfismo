public class Quadrado extends Figura {


    @Override
    public String exibirDefinicao(){
        System.out.println("O quadrado é um polígono de quatro lados. Os quatro lados de um quadrado são congruentes e os quatro ângulos medem 90°.");
        System.out.println("Em um quadrado ABCD, os segmentos AC e BD são chamados de diagonais.");
        System.out.println("As diagonais de um quadrado são perpendiculares e se interceptam em seus respectivos pontos médios.");
        System.out.println("Para calcular a área de um quadrado, é necessário elevar o lado ao quadrado.");
        System.out.println("Para calcular o perímetro de um quadrado, é necessário multiplicar o lado por 4.");
        return null;
    };

    @Override
    public String mostrarExemplo(){
        System.out.println("Por exemplo: Um quadrado de lado = 2cm apresenta uma área de 4cm e um perímetro de 8cm");
        return null;
    };
};
