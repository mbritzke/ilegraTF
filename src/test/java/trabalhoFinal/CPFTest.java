package trabalhoFinal;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CPFTest {

	@Test
	public void testGetCPF() {
		CPF cpfTeste = new CPF("97853901");
		assertEquals("97853901", cpfTeste.getCPF());
	}

}
