public class PinturaRupestre extends Arte {
    private String cor;
    private String localizacao;

    public PinturaRupestre(String nome, String pintura, String cor, String localizacao) {
        setNome(nome);
        setPintura(pintura);
        this.cor = cor;
        this.localizacao = localizacao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
}