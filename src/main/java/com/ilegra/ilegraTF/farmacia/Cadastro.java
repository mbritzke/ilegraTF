package com.ilegra.ilegraTF.farmacia;

import java.util.ArrayList;
import java.util.List;

public class Cadastro {
    private List<Cliente> listaClientes = new ArrayList<Cliente>();
    private List<Medicamento> listaMedicamentos = new ArrayList<Medicamento>();

    public boolean cadastroCliente(Cliente novoCliente){
        boolean auxiliar = pesquisaCliente(novoCliente.getCpfCliente());
        if(auxiliar == true)
            return false;
        listaClientes.add(novoCliente);
        return true;
    }

    public boolean pesquisaCliente(CPF cpf){
        for(Cliente auxiliar: listaClientes){
            if(auxiliar.getCpfCliente().getCPF() == cpf.getCPF())
                return true;
        }
        return false;
    }

    public List<Cliente> retornaListaClientes(){
        return listaClientes;
    }

   public boolean pesquisaMedicamento(Medicamento novoMedicamento){
        for(Medicamento auxiliar: listaMedicamentos){
            if(auxiliar.getNome().equalsIgnoreCase(novoMedicamento.getNome()))
                return true;
        }
        return false;
   }

    public List<Medicamento> retornaListaMedicamentos(){
        return listaMedicamentos;
    }

}
