package com.ilegra.ilegraTF.farmacia.util;

import com.ilegra.ilegraTF.farmacia.pojo.Cliente;
import com.ilegra.ilegraTF.farmacia.pojo.Medicamento;

import java.util.ArrayList;
import java.util.List;

public class Venda {

    private List<Medicamento> listaCompras;

    public Venda(){
        listaCompras = new ArrayList<>();
    }

    public ArrayList<Medicamento> retornaListaCompras(){
        return listaCompras;
    }

    public boolean listaCompras(Medicamento produto){
        List<Medicamento> listaCompras = new ArrayList<>();
        listaCompras.add(produto);
        return true;
    }

    public double calculaVenda(){
        double valorCompra = 0;
        for(Medicamento auxiliar: listaCompras){
            valorCompra += auxiliar.getPreco();
        }
        return valorCompra;
    }
}
