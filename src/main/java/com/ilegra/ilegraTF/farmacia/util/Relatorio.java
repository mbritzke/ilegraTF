package com.ilegra.ilegraTF.farmacia.util;

import com.ilegra.ilegraTF.farmacia.lista.OrdenaListaCliente;
import com.ilegra.ilegraTF.farmacia.pojo.Cliente;
import com.ilegra.ilegraTF.farmacia.pojo.Medicamento;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Relatorio {

    public List<Cliente> listaClienteAZ(List<Cliente> listaClientes){
        OrdenaListaCliente ordena = new OrdenaListaCliente();
        Collections.sort(listaClientes, ordena);
        return listaClientes;
    }

    public List<Medicamento> listaMedicamentoAZ(){
        List<Medicamento> medicamentoAZ = new ArrayList<>();
        //ordenar
        return medicamentoAZ;
    }

    public List<Medicamento> listaMedicamento(){
        List<Medicamento> medicamentoFito = new ArrayList<>();
        //ordenar
        return medicamentoFito;
    }

    public List<Medicamento> listaMedicamentoQuimio(){
        List<Medicamento> medicamentoQuimio = new ArrayList<>();
        //ordenar
        return medicamentoQuimio;
    }

    public void estatistica(){
        //tipos de clientes atendidos no dia
        //remédio mais vendido
        //tipo mais vendido
    }
}
