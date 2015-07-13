public class Data{
	private int dia;
	private int mes;
	private int ano;
	
	public Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	public void setDia(int dia){
		this.dia = dia;
	}
	public int getDia(){
		return this.dia;
	}
	public void setMes(int mes){
		this.mes = mes;
	}
	public int getMes(){
		return this.mes;
	}
	public void setAno(int ano){
		this.ano = ano;
	}
	public int getAno(){
		return this.ano;
	}
	
	String dataFormatada(){
		String dataFormatada = this.dia+"/"+this.mes+"/"+this.ano;
		return dataFormatada;
	}

}