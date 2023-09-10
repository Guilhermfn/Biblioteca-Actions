package com.biblioteca;

import org.junit.Assert;
import org.junit.Test;

public class LivroVendaTest {
    /**
     * Test do construtor com parâmetros
     */
    @Test
    public void testConstrutor() {
        Autor autor = new Autor("Nome do Autor", "Sobrenome do autor");
        Editora editora = new Editora("Nome da Editora");
        Livro livro = new Livro(autor, editora, "1234567890", "Título do Livro", 200);

        LivroEstoque livroEstoque = new LivroEstoque(livro, 10, 50.0);

        LivroVenda livroVenda = new LivroVenda(livroEstoque, 10);
        Assert.assertEquals(livroEstoque, livroVenda.livroDoEstoque);
        Assert.assertEquals(10, livroVenda.quantidade);
    }

    @Test
    public void testIncrementarQuantidadeSemParametros() {
        Autor autor = new Autor("Nome do Autor", "Sobrenome do autor");
        Editora editora = new Editora("Nome da Editora");
        Livro livro = new Livro(autor, editora, "1234567890", "Título do Livro", 200);

        LivroEstoque livroEstoque = new LivroEstoque(livro, 10, 50.0);

        LivroVenda livroVenda = new LivroVenda(livroEstoque, 10);
        livroVenda.IncrementarQuantidade();
        Assert.assertEquals(11, livroVenda.quantidade);
    }

    @Test
    public void testIncrementarQuantidadeComParametros() {
        Autor autor = new Autor("Nome do Autor", "Sobrenome do autor");
        Editora editora = new Editora("Nome da Editora");
        Livro livro = new Livro(autor, editora, "1234567890", "Título do Livro", 200);

        LivroEstoque livroEstoque = new LivroEstoque(livro, 10, 50.0);

        LivroVenda livroVenda = new LivroVenda(livroEstoque, 10);
        livroVenda.IncrementarQuantidade(5);
        Assert.assertEquals(15, livroVenda.quantidade);
    }

    @Test
    public void testDecrementarQuantidadeSemParametros() {
        Autor autor = new Autor("Nome do Autor", "Sobrenome do autor");
        Editora editora = new Editora("Nome da Editora");
        Livro livro = new Livro(autor, editora, "1234567890", "Título do Livro", 200);

        LivroEstoque livroEstoque = new LivroEstoque(livro, 10, 50.0);

        LivroVenda livroVenda = new LivroVenda(livroEstoque, 10);
        Boolean decrementou = livroVenda.DecrementarQuantidade();
        Assert.assertEquals(true, decrementou);
        Assert.assertEquals(9, livroVenda.quantidade);
    }

    @Test
    public void testDecrementarQuantidadeComParametros() {
        Autor autor = new Autor("Nome do Autor", "Sobrenome do autor");
        Editora editora = new Editora("Nome da Editora");
        Livro livro = new Livro(autor, editora, "1234567890", "Título do Livro", 200);

        LivroEstoque livroEstoque = new LivroEstoque(livro, 10, 50.0);

        LivroVenda livroVenda = new LivroVenda(livroEstoque, 10);
        Boolean decrementou = livroVenda.DecrementarQuantidade(4);
        Assert.assertEquals(true, decrementou);
        Assert.assertEquals(6, livroVenda.quantidade);
    }
}
