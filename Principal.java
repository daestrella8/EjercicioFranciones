public class Principal{

	public static void main(String[] args){
		
		Fraccion obj = new Fraccion(25, 4);
		System.out.println("El numerador es: " + obj.getNumerador());
		System.out.println("El denominador es: " + obj.getDenominador());
		
		System.out.println("El resultado de la Fracción es: " + obj.resultado());
		System.out.println("El resto de la fracción es de: " + obj.resto());

	}
}