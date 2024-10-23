package school.sptech;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Livro {
    private String titulo;
    private String autor;
    private LocalDate dataPublicacao;
    private List<Avaliacao> avaliacoes;

    public Livro(String titulo, String autor, LocalDate dataPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.dataPublicacao = dataPublicacao;
        this.avaliacoes = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public LocalDate getDataPublicacao() {
        return dataPublicacao;
    }

    public void adicionarAvaliacao(String descricao, Double qtdEstrelas) {
        if (descricao == null || descricao.isBlank()) {
            System.out.println("A descrição não pode ser nula ou vazia.");
        }
        else if (qtdEstrelas == null || qtdEstrelas < 0 || qtdEstrelas > 5) {
            System.out.println("A quantidade de estrelas deve estar entre 0 e 5.");
        } else {
            Avaliacao avaliacao = new Avaliacao(descricao, qtdEstrelas);
            avaliacoes.add(avaliacao);
        }
    }


    public Double calcularMediaAvaliacoes() {
        if (avaliacoes.isEmpty()) {
            return 0.0;
        }
        double soma = 0.0;
        for (Avaliacao avaliacao : avaliacoes) {
            soma += avaliacao.getQtdEstrelas();
        }
        return soma / avaliacoes.size();
    }

    @Override
    public String toString() {
        return "Título: %s\nAutor: %s\nData de Publicação: %s\nMédia de Avaliações: %.2f".formatted(
                titulo, autor, dataPublicacao, calcularMediaAvaliacoes());
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setDataPublicacao(LocalDate dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public List<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(List<Avaliacao> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }
}
