package com.biblioteca;

import java.util.ArrayList;

public class Biblioteca {

    private final ArrayList<Livro> livros;
    private final ArrayList<Autor> autores;
    private final ArrayList<Editora> editoras;
    private final ArrayList<LivroEstoque> estoque;

    public Biblioteca() {
        livros = new ArrayList<Livro>();
        autores = new ArrayList<Autor>();
        editoras = new ArrayList<Editora>();
        estoque = new ArrayList<LivroEstoque>();
    }

    public int AdicionarLivro(Livro livro) {
        this.livros.add(livro);

        return this.livros.size();
    }

    public int RemoverLivro(Livro livro) {
        this.livros.remove(livro);

        return this.livros.size();
    }

    public int AdicionarAutor(Autor autor) {
        this.autores.add(autor);

        return this.autores.size();
    }

    public int RemoverAutor(Autor autor) {
        this.autores.remove(autor);

        return this.autores.size();
    }

    public int AdicionarEditora(Editora editora) {
        this.editoras.add(editora);

        return this.editoras.size();

    }

    public int RemoverEditora(Editora editora) {
        this.editoras.remove(editora);

        return this.editoras.size();
    }

    public int AdicionarEstoque(LivroEstoque livroEstoque) {
        this.estoque.add(livroEstoque);

        return this.estoque.size();
    }

    public int RemoverEstoque(LivroEstoque livroEstoque) {
        this.estoque.remove(livroEstoque);

        return this.estoque.size();
    }
}