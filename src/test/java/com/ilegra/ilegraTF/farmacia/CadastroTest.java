package com.ilegra.ilegraTF.farmacia;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CadastroTest {

    Cadastro novoCadastro = new Cadastro();

    @Test
    public void cadastroCliente() {
        Cliente novoCliente = new Cliente("João", 18, new CPF("195.864.874-40"));
        Assert.assertTrue(novoCadastro.cadastroCliente(novoCliente));
    }

    @Test
    public void cadastroClienteRepetido() {
        Cliente novoCliente = new Cliente("Laura", 76, new CPF("445.161.923-81"));
        boolean cadastroValido = novoCadastro.cadastroCliente(novoCliente);
        Assert.assertFalse(novoCadastro.cadastroCliente(novoCliente));
    }

    @Test
    public void buscaCliente(){
        Cliente clienteAlvo = new Cliente("Maria", 45, new CPF("753.758.644-60"));
        novoCadastro.cadastroCliente(clienteAlvo);
        Assert.assertTrue(novoCadastro.pesquisaCliente(new CPF("753.758.644-60")));
    }

    @Test
    public void naoEncontrarCliente(){
        Assert.assertFalse(novoCadastro.pesquisaCliente(new CPF("493.203.845-33")));
    }
}