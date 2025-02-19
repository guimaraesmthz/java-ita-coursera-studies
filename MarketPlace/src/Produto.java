import java.util.Objects;

public class Produto {

	private String nome;
	private String codigo;
	private double preco;
	
	Produto(String nome, String codigo, double preco) {
		this.nome = nome;
		this.codigo = codigo;
		this.preco = preco;
	};

	
	public double getPreco() {
		return preco;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return (Objects.equals(codigo, other.codigo));
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	};
	
}
