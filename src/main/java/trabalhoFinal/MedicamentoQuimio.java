package trabalhoFinal;

public class MedicamentoQuimio extends Medicamento {

	private boolean receita;

	public MedicamentoQuimio(String nome, String fabricante, String compostoPrincipal, boolean receita) {
		super(nome, fabricante, compostoPrincipal);
		this.receita = receita;
	}

	public MedicamentoQuimio(String nome, String fabricante, String compostoPrincipal, String descricao,
			boolean receita) {
		super(nome, fabricante, compostoPrincipal, descricao);
		this.receita = receita;
	}

	public void setReceita(boolean novaReceita) {
		this.receita = novaReceita;
	}

	public boolean getReceita() {
		return receita;
	}
}
