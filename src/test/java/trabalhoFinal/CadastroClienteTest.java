package trabalhoFinal;

import java.util.List;
import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import junit.framework.AssertionFailedError;

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
	
	@Test
	public void testPesquisaCliente(){
		CPF cpf1 = new CPF("19278172817");
		CadastroCliente cadastroTeste = new CadastroCliente();
		Cliente cliente1 = new Cliente("Nome", 100, cpf1);
		cadastroTeste.cadastro(cliente1);
		Assert.assertTrue(cadastroTeste.pesquisaCliente(cpf1));
		CPF cpf2 = new CPF("127912617");
		Assert.assertFalse(cadastroTeste.pesquisaCliente(cpf2));
	}
	
	@Test
	public void testRetornaLista(){
		CPF cpf1 = new CPF("19278172817");
		Cliente cliente1 = new Cliente("Nome1", 100, cpf1);
		CPF cpf2 = new CPF("826816271");
		Cliente cliente2 = new Cliente("Nome2", 45, cpf2);
		CadastroCliente cadastroTeste = new CadastroCliente();
		cadastroTeste.cadastro(cliente1);
		cadastroTeste.cadastro(cliente2);
		List<Cliente> ListaClientesAtual = new ArrayList<Cliente>();
		ListaClientesAtual.add(cliente1);
		ListaClientesAtual.add(cliente2);
		List<Cliente> retornoLista = cadastroTeste.retornaLista();
		Assert.assertEquals(retornoLista, retornoLista);
	}
	
}
