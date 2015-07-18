public class ContaPoupanca extends Conta{
	
	public ContaPoupanca(){
		
	}
	public ContaPoupanca(String titular, int numero, int agencia){
		super(titular,numero,agencia);
	}
	public void atualiza(double taxa){
		this.setSaldo(this.getSaldo() * (taxa*3));
	}
}