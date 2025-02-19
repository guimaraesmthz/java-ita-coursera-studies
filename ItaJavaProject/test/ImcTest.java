import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ImcTest {

	@Test
	void testIMC() {
		Paciente p1 = new Paciente(75.0, 1.80);
		Paciente p2 = new Paciente(90.2, 1.56);
		Paciente p3 = new Paciente(131.4, 1.94);
		Paciente p4 = new Paciente(110.0, 1.60);
		Paciente p5 = new Paciente(54.4, 1.75);
		Paciente p6 = new Paciente(78.0, 1.55);
		Paciente p7 = new Paciente(88.0, 1.76);
		Paciente p8 = new Paciente(66.0, 1.66);
	
		
		assertEquals(23.148148148148145,p1.calcularIMC(),15.0);
		assertEquals(37.06443129520052, p2.calcularIMC(),15.0);
		assertEquals(34.91338080561165, p2.calcularIMC(),15.0);
		assertEquals(42.96874999999999, p2.calcularIMC(),15.0);
		assertEquals(17.76326530612245, p2.calcularIMC(),35.0);
		assertEquals(32.46618106139438, p2.calcularIMC(),15.0);
		assertEquals(28.40909090909091, p2.calcularIMC(),15.0);
		assertEquals(23.95122659311947, p2.calcularIMC(),15.0);
	}

}
