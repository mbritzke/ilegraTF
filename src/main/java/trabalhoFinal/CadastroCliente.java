package trabalhoFinal;

import java.util.List;
import java.util.ArrayList;

public class CadastroCliente {

	private List<Cliente> clientes = new ArrayList<Cliente>();
	
	public boolean cadastro(Cliente novoCLiente){
		if(!clientes.contains(novoCLiente)){
			clientes.add(novoCLiente);
			return true;
		}
		return false;
	}
	
	public Cliente retornaCliente(CPF cpf){
		for (Cliente cliente : clientes) {
			if(cliente.getCpfCliente().equals(cpf))
				return cliente;
		}
		return null;
	}
	
	public static void main(String[] args) {
		CPF num = new CPF("01271219281");
		Cliente c = new Cliente("Matheus", 10, num);
		CadastroCliente novoCadastro = new CadastroCliente();
		novoCadastro.cadastro(c);
		System.out.println(c.toString());		
	}
}

