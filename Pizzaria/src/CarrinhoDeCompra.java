public class CarrinhoDeCompra {
	
	public static int valorTotal = 0;
	
	public void adicionarAoCarrinho(Pizza pizza) {
		if(!(pizza.qntdIngPizza <= 0)) {
			valorTotal(pizza);
		};
	};
	
	public static void valorTotal(Pizza pizza) {
		valorTotal = valorTotal + pizza.getPreco();
	};
	
	
	public static void zerarCarrinho() {
		valorTotal = 0;
	};
	
	
}
