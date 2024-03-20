import java.util.Map;


public class Principal {

	public static void main(String[] args) {
		
		CarrinhoDeCompra carrinho = new CarrinhoDeCompra();
		
		Pizza p1 = new Pizza();
		Pizza p2 = new Pizza();
		Pizza p3 = new Pizza();
		
		p1.adicionarIngrediente("orégano", 1);
		p1.adicionarIngrediente("queijo", 1);
		p2.adicionarIngrediente("orégano", 1);
		p2.adicionarIngrediente("queijo", 1);
		p3.adicionarIngrediente("orégano", 1);
		p3.adicionarIngrediente("mel", 1);
		p3.adicionarIngrediente("parmesão", 1);
		
		carrinho.adicionarAoCarrinho(p1);
		carrinho.adicionarAoCarrinho(p2);
		carrinho.adicionarAoCarrinho(p3);
		
		System.out.println("Valor total do carrinho de compras: " + CarrinhoDeCompra.valorTotal);
		
		for(Map.Entry<String, Integer> pizza : Pizza.ingredientes.entrySet()) {
			System.out.println(pizza.getKey()+ ": " + pizza.getValue());
		};
		
		
	}

}
