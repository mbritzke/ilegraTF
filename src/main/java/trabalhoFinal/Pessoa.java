package trabalhoFinal;

public class Pessoa {

	private String nome;
	private int idade;

	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public int idade() {
		return idade;
	}

	public void setNome(String novoNome) {
		nome = novoNome;
	}

	public void setIdade(int novaIdade) {
		idade = novaIdade;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + "\nIdade: " + idade;
	}

}
