import com.fasterxml.jackson.databind.ObjectMapper;
public class TesteJSON {
		public static void main (String [] args) {
			try {
				ObjectMapper objeto = new ObjectMapper();
				
				Pessoa2 pes = new Pessoa2 ("Abel" , 45);
				String json = objeto.writeValueAsString(pes);
				//serializando o obj pes
				System.out.println("Objeto serializado");
				System.out.println(json);
				// desserializado o JSON para o obj pes 
				Pessoa2 desPessoa2 = objeto.readValue(json, Pessoa2.class);
				System.out.println("JSON desserializando para obj Pessoa");
				System.out.println("Nome:" + desPessoa2.getNome());
				System.out.println("Idade: " + desPessoa2.getIdade());
				}catch (Exception e ) {
				e.printStackTrace();
			}
		}

}
