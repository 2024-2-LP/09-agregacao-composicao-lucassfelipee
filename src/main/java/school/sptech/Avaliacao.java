package school.sptech;


public class Avaliacao {
    private String descricao;
    private Double qtdEstrelas;


    public Avaliacao(String descricao, Double qtdEstrelas) {
        this.descricao = descricao;
        this.qtdEstrelas = qtdEstrelas;
    }

    public Double getQtdEstrelas() {
        return qtdEstrelas;
    }

    @Override
    public String toString() {
        return "Avaliação: %s\nQuantidade de Estrelas: %.1f".formatted( descricao, qtdEstrelas);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setQtdEstrelas(Double qtdEstrelas) {
        this.qtdEstrelas = qtdEstrelas;
    }
}
