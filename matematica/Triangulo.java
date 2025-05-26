public class Triangulo extends Figura{
    private int base;
    private int lado2;
    private int altura;

    public int getBase(){
        return base;
    };
 
    public void setBase(int base){
            this.base = base;
    };


    public int getLado2(){
        return lado2;
    };
 
    public void setLado2(int lado2){
            this.lado2 = lado2;
    };


    public int getAltura(){
        return altura;
    };
 
    public void setAltura(int altura){
            this.altura = altura;
    };


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
    public int calcularA(){
        return base*altura/2;
    };

    @Override
    public int calcularP(){
        return base+lado+lado2;
    };
};
