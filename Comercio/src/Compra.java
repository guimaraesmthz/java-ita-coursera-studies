
public class Compra {
	
	int valorTotal;
	
	public int getValorTotal() {
		return valorTotal;
	}

	public int getNumeroParcelas() {
		return numeroParcelas;
	}

	int numeroParcelas;
	
	// a vista
	public Compra(int valor) {
		this.valorTotal = valor;
		this.numeroParcelas = 1;
	};
	
	// parcelado
	public Compra(int qtdParcelas, int valorParcela) {
		this.numeroParcelas = qtdParcelas;
		this.valorTotal = valorParcela * qtdParcelas;
	};
}
