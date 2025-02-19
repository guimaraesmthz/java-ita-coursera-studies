
public class FabricaMecanicaDoJogo {
	
	private String dificuldade;
	private BancoDePalavras bancoPalavras = new BancoDePalavras();
	private FabricaEmbaralhadores fabricaEmbaralha = new FabricaEmbaralhadores();
	private String palavraCerta = bancoPalavras.palavraAleatoria();
    public String palavraEmbaralhada = fabricaEmbaralha.retornarEmbaralhador().embaralharPalavra(palavraCerta);
	
	
	FabricaMecanicaDoJogo(String dificuldade){
		if(dificuldade.equals("Fácil"))
			this.dificuldade = "Fácil";
		else
			this.dificuldade = "Difícil";
	};
	
	public MecanicaDoJogo retornaMecanica() {
		MecanicaDoJogo mecFacil = new JogoFacil(palavraCerta,palavraEmbaralhada);
		MecanicaDoJogo mecDificil = new JogoDificil(palavraCerta,palavraEmbaralhada);
		
		if(this.dificuldade.equals("Fácil"))
			return mecFacil;
		else
			return mecDificil;
	};
	
}
