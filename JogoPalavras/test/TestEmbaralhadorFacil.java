import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestEmbaralhadorFacil {

	@Test
	void testEmbaralhadorFacil() {
		EmbaralhadorFacil embaralhador = new EmbaralhadorFacil();
		assertNotEquals(embaralhador.embaralharPalavra("veleiro"), "veleiro");
	}

}
