package com.matrix.domain;

public class EnqueteItem {

	private int id;
	private Enquete enquete;
	private String avaliador;
	private String avaliado;
	private Modulo modulo;
	private Expertise expertise;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Enquete getEnquete() {
		return enquete;
	}
	public void setEnquete(Enquete enquete) {
		this.enquete = enquete;
	}
	public String getAvaliador() {
		return avaliador;
	}
	public void setAvaliador(String avaliador) {
		this.avaliador = avaliador;
	}
	public String getAvaliado() {
		return avaliado;
	}
	public void setAvaliado(String avaliado) {
		this.avaliado = avaliado;
	}
	public Modulo getModulo() {
		return modulo;
	}
	public void setModulo(Modulo modulo) {
		this.modulo = modulo;
	}
	public Expertise getExpertise() {
		return expertise;
	}
	public void setExpertise(Expertise expertise) {
		this.expertise = expertise;
	}
	@Override
	public String toString() {
		return "EnqueteItem [id=" + id + ", enquete=" + enquete
				+ ", avaliador=" + avaliador + ", avaliado=" + avaliado
				+ ", modulo=" + modulo + ", expertise=" + expertise + "]";
	}
	
	
	
}
