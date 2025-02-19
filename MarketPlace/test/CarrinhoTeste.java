import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.jupiter.api.Test;

class CarrinhoTeste {
	
	@After
	void limparCarrinho() {
		CarrinhoDeCompras.limparCarrinho();
	};
	
	@Test
	void adicionarProdutos() {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		Produto produto1 = new Produto("Prancha de Surf", "PF", 250.0);
		Produto produto2 = new ProdutoComTamanho("Corda", "CRD", 15.0, 30.0);
		Produto produto3 = new ProdutoComTamanho("Corda", "CRD", 25.0, 55.0);
		
		carrinho.adicionaProduto(produto1, 2);
		carrinho.adicionaProduto(produto2, 1);
		carrinho.adicionaProduto(produto3, 1);
		
		assertEquals(3,CarrinhoDeCompras.carrinho.size());
	};
	
	@Test
	void valorTotalCarrinho() {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		Produto produto1 = new Produto("Prancha de Surf", "PF", 250.0);
		Produto produto2 = new ProdutoComTamanho("Corda", "CRD", 15.0, 30.0);
		Produto produto3 = new ProdutoComTamanho("Corda", "CRD", 25.0, 55.0);
		
		carrinho.adicionaProduto(produto1, 2);
		carrinho.adicionaProduto(produto2, 1);
		carrinho.adicionaProduto(produto3, 1);
		
		assertEquals(540.0,CarrinhoDeCompras.calcularValorTotal());
		assertEquals(3,CarrinhoDeCompras.carrinho.size());
		
		carrinho.removeProduto(produto3, 1);
		assertEquals(515.0,CarrinhoDeCompras.calcularValorTotal());
	};

}
