import java.util.Random;

public class EmbaralhadorDificil implements Embaralhador{
	
	@Override
	public String embaralharPalavra(String palavra) {
		char[] novaPalavra = palavra.toCharArray();
		int tamanho = novaPalavra.length;
		Random ran = new Random();
		for(int i = 0; i < tamanho-1;i++) {
			int random = ran.nextInt(0,tamanho);
			char aux = novaPalavra[i];
			novaPalavra[i] = novaPalavra[random];
			novaPalavra[random] = aux;
		};
		String palavraFinal = new String(novaPalavra);
		return palavraFinal;
	};
	
}
