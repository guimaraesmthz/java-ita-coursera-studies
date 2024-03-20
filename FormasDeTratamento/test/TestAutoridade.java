import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestAutoridade {

	@Test
	void testAutoridadeInformal() {
		Autoridade autoridade = new Autoridade("Informal", "Masculino");
		String tratamento = autoridade.getTratamento("Matheus", "Guimarães");
		assertEquals(tratamento,"Matheus");
	};
	
	@Test
	void testAutoridadeRespeitoso() {
		Autoridade autoridade = new Autoridade("Respeitoso", "Masculino");
		String tratamento = autoridade.getTratamento("Matheus", "Guimarães");
		assertEquals(tratamento,"Sr. Guimarães");
	};
	
	@Test
	void testAutoridadeInformalComTitulo() {
		Autoridade autoridade = new Autoridade("ComTítulo", "Masculino");
		String tratamento = autoridade.getTratamento("Matheus", "Guimarães");
		assertEquals(tratamento,"Magnífico Matheus Guimarães");
	};

}
