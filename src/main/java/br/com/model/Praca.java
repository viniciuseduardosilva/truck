package br.com.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Praca {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Long caminhoneiro;

	private LocalDate datadeChegada;

	private LocalDate datadeSaida;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCaminhoneiro() {
		return caminhoneiro;
	}

	public void setCaminhoneiro(Long caminhoneiro) {
		this.caminhoneiro = caminhoneiro;
	}

	public LocalDate getDatadeChegada() {
		return datadeChegada;
	}

	public void setDatadeChegada(LocalDate datadeChegada) {
		this.datadeChegada = datadeChegada;
	}

	public LocalDate getDatadeSaida() {
		return datadeSaida;
	}

	public void setDatadeSaida(LocalDate datadeSaida) {
		this.datadeSaida = datadeSaida;
	}

	@Override
	public String toString() {
		return "Praca [id=" + id + ", caminhoneiro=" + caminhoneiro + ", datadeChegada=" + datadeChegada + "]";
	}

}
