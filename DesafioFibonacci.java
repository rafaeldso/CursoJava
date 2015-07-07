public class DesafioFibonacci{

	
	int calculaFibonacci(int valor){
		
		if((valor == 1) || (valor == 2)){
			return 1;
		}
		
		int resposta =  calculaFibonacci(valor - 2) + calculaFibonacci(valor - 1) ;
		
		return resposta;
		
	}
}
