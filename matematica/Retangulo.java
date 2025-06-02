package matematica;

public class Retangulo extends Figura{

    @Override
    public String exibirDefinicao(){
        System.out.println("Retângulo é um quadrilátero cujos ângulos internos são todos retos.");
        System.out.println("O retângulo é uma figura geométrica plana, ou seja, sempre existe um plano que contém todos os pontos de um retângulo.");
        System.out.println("Retângulos são polígonos (são quadriláteros) e, por isso, são formados por segmentos de reta que não se cruzam, além de não possuírem qualquer abertura.");
        System.out.println("Para calcular a área de um retângulo, é necessário multiplicar o valor da base pelo da altura.");
        System.out.println("Para calcular o perímetro de um retângulo, é necessário somar o dobro de sua base com o dobro de sua altura");
        return null;
    };

    @Override
    public String mostrarExemplo(){
        System.out.println("Por exemplo: Um retângulo de lado = 2cm e base = 4cm apresenta uma área de 8cm e um perímetro de 12cm");
        return null;
    };
}
