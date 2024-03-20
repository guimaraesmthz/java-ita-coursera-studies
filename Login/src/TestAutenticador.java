import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestAutenticador {

	@Test
	void loginComSucesso() throws LoginException {
		Autenticador  a = new Autenticador();
		Usuario u = a.logar("matheus", "senhadomth");
		assertEquals("matheus", u.getLogin());
	}
	
	@Test
	void loginFalho() throws LoginException {
		Autenticador  a = new Autenticador();
		Usuario u = a.logar("matheus", "senhadomth");
		assertEquals("matheus", u.getLogin());
	};

}
