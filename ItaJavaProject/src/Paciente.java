
public class Paciente {

	private double weight;
	private double height;
	
	public Paciente(double weight, double height) {
		this.height = height;
		this.weight = weight;
	};
	
	public double calcularIMC() {
		double imc = weight/(height*height);
		return imc;
	};
	
	public void diagnostico() {
		double imc = calcularIMC();
		if(imc < 16) {
			System.out.println("IMC: "+imc+". Baixo peso muito grave!");
		}else if(imc < 16.99) {
			System.out.println("IMC: "+imc+". Baixo peso grave!");
		}else if(imc < 18.49) {
			System.out.println("IMC: "+imc+". Baixo peso!");
		}else if(imc < 24.99) {
			System.out.println("IMC: "+imc+". Peso normal!");
		}else if(imc < 29.99) {
			System.out.println("IMC: "+imc+". Sobrepeso!");
		}else if(imc < 34.99) {
			System.out.println("IMC: "+imc+". Obesidade grau I!");
		}else if(imc < 39.99) {
			System.out.println("IMC: "+imc+". Obesidade grau II!");
		}else if(imc >= 40) {
			System.out.println("IMC: "+imc+". Obesidade grau III!");
		}
	};
}
