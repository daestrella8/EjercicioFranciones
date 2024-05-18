public class Fraccion{


	private int numerador;
	private int denominador;	
	
	public Fraccion(){
	}

	public Fraccion(int numerador, int denominador){
		this.numerador = numerador;
		this.denominador= denominador;

	}

	public void setNumerador(int num){
		numerador=num;

	}

	public int getNumerador(){
		return numerador;
	}

	public void setDenominador(int num){
		denominador=num;

	}

	public int getDenominador(){
		return denominador;
	}
	
	public float resultado(){
	
		return this.numerador / this.denominador;
		
	}

	public int resto(){
	
		return this.numerador % this.denominador;		

	}
}