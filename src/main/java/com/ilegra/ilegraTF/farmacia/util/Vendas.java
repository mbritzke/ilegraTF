package com.ilegra.ilegraTF.farmacia.util;

import com.ilegra.ilegraTF.farmacia.Cliente;
import com.ilegra.ilegraTF.farmacia.Medicamento;

import java.util.List;

public class Vendas {

    public double venda(Cliente cliente, List<Medicamento> listaCompras) {
        if (checaCadastro(cliente.getCpfCliente()) != false) {
            return calculaCompra(cliente.getIdade(), listaCompras);
        }
        return -1;
    }

    private boolean checaCadastro(CPF cpf) {
        Cadastro novoCadastro = new Cadastro();
        if (novoCadastro.pesquisaCliente(cpf))
            return true;
        return false;
    }

    private double calculaCompra(int idadeCliente, List<Medicamento> listaCompras) {
        double resultado = 0;
        for (Medicamento iterador : listaCompras) {
            resultado += iterador.getPreco();
        }
        if (idadeCliente > 60)
            return descontoIdoso(resultado);
        return descontoNormal(resultado);
    }

    private double descontoIdoso(double preco) {
        return preco * 0.20;
    }

    private double descontoNormal(double preco) {
        return preco * 0.10;
    }

    private int calculaPontos(Cliente cliente, double custoCompra) {
        int novosPontos = geraPontos(custoCompra);
        cliente.setPontos((cliente.getPontos() + novosPontos));
        return cliente.getPontos();
    }

    private int geraPontos(double custoCompra) {
        int novosPontosCliente = 0;
        while (custoCompra >= 9) {
            custoCompra = custoCompra - 10;
            novosPontosCliente += 5;
        }
        return novosPontosCliente;
    }
}
