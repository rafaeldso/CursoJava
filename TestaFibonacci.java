class TestaFibonacci{
	
	public static void main(String [] args){
		
		DesafioFibonacci fb = new DesafioFibonacci(); 
		
		for(int i = 1; i <= 10; i++){
		System.out.println(fb.calculaFibonacci(i));
		}
		
		// Testando nova classe DesafioFibonacci, só que usando o operador condicional ternário, tudo em apenas uma linha
		DesafioFibonacciNovoOperador fb1 = new DesafioFibonacciNovoOperador();
		
		for(int i = 1; i <= 10; i++){
		System.out.println(fb1.calculaFibonacci(i));
		}
		
		DesafioFibonacciVetor fb2 = new DesafioFibonacciVetor();
		
		for(int i = 1; i <= 10; i++){
		System.out.println(fb2.calculaFibonacci(i));
		}
	}
	
}