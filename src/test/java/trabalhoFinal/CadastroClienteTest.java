package trabalhoFinal;

import org.junit.Assert;
import org.junit.Test;

public class CadastroClienteTest {

	@Test
	public void testCadastro() {
		CPF cpf1 = new CPF("19278172817");
		Cliente cliente1 = new Cliente("Nome", 100, cpf1);
		CadastroCliente novoCadastro = new CadastroCliente();
		Assert.assertTrue(novoCadastro.cadastro(cliente1));
	}

	@Test
	public void testCadastroRepetido() {
		CPF cpf1 = new CPF("19278172817");
		Cliente cliente1 = new Cliente("Nome", 100, cpf1);
		CPF cpf2 = new CPF("19278172817");
		Cliente cliente2 = new Cliente("Nome", 100, cpf2);
		CadastroCliente cadastroTeste = new CadastroCliente();
		cadastroTeste.cadastro(cliente1);
		Assert.assertFalse(cadastroTeste.cadastro(cliente2));
	}
}
