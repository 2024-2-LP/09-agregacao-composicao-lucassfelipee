package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;
    private String nome;

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarLivro(Livro livro) {
        if (livro == null) {
            System.out.println("O livro não pode ser nulo.");
        }
        else if (livro.getTitulo() == null || livro.getTitulo().isBlank()) {
            System.out.println("O título do livro não pode ser nulo ou vazio.");
        }
        else if (livro.getAutor() == null || livro.getAutor().isBlank()) {
            System.out.println("O autor do livro não pode ser nulo ou vazio.");
        }
        else if (livro.getDataPublicacao() == null) {
            System.out.println("A data de publicação do livro não pode ser nula.");
        } else {
        livros.add(livro);
    }
}
    public void removerLivroPorTitulo(String titulo) {
        for (int i = 0; i < livros.size(); i++) {
            if (livros.get(i).getTitulo().equalsIgnoreCase(titulo)) {
                livros.remove(i);
                break;
            }
        }
    }

    public Livro buscarLivroPorTitulo(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
        return null;
    }

    public Integer contarLivros() {
        return livros.size();
    }

    public List<Livro> obterLivrosAteAno(Integer ano) {
        List<Livro> livrosAteAno = new ArrayList<>();
        for (Livro livro : livros) {
            if (livro.getDataPublicacao().getYear() <= ano) {
                livrosAteAno.add(livro);
            }
        }
        return livrosAteAno;
    }


}
