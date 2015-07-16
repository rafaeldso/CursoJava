public class AtualizadorDeContas{
	private double saldoTotal = 0;
	private double selic;
	
	//saldoTotal = 0;
	
	public AtualizadorDeContas(double selic){
		this.selic = selic;
	}
	public void roda(Conta c){
		System.out.println("Saldo Anterior: "+c.getSaldo());
		c.atualiza(this.selic);
		System.out.println("Saldo final: "+c.getSaldo());
		this.saldoTotal += c.getSaldo();
		// aqui você imprime o saldo anterior, atualiza a conta, 
		// e depois imprime o saldo final
		// lembrando de somar o saldo final ao atributo saldoTotal
	}
	public double getSaldoTotal(){
		return this.saldoTotal;
	}
}