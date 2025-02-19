import java.util.HashMap;


public class CarrinhoDeCompras {
	
	private static double valorTotal;

	static HashMap<Produto, Integer> carrinho = new HashMap<Produto, Integer>();
	
	public void adicionaProduto(Produto p,int quantidade) {
		if(carrinho.containsKey(p)) {
			valorTotal = (valorTotal) - (carrinho.get(p)*(p.getPreco()));
			carrinho.replace(p,(carrinho.get(p)+quantidade));
		}else {
			carrinho.put(p, quantidade);
			double valor = (carrinho.get(p))*(p.getPreco());
			valorTotal += valor;
		}	
		
	};
	
	public void removeProduto(Produto p,int quantidade) {
		if(carrinho.containsKey(p)) {
			if((carrinho.get(p)-quantidade) <=0) {
				valorTotal = valorTotal - (carrinho.get(p)*(p.getPreco()));
				carrinho.remove(p);
			}else {
				carrinho.replace(p, (carrinho.get(p)-quantidade));
				valorTotal = valorTotal - (carrinho.get(p)*(p.getPreco()));
			}
		};
	};
	
	public static double calcularValorTotal() {
		return valorTotal;
	};
	
	public static void limparCarrinho() {
		carrinho.clear();
	};
}
