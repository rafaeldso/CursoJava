class TestaFuncionario{
	
	public static void main(String [] args){
		Funcionario f1 = new Funcionario();
		f1.setNome("Rafael");
		f1.setSalario(800.0);
		Data data = new Data();
		f1.setDataDeEntrada(data);
		f1.setEstaNaEmpresa(true);
		data.dia = 29;
		data.mes = 06;
		data.ano = 2015;
		f1.mostra();
		Funcionario f2 = new Funcionario("Felipe");
		f2.setDataDeEntrada(data);
		f2.setEstaNaEmpresa(true);
		f2.mostra();
	}
}