import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws Error{
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Esolha a dificuldade do jogo, digite Fácil ou Difícil: ");
		String dificuldade = scanner.nextLine();
		
		if(dificuldade.equals("Fácil") || dificuldade.equals("Difícil")){
			boolean tentativa = true;
			while(tentativa) {
				FabricaMecanicaDoJogo fabrica = new FabricaMecanicaDoJogo(dificuldade);
				MecanicaDoJogo jogo = fabrica.retornaMecanica();
				tentativa = jogo.tentativasRestantes();
				String palavraEmbaralhada = fabrica.palavraEmbaralhada;
				System.out.println("Qual é essa palavra: "+ palavraEmbaralhada + "?");
				String resposta = scanner.nextLine();
				jogo.iniciarJogo(resposta);
				if(!tentativa)
					System.out.println("O jogo acabou! Sua pontuação é de: "+jogo.pontuacaoDoJogo()+ "pontos.");
			}
		}else{
			System.out.println("Dificuldade digitada de forma incorreta. Reinicie o jogo");
			throw new Error("Dificuldade digitada incorretamente.");
		};
		
		
		
		
		
		
		
		
		
	}

}
