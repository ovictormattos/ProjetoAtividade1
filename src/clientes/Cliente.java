package clientes;


public class Cliente {
	
	//ATRIBUTOS
	
	private int rg;
	private String nome;
	private String sexo;
	private int idade;
	private String email;
	private String telefone;
	private float renda;
	private String cpf;
	

	//CONSTRUTOR
	
	public Cliente (String nome, int rg) {
		this.nome = nome;
		this.rg = rg;
	}	
	
	

	//GET
	
	public int getRg() {
		return this.rg;
	}

	public String getNome() {
		return this.nome;
	}

	public String getSexo() {
		return this.sexo;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public String getEmail() {
		return this.email;
	}

	public String getTelefone() {
		return this.telefone;
	}

	public float getRenda() {
		return this.renda;
	}

	public String getCpf() {
		return this.cpf;
	}

	
	
	//SET

	public void setNome	(String novoNome) {
		this.nome = novoNome;
	}

	public void setSexo (String novoSexo) {
		this.sexo = novoSexo;
	}
	
	public void setIdade (int novaIdade) {
		this.idade = novaIdade;
	}
	
	public void setEmail (String novaEmail) {
		this.email = novaEmail;
	}
	
	public void setTelefone (String novoTelefone) {
		this.telefone =  novoTelefone;
	}

	public void setRenda (float novaRenda) {
		this.renda = novaRenda;
	}

	public void setCpf (String novoCpf) {
		this.cpf = novoCpf;
	}

	
	//toString

	public String toString() {
	String texto = "";
	texto = texto + "RG: " + this.rg + "\n";
	texto = texto + "Nome: " + this.nome + "\n";
	texto = texto + "Sexo: " + this.sexo + "\n";
	texto = texto + "Idade: " + this.idade + " anos\n";
	texto = texto + "Email: " +this.email + "\n";
	texto = texto + "Telefone: " + this.telefone + "\n";
	texto = texto + "Renda: R$" + this.renda + "\n";
	texto = texto + "CPF: " + this.cpf + "\n";
	
	
	return texto;

	}
}
