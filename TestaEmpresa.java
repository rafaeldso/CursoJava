class TestaEmpresa{
	
	public static void main(String [] args){

			Empresa empresa = new Empresa(10);
			
			empresa.setNome("Caelum");
			empresa.setCNPJ("1234");

			Funcionario f1 = new Funcionario("José");
			Data data = new Data(13,03,2013);
			f1.setDataDeEntrada(data);

			Funcionario f2 = new Funcionario("Maria");
			Data data1 = new Data(25,05,2014);
			f2.setDataDeEntrada(data1);

			empresa.adiciona(f1);
			empresa.adiciona(f2);

			empresa.mostraEmpregados();

			Funcionario f3 = new Funcionario();

			System.out.println(empresa.contem(f3));
			System.out.println(empresa.contem(f2));
	}
}