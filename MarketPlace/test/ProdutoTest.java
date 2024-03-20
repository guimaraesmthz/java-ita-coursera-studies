import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProdutoTest {

	@Test
	void precoDoProduto() {
		Produto produto = new Produto("Headphone", "HDP", 25.00);
		assertEquals(produto.getPreco(), 25.00);
	}

}
