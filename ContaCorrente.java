public class ContaCorrente extends Conta{
	
	public void atualiza(double taxa){
		this.deposita(this.getSaldo() * (taxa*2));
	}
}