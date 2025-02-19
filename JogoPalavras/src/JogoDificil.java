
public class JogoDificil implements MecanicaDoJogo {
	
	private static int tentativas = 2;
	private static double pontos = 0;
	private final double multiplicador = 8;
	private String palavraCerta;
    private String palavraEmbaralhada; 
	

	JogoDificil(String palavraCerta, String palavraEmbaralhada){
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
		return JogoDificil.pontos;
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
