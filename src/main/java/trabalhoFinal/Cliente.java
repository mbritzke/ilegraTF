package trabalhoFinal;

public class Cliente {

	private Pessoa cliente;
	private CPF cpfCliente;
	
	public Cliente(Pessoa novoCliente, CPF cpfNovoCliente){
		cliente = novoCliente;
		cpfCliente = cpfNovoCliente;
	}
	
	@Override
	public String toString(){
		return "Cliente ; " + cliente.toString() + "\nCPF: " + cpfCliente.toString();
	}
	
}
