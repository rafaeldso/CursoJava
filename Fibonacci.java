class Fibonacci{
	public static void main(String [] args){
		
		int num = 1;
		int i = 0;
		int aux = 0;
		int fibonacci = 0;
		System.out.println(fibonacci);
		
		while(i < 10){
			System.out.println(fibonacci);
			fibonacci = aux + num;
			aux = num;
			num = fibonacci;
			//System.out.println(fibonacci);
			i++;
		}
	}

}