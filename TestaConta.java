class TestaConta{

		public static void main(String [] args){

			Conta c1 = new Conta("Rafael", 1234, 4321);
			Conta c2 = new Conta("Maria", 4321, 3456);

			int num = Conta.getnumContas();
			System.out.println(num);
		}


}