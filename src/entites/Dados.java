package entites;

public class Dados {

	private double altura; 
	private int peso;
	private double indiceMC;
	
	public Dados() {
		super();
	}

	public Dados(double altura, int peso) {
		super();
		this.altura = altura;
		this.peso = peso;
	}

	public double calculaImc(double altura, int peso) {	
		this.indiceMC = peso/(altura * altura);
		return indiceMC;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public double getIndiceMC() {
		return indiceMC;
	}

	public void setIndiceMC(double indiceMC) {
		this.indiceMC = indiceMC;
	}
	
}
