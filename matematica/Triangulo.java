package matematica;

public class Triangulo extends Figura{
 


    @Override
    public String exibirDefinicao(){
        System.out.println("Um triângulo, em geometria plana, é um polígono de três lados e três ângulos. É a figura mais simples estudada na geometria, e a soma dos seus ângulos internos é sempre 180 graus. ");
        System.out.println("Triângulo isósceles: Dois lados são iguais.");
        System.out.println("Triângulo escaleno: Todos os três lados são diferentes.");
        System.out.println("Para calcular a área de um triângulo é necessário saber a medida da base e da altura, utilizando a fórmula A=b*h/2");
        System.out.println("Para calcular o perímetro de um triângulo, basta somar todos os seus lados");
        return null;
    };

    @Override
    public String mostrarExemplo(){
        System.out.println("Por exemplo: Um triângulo de lado1 = 4cm, lado2 = 4cm, base = 2cm e altura = 4cm apresenta uma área de 4cm e um perímetro de 10cm");
        return null;
    };
};
