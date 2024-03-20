import java.util.ArrayList;
import java.util.Random;

public class BancoDePalavras {

	private static ArrayList<String> palavras = new ArrayList<String>();

	private static void adicionarPalavras() {
		palavras.add("cavalo");
		palavras.add("cachorro");
		palavras.add("javascript");
		palavras.add("python");
		palavras.add("carro");
		palavras.add("computador");
		palavras.add("basquete");
		palavras.add("veleiro");
		palavras.add("inglaterra");
		palavras.add("irlanda");
		palavras.add("vikings");
		palavras.add("gato");
		palavras.add("espanhol");
		palavras.add("mosquito");
		palavras.add("mosca");
		palavras.add("ovelha");
		palavras.add("boi");
		palavras.add("avião");
		palavras.add("miami");
		palavras.add("tsunami");
	};
	
	public String palavraAleatoria() {
		adicionarPalavras();
		Random ran = new Random();
		int index = ran.nextInt(0, 19);
		return palavras.get(index);
	};

}