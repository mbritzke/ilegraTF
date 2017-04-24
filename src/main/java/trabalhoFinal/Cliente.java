package trabalhoFinal;

public class Cliente {

	private String nome;
	private int idade;
	private CPF cpfCliente;

	public Cliente(String nome, int idade, CPF cpfCliente) {
		this.nome = nome;
		this.idade = idade;
		this.cpfCliente = cpfCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public CPF getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(CPF cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

	@Override
	public String toString() {
		return "CLIENTE NOME = " + nome + "\nIDADE = " + idade + "\n" + cpfCliente.toString();
	}	

}
