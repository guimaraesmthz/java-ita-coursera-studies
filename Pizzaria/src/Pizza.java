import java.util.HashMap;

public class Pizza {
	
	public static int qntdIngredientes = 0;
	public int qntdIngPizza = 0;
 	public static HashMap<String, Integer> ingredientes = new HashMap<String, Integer>();
	
	public void adicionarIngrediente(String ingrediente, int quantidade) {
		if(!ingredientes.containsKey(ingrediente)) {
			contabilizaIngrediente();
			ingredientes.put(ingrediente, quantidade);
		}else {
			int ultimaQntd = ingredientes.get(ingrediente);
			int qntd = ultimaQntd + quantidade;
			ingredientes.replace(ingrediente, qntd);
		};
		this.qntdIngPizza += 1;
	};

	public int getPreco() {
		if(qntdIngPizza <= 2) {
			return 15;
		}else if( qntdIngPizza <= 5) {
			return 20;
		}else{
			return 23;
		}
	};
	
	public static void contabilizaIngrediente() {
		qntdIngredientes += 1;
	};
	
	public static void zerarIngredientes() {
		ingredientes.clear();
		qntdIngredientes = 0;
	};
	
	public void zerarPizza() {
		this.qntdIngPizza = 0;
	};
}
