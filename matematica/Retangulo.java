public class Retangulo extends Figura{
    private int base;

    public int getBase(){
        return base;
    };
 
    public void setBase(int base){
            this.base = base;
    };

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
    public int calcularA(){
        return base*lado;
    };

    @Override
    public int calcularP(){
        return lado*2 + base*2;
    };
}
