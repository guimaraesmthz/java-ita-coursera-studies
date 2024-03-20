import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContaCorrenteTest {

	@Test
	void deposito() {
		ContaCorrente cc = new ContaCorrente();
		cc.depositar(200);
		assertEquals(cc.saldo,200);
	};
	
	@Test
	void sacar() {
		ContaCorrente cc = new ContaCorrente();
		cc.depositar(200);
		int valorSacado = cc.sacar(50);
		assertEquals(cc.saldo, 150);
		assertEquals(valorSacado,50);
	};
	
	@Test
	void saqueMaiorSaldo() {
		ContaCorrente cc = new ContaCorrente();
		cc.depositar(200);
		int valorSacado = cc.sacar(250);
		assertEquals(cc.saldo, 200);
		assertEquals(valorSacado,0);
	};

}
