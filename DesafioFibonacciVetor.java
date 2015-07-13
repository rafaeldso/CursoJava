public class DesafioFibonacciVetor{

	int fibonacci[] = new int[15];
	fibonacci[0] = 0;
	fibonacci[1] = 1;
	fibonacci[2] = 1;
	
	int calculaFibonacci(int valor){
		
		if((valor == 1) || (valor == 2)){
			return 1;
		}
		
		int resposta =  fibonacci[valor - 2] + fibonacci[valor - 1] ;
		fibonacci[valor] = resposta;
		return resposta;
		
	}
}