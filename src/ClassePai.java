public final class ClassePai {
	
	private String Sobrenome;
	// "Final", em atributos, transforma-os em constantes, como final int NUMERO = 100;
	
	// Em métodos, a declaração "final" proíbe a sobrescrita do método
	public final void Imprimir() {
		System.out.println("Este print é do Pai.");
	}

	 /*
	  * public abstract String Imprimir2(){
	  * 	return("Texto");
	  * }
	  * 
	  * Está incorreto, pois métodos abstratos não podem ter corpo
	  */
	
	public abstract String Imprimir2();
	
}

// public abstract class ClassePai (proíbe instanciar a classe)

// Classes concretas são aquelas que podem ser instaciadas (?)