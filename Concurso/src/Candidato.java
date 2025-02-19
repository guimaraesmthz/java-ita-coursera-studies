
public class Candidato implements Comparable<Candidato> {

	private int nota;
	private boolean deficiente;
	private int idade;
	
	
	
	public Candidato(int nota, boolean deficiente, int idade) {
		super();
		this.nota = nota;
		this.deficiente = deficiente;
		this.idade = idade;
	};
	
	


	public int getNota() {
		return nota;
	}




	public void setNota(int nota) {
		this.nota = nota;
	}




	public boolean isDeficiente() {
		return deficiente;
	}




	public void setDeficiente(boolean deficiente) {
		this.deficiente = deficiente;
	}




	public int getIdade() {
		return idade;
	}




	public void setIdade(int idade) {
		this.idade = idade;
	}




	@Override
	public int compareTo(Candidato outro) {
		if(nota == outro.getNota()) {
			if(deficiente == outro.deficiente) {
				return idade - outro.idade;
			}else {
				if(deficiente)
					return 1;
				else
					return -1;
			}
		}else {
			return nota - outro.getNota();
		}
	};

}
