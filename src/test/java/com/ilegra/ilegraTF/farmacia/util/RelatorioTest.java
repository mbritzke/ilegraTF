package com.ilegra.ilegraTF.farmacia.util;

import com.ilegra.ilegraTF.farmacia.pojo.Cliente;
import com.ilegra.ilegraTF.farmacia.pojo.Medicamento;
import com.ilegra.ilegraTF.farmacia.pojo.MedicamentoQuimio;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class RelatorioTest {

    List<Cliente> listaCliente;
    List<Medicamento> listaMedicamento;
    Relatorio relatorio;

    @Before
    public void inicializaListas(){
        listaCliente = new ArrayList<>();
        listaCliente.add(new Cliente("Pedro", 25, new CPF("452.753.914-04")));
        listaCliente.add(new Cliente("João", 18, new CPF("737.793.157-42")));
        listaCliente.add(new Cliente("Ana", 26, new CPF("448.175.083-96")));
        relatorio = new Relatorio();

        listaMedicamento = new ArrayList<>();
        listaMedicamento.add(new Medicamento("chá erva doce", "bayer", "ervas", 2.50));
        listaMedicamento.add(new Medicamento("dorflex", "generios", "mel", 5.0));
        listaMedicamento.add(new MedicamentoQuimio("chá preto", "bayer", "ervas", true, 1.80));
    }

    @Test
    public void ordenarClientePorNome(){
        for(Cliente auxiliar: listaCliente)
            System.out.println(auxiliar.toString());
        relatorio.listaClienteAZ(listaCliente);
        System.out.println("-----------------\n LISTA ORDENADA:\n");
        for(Cliente auxiliar: listaCliente)
            System.out.println(auxiliar.toString());
    }

    @Test
    public void ordenarMedicamentoPorNome(){
        for(Medicamento medicamento: listaMedicamento)
            System.out.println(medicamento.toString() + " \n ---------------- \n");
        relatorio.listaMedicamentoAZ(listaMedicamento);
        for(Medicamento medicamento: listaMedicamento)
            System.out.println(medicamento.toString() + " \n ---------------- \n");
    }
}