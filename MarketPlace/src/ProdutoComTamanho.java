import java.util.Objects;

public class ProdutoComTamanho extends Produto{

	private double tamanho;
	
	ProdutoComTamanho(String nome, String codigo, double preco, double tamanho){
		super(nome, codigo, preco);
		this.tamanho = tamanho;
	};
	
	@Override
	public boolean equals(Object obj) {
		ProdutoComTamanho other = (ProdutoComTamanho) obj;
		return (super.equals(obj) && Objects.equals(tamanho,other.tamanho));
	}
	
	@Override
	public int hashCode() {
		return (super.hashCode()+Objects.hash(tamanho));
	}
	
}
