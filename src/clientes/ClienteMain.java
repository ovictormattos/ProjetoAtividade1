package clientes;

public class ClienteMain {

	public static void main(String[] args) {
		Cliente client1 = new Cliente("Victor Mattos", 1144239114);
		
		client1.setSexo("M");
		client1.setIdade(26);
		client1.setEmail("victor.mattos@live.com");
		client1.setTelefone("(51)98020-1633");
		client1.setRenda(1589.76f);
		client1.setCpf("080.155.549-49");
		
		
		//ANTES DA ALTERAÇÃO
		System.out.println(client1.toString());
				
		
		//DEPOIS DA ALTERAÇÃO
		System.out.println("Depois das alterações:");
		client1.setNome("Victor Gabriel Mattos da Rocha");
		client1.setSexo("Masculino");
		client1.setIdade(27);
		client1.setEmail("victor.mattos@gmail.com");
		client1.setTelefone("(51)98458-1377");
		client1.setRenda(2195.83f);
		client1.setCpf("545.266.018-60");
		
		System.out.println(client1.toString());
		
	}

}
