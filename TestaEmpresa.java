class TestaEmpresa{
	
	public static void main(String [] args){

			Empresa empresa = new Empresa();
			empresa.empregados = new Funcionario[5];
			empresa.nome = "Caelum";
			empresa.cnpj = "1234";

			Funcionario f1 = new Funcionario();
			f1.nome = "José";

			Funcionario f2 = new Funcionario();
			f2.nome = "Maria";

			empresa.adiciona(f1);
			empresa.adiciona(f2);

			empresa.mostraEmpregados();

			Funcionario f3 = new Funcionario();

			System.out.println(empresa.contem(f3));
			System.out.println(empresa.contem(f2));
	}
}