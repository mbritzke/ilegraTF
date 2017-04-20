package trabalhoFinal;

public class Medicamento {

	private String nome;
	private String fabricante;
	private String compostoPrincipal;
	private String descricao;

	public Medicamento(String nome, String fabricante, String compostoPrincipal) {
		this.nome = nome;
		this.fabricante = fabricante;
		this.compostoPrincipal = compostoPrincipal;
	}

	public Medicamento(String nome, String fabricante, String compostoPrincipal, String descricao) {
		this(nome, fabricante, compostoPrincipal);
		this.descricao = descricao;
	}

	public String getNome() {
		return nome;
	}

	public String getFabricante() {
		return fabricante;
	}

	public String getCompostoPrincipal() {
		return compostoPrincipal;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public void setCompostoPrincipal(String compostoPrincipal) {
		this.compostoPrincipal = compostoPrincipal;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "NOME: " + nome + "\nFABRICANTE: " + "\nCOMPOSTO PRINCIPAL: " + compostoPrincipal + "\nDESCRICAO: "
				+ descricao;
	}

}
