public class ContaPoupanca extends Conta{
	
	public void atualiza(double taxa){
		this.setSaldo(this.getSaldo() * (taxa*3));
	}
}