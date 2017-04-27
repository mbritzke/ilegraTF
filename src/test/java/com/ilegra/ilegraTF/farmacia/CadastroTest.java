package com.ilegra.ilegraTF.farmacia;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

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
        Assert.assertTrue(novoCadastro.cadastroCliente(novoCliente));
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

    @Test
    public void listaClientes(){
        List<Cliente> listaClienteEsperada = new ArrayList<Cliente>();
        List<Cliente> listaClienteAtual = novoCadastro.retornaListaClientes();
        Assert.assertSame(listaClienteEsperada, listaClienteEsperada);
    }

    @Test
    public void cadastraMedicamento(){
        Medicamento novoMedicamento = new Medicamento("Bepantol", "Derma Creme", "Dexpantenol");
        Assert.assertTrue(novoCadastro.cadastraMedicamento(novoMedicamento));
    }

    @Test
    public void cadastaMedicamentoRepetido(){
        Medicamento novoMedicamento = new Medicamento("Nebacetin", "Generico", "Sulfato De Neomicina");
        Assert.assertTrue(novoCadastro.cadastraMedicamento(novoMedicamento));
        Assert.assertFalse(novoCadastro.cadastraMedicamento(novoMedicamento));
    }

    @Test
    public void pesquisaMedicamento(){
        Medicamento medicamentoAlvo = new Medicamento("Aspirina", "Bayer", "Acido acetilsalicilico");
        novoCadastro.cadastraMedicamento(medicamentoAlvo);
        Assert.assertTrue(novoCadastro.pesquisaMedicamento(medicamentoAlvo));
    }

    @Test
    public void naoEncontarMedicamento(){
        Assert.assertFalse(novoCadastro.pesquisaMedicamento(new Medicamento("Bala Valda", "generico", "menta")));
    }

}