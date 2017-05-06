package com.ilegra.ilegraTF.farmacia.util;

import com.ilegra.ilegraTF.farmacia.pojo.Cliente;
import com.ilegra.ilegraTF.farmacia.pojo.Medicamento;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class VendaTest {

    Cadastro novoCadastro;
    Venda vendaTeste;

    @Before
    public void inicializa(){
        novoCadastro = new Cadastro();
        vendaTeste = new Venda();
    }

    @Test
    public void calculaVenda(){
        Cliente clienteTeste = new Cliente("João", 18, new CPF("195.864.874-40"));
        Medicamento medicamentoTeste = new Medicamento("Bepantol", "Derma Creme", "Dexpantenol", 20.0);
        novoCadastro.cadastroCliente(clienteTeste);
        novoCadastro.cadastraMedicamento(medicamentoTeste);
        vendaTeste = new Venda();
        double valor = vendaTeste.calculaVenda(novoCadastro, clienteTeste, novoCadastro.retornaListaMedicamentos());
        Assert.assertEquals(20, (long)valor);
    }
}