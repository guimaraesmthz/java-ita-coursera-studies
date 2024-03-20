import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestEmbaralhadorDificil {

	@Test
	void testEmbaralhadorDificil() {
		EmbaralhadorDificil embaralhador = new EmbaralhadorDificil();
		assertNotEquals(embaralhador.embaralharPalavra("matheus"), "matheus");
	}

}
