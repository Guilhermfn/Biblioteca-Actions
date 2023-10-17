package com.biblioteca;

import org.junit.Assert;
import org.junit.Test;
public class BibliotecaTest {
    /**
     * Test do construtor sem parâmetros
     */
    @Test
    public void testConstrutorSemParametros() {
        Biblioteca biblioteca = new Biblioteca();
        Assert.assertNotNull(biblioteca);
    }

    @Test
    public void testAdicionarLivro() {
        Biblioteca biblioteca = new Biblioteca();

        Livro livro = new Livro();

        int tam = biblioteca.AdicionarLivro(livro);

        Assert.assertEquals(1, tam);
    }

    @Test //
    public void testRemoverLivro() {
        Biblioteca biblioteca = new Biblioteca();

        Livro livro = new Livro(new Autor(), new Editora("teste"), "a", "b", 0);
        Livro livro2 = new Livro();

        biblioteca.AdicionarLivro(livro);
        biblioteca.AdicionarLivro(livro2);

        int tam = biblioteca.RemoverLivro(livro2);

        Assert.assertEquals(1, tam);
    }

    @Test
    public void testAdicionarAutor() {
        Biblioteca biblioteca = new Biblioteca();

        Autor autor = new Autor();

        int tam = biblioteca.AdicionarAutor(autor);

        Assert.assertEquals(1, tam);
    }

    @Test //
    public void testRemoverAutor() {
        Biblioteca biblioteca = new Biblioteca();

        Autor autor1 = new Autor("a", "b");
        Autor autor2 = new Autor();

        biblioteca.AdicionarAutor(autor1);
        biblioteca.AdicionarAutor(autor2);

        int tam = biblioteca.RemoverAutor(autor2);

        Assert.assertEquals(1, tam);
    }

    @Test
    public void testAdicionarEditora() {
        Biblioteca biblioteca = new Biblioteca();

        Editora editora = new Editora();

        int tam = biblioteca.AdicionarEditora(editora);

        Assert.assertEquals(1, tam);
    }

    @Test //
    public void testRemoverEditora() {
        Biblioteca biblioteca = new Biblioteca();

        Editora editora1 = new Editora("a");
        Editora editora2 = new Editora();

        biblioteca.AdicionarEditora(editora1);
        biblioteca.AdicionarEditora(editora2);

        int tam = biblioteca.RemoverEditora(editora2);

        Assert.assertEquals(1, tam);
    }

    @Test
    public void testAdicionarEstoque() {
        Biblioteca biblioteca = new Biblioteca();

        LivroEstoque livroEstoque = new LivroEstoque();

        int tam = biblioteca.AdicionarEstoque(livroEstoque);

        Assert.assertEquals(1, tam);
    }

    @Test //
    public void testRemoverEstoque() {
        Biblioteca biblioteca = new Biblioteca();

        LivroEstoque livroEstoque1 = new LivroEstoque(new Livro(), 0, 0);
        LivroEstoque livroEstoque2 = new LivroEstoque();

        biblioteca.AdicionarEstoque(livroEstoque1);
        biblioteca.AdicionarEstoque(livroEstoque2);

        int tam = biblioteca.RemoverEstoque(livroEstoque2);

        Assert.assertEquals(1, tam);
    }
}
