public class ClasseFilha extends ClassePai { // Devido à declaração "final" na ClassePai, ela não pode ter heranças

	private String nome;

	// Devido à assinatura "final" no método da ClassePai, o método não pode ser alterado
	public void Imprimir() {
		System.out.println("Este é o print do Filho.");
	}
	
}