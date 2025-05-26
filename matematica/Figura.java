public abstract class Figura{
   
    //declaração de variável utilizada pelas classes filhas
    public int lado;
 
    public int getLado(){
        return lado;
    };
 
    public void setLado(int lado){
            this.lado = lado;
    };
 
    //métodos abstratos que serão implementados pelas classes filhas
    public abstract String exibirDefinicao();
 
    public abstract int calcularA();

    public abstract int calcularP();
}