package com.matrix.domain;

public class Pessoa {

	
	private String nome;
	private String time;
	private String senha;
	private String admin;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getAdmin() {
		return admin;
	}
	public void setAdmin(String admin) {
		this.admin = admin;
	}
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", time=" + time + ", senha=" + senha
				+ ", admin=" + admin + "]";
	}
	
	
}
