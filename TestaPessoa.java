public class TestaPessoa{
		public static void main(String [] args){
			Pessoa pessoa = new Pessoa();
			pessoa.nome = "Rafael";
			pessoa.idade = 18;
			pessoa.fazAniversario();
			pessoa.fazAniversario();
			
			System.out.println("Nome: "+pessoa.nome+"\nIdade: "+pessoa.idade);
		}
}