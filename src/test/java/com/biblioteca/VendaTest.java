package com.biblioteca;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class VendaTest {
    @Test
    public void testConstrutorComParametros() {
        Autor autor = new Autor("Nome do Autor", "Sobrenome do Autor");
        Editora editora = new Editora("Nome da Editora");
        Livro livro = new Livro(autor, editora, "1234567890", "Título do Livro", 200);
        LivroEstoque livroEstoque = new LivroEstoque(livro, 10, 50.0);

        LivroVenda livroVenda = new LivroVenda(livroEstoque, 10);

        List<LivroVenda> livros = new ArrayList<>();
        livros.add(livroVenda);

        Venda venda = new Venda("Jorge Maia", "Debito", 20, livros);
        Assert.assertEquals("Jorge Maia", venda.nomeCliente);
        Assert.assertEquals("Debito", venda.formaPagamento);
        Assert.assertEquals(20, venda.valorDado, 0.0001);
        Assert.assertEquals(livros, venda.livros);
    }

    @Test
    public void testConstrutorPadrao() {
        Autor autor = new Autor("Nome do Autor", "Sobrenome do Autor");
        Editora editora = new Editora("Nome da Editora");
        Livro livro = new Livro(autor, editora, "1234567890", "Título do Livro", 200);
        LivroEstoque livroEstoque = new LivroEstoque(livro, 10, 50.0);

        LivroVenda livroVenda = new LivroVenda(livroEstoque, 10);

        List<LivroVenda> livros = new ArrayList<>();
        livros.add(livroVenda);

        Venda venda = new Venda();
        Assert.assertNull(venda.nomeCliente);
        Assert.assertNull(venda.formaPagamento);
        Assert.assertEquals(0.0, venda.valorDado, 0.0001);
        Assert.assertNull(venda.livros);

    }
}
