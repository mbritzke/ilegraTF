package com.ilegra.ilegraTF.farmacia.util;

import com.ilegra.ilegraTF.farmacia.pojo.Cliente;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class RelatorioTest {

    List<Cliente> listaTeste;
    Relatorio relatorio;

    @Before
    public void inicializa(){
       listaTeste = new ArrayList<>();
       listaTeste.add(new Cliente("Pedro", 25, new CPF("452.753.914-04")));
       listaTeste.add(new Cliente("João", 18, new CPF("737.793.157-42")));
       listaTeste.add(new Cliente("Ana", 26, new CPF("448.175.083-96")));
       relatorio = new Relatorio();
    }

    @Test
    public void testaOrdenacao(){
        for(Cliente auxiliar: listaTeste)
            System.out.println(auxiliar.toString());
        relatorio.listaClienteAZ(listaTeste);
        System.out.println("-----------------\n LISTA ORDENADA:\n");
        for(Cliente auxiliar: listaTeste)
            System.out.println(auxiliar.toString());
    }
}