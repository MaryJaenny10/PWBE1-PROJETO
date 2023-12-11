import com.fasterxml.jackson.annotation.JsonInclude;
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Pessoa2 {
		private String nome;
		private int idade;
		
		public Pessoa2 () {
			
		}
		public Pessoa2 (String nome, int idade ) {
			this.idade = idade;
			this.nome = nome;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public int getIdade() {
			return idade;
		}

		public void setIdade(int idade) {
			this.idade = idade;
		}
		
		
}
