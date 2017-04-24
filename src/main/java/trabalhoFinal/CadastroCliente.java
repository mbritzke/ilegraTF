package trabalhoFinal;

import java.util.List;
import java.util.ArrayList;

public class CadastroCliente {

	private List<Cliente> listaClientes = new ArrayList<Cliente>();
	
	public boolean cadastro(Cliente novoCliente){
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
	
	public List<Cliente> retornaLista(){
		return listaClientes;
	}
}
