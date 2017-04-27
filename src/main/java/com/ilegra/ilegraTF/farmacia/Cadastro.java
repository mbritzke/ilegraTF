package com.ilegra.ilegraTF.farmacia;

import java.util.ArrayList;
import java.util.List;

public class Cadastro {

    private List<Cliente> listaClientes;
    private List<Medicamento> listaMedicamentos;

    public Cadastro() {
        listaClientes = new ArrayList<Cliente>();
        listaMedicamentos = new ArrayList<Medicamento>();
    }

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
        return this.listaClientes;
    }

    public boolean cadastraMedicamento(Medicamento novoMedicamento){
       boolean auxiliar = pesquisaMedicamento(novoMedicamento);
       if(auxiliar)
           return false;
       listaMedicamentos.add(novoMedicamento);
       return true;
    }

   public boolean pesquisaMedicamento(Medicamento novoMedicamento){
        for(Medicamento auxiliar: listaMedicamentos){
            if(auxiliar.getNome() == novoMedicamento.getNome())
                return true;
        }
        return false;
   }

    public List<Medicamento> retornaListaMedicamentos(){
        return listaMedicamentos;
    }

}