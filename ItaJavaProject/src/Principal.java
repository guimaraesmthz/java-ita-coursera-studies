
public class Principal {

	public static void main(String[] args) {
		
		Paciente p1 = new Paciente(55.00, 1.78);
		Paciente p2 = new Paciente(77.35,1.65);
		Paciente p3 = new Paciente(110.30,1.90);
		p1.diagnostico();
		p2.diagnostico();
		p3.diagnostico();
	}

}
