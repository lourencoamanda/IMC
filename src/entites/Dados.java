package entites;

public class Dados {

	public double altura; 
	public int peso;
	public double indiceMC;
	
	public Dados() {
		super();
	}

	public Dados(double altura, int peso) {
		super();
		this.altura = altura;
		this.peso = peso;
	}

	public double calculaImc(double altura, int peso) {	
		indiceMC = peso/(altura * altura);
		return indiceMC;
	}
}
