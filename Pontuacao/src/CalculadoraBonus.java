
public class CalculadoraBonus {
	
	public int bonusDoDia;
	
	public int bonus(Usuario u) {
		int multiplicador = 1;
		if(u.vip)
			multiplicador = 5;
		return multiplicador;
	};

}
