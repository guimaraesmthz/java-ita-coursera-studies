
public class Autoridade{
	
	private String tipo;
	private String sexo;
	public FormatadorNome format = new FormatadorNome() {
		
		@Override
		public String formatarNome(String nome, String sobrenome) {
			if(tipo == "Informal") {
				return nome;
			}else if(tipo == "Respeitoso") {
				if(sexo == "Masculino")
					return "Sr. "+sobrenome;
				else
					return "Sra. "+sobrenome;
			}else{
				return "Magnífico "+nome+" "+sobrenome;
			}
		}
	};
	
	Autoridade(String tipo, String sexo){
		this.tipo = tipo;
		this.sexo = sexo;
	};
	
	public String getTratamento(String nome,String sobrenome) {
		return format.formatarNome(nome, sobrenome);
	}
	
	
}
