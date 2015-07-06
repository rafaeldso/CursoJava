public class Funcionario{
	
	private String nome;
	private String departamento;
	private double salario;
	private Data dataDeEntrada;
	private String rg;
	private boolean estaNaEmpresa;

	public Funcionario(){

	}
	public Funcionario(String nome){
		this.nome = nome;
	}

	void recebeAumento(double valor){

		this.salario = this.salario + valor;
	}

	double calculaGanhoAnual(){
		return (salario*12);

	}

	void demite(){
		this.estaNaEmpresa = false;
	}

	public double getSalario(){
		return this.salario;
	}
	public void setSalario(double salario){
		this.salario = salario;
	}
	public String getNome(){
		return this.nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getDepartamento(){
		return this.departamento;
	}
	public void setDepartamento(String departamento){
		this.departamento = departamento;
	}
	public String getDataDeEntrada(){
		return this.dataDeEntrada.dataFormatada();
	}
	public void setDataDeEntrada(Data dataDeEntrada){
		this.dataDeEntrada = dataDeEntrada;
	}
	public String getRG(){
		return this.rg;
	}
	public void setRG(String rg){
		this.rg = rg;
	}
	public boolean getEstaNaEmpresa(){
		return this.estaNaEmpresa;
	}
	public void setEstaNaEmpresa(boolean valor){
		this.estaNaEmpresa = valor;
	}

	public void mostra(){
		System.out.println("Nome: "+this.getNome());
		System.out.println("Departamento: "+this.getDepartamento());
		System.out.println("Salario: "+this.getSalario());
		System.out.println("RG: "+this.getRG());
		System.out.println("Data de Entrada: "+this.getDataDeEntrada());
		System.out.println("Está na empresa: "+this.getEstaNaEmpresa());

	}
	
}