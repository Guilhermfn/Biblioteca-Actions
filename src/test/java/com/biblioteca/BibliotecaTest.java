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
}
