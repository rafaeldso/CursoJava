public class DesafioFibonacciNovoOperador{

	int resposta;
	int calculaFibonacci(int valor){
		
		return resposta = ((valor == 1) || (valor == 2)) ? 1 : (calculaFibonacci(valor - 2) + calculaFibonacci(valor - 1));
		
	}
}
