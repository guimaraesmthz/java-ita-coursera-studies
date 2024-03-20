import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProdutoTamanhoTeste {

	@Test
	void precoProdutoTamanho() {
		Produto produtoComTamanho = new ProdutoComTamanho("Prancha de Surf", "PF", 250.0, 2.0);
		assertEquals(produtoComTamanho.getPreco(),250.0);
	}

}
