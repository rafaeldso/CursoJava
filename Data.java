public class Data{
	int dia;
	int mes;
	int ano;
	
	String dataFormatada(){
		String dataFormatada = this.dia+"/"+this.mes+"/"+this.ano;
		return dataFormatada;
	}

}