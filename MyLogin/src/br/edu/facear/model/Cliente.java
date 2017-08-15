package br.edu.facear.model;

public class Cliente {
	private Integer id;
	private String nome;
	private String cpf;
	private String email;
	private String senha;
	
	public Cliente(Integer Id, String Nome, String Cpf, String Email,String Senha){
		this.id = Id;
		this.nome = Nome;
		this.cpf = Cpf;
		this.email = Email;
		this.senha = Senha;
	}
	public Cliente (String Nome, String Cpf, String Email,String Senha){
		this.nome = Nome;
		this.cpf = Cpf;
		this.email = Email;
		this.senha = Senha;
	}
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
