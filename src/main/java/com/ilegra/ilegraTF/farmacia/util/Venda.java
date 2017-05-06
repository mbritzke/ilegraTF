package com.ilegra.ilegraTF.farmacia.util;

import com.ilegra.ilegraTF.farmacia.pojo.Cliente;
import com.ilegra.ilegraTF.farmacia.pojo.Medicamento;

import java.util.List;

public class Venda {

    public double calculaVenda(Cadastro cadastroCliente, Cliente comprador, List<Medicamento> listaCompras){
        boolean statusCliente = cadastroCliente.pesquisaCliente(comprador.getCpfCliente());
        if(statusCliente == false)
            return -1;
        double valorCompra = 0;
        for(Medicamento auxiliar: listaCompras){
            valorCompra += auxiliar.getPreco();
        }
        return valorCompra;
    }
}
