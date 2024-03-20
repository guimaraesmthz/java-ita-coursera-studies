import java.util.Random;

public class FabricaEmbaralhadores {

	public Embaralhador retornarEmbaralhador() {
		Embaralhador embaralhadorFacil = new EmbaralhadorFacil();
		Embaralhador embaralhadorDificil = new EmbaralhadorDificil();
		Embaralhador[] embaralhadores = {embaralhadorFacil,embaralhadorDificil};
		Random random = new Random();
		int rn = random.nextInt(0, 2);
		return embaralhadores[rn];
	};
	
}
