public abstract class Arte {
    private String nome;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract String getPintura();
    public abstract String getEscultura();
}