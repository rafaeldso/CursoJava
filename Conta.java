class Conta{
	
	private String titular;
	private int numero;
	private double saldo;
	private int agencia;
	private static int numContas;

	public Conta(String titular, int numero, int agencia){
		this.titular = titular;
		this.numero = numero;
		this.agencia = agencia;
		Conta.numContas++;

	}

	public boolean saca(double valor){
		return false;
	}

	public void deposita(double valor){


	}

	public void setTitular(String titular){

		this.titular = titular;
	}
	public String getTitular(){

        return this.titular;     
    }     

    public static int getnumContas(){

		return Conta.numContas;
	}

}