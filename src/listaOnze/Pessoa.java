package listaOnze;

public abstract class Pessoa {
	public String nome, cpf;
	public int idade;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf () {
		return cpf;
	}
	
	public void setCpf (String cpf) {
		this.cpf = cpf;
	}
	
	public int getIdade () {
		return idade;
	}
	
	public void setIdade (int idade) {
		this.idade = idade;
	}
}
