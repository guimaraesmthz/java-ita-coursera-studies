
public class JogoFacil implements MecanicaDoJogo{
	
	private static int tentativas = 5;
	private static double pontos = 0;
	private final double multiplicador = 2;
	private String palavraCerta;
    private String palavraEmbaralhada; 
	
	JogoFacil(String palavraCerta, String palavraEmbaralhada){
		this.palavraCerta = palavraCerta;
		this.palavraEmbaralhada = palavraEmbaralhada;
	};
	
	@Override
	public boolean tentativasRestantes() {
		if(tentativas > 0)
			return true;
		else
			return false;
	};
	
	@Override
	public double pontuacaoDoJogo() {
		return JogoFacil.pontos;
	};
	
	@Override
	public boolean iniciarJogo(String tentativa) {
		if(tentativa.equals(palavraCerta)) {
			pontos = (pontos + 1) * (multiplicador);
			tentativas = tentativas -1;
			return true;
		}else{
			tentativas = tentativas -1;
			return false;
		}
		
	};	
};
