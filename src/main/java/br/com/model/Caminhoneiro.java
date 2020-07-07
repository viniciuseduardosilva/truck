package br.com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Caminhoneiro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nome;

	private Integer idade;

	private String sexo;

	private String possuiVeiculo;

	private String cnh;

	private String veiculo;

	private String carga;

	private String proprio;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getPossuiVeiculo() {
		return possuiVeiculo;
	}

	public void setPossuiVeiculo(String possuiVeiculo) {
		this.possuiVeiculo = possuiVeiculo;
	}

	public String getCnh() {
		return cnh;
	}

	public void setCnh(String cnh) {
		this.cnh = cnh;
	}

	public String getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(String veiculo) {
		this.veiculo = veiculo;
	}

	public String getCarga() {
		return carga;
	}

	public void setCarga(String carga) {
		this.carga = carga;
	}

	public String getProprio() {
		return proprio;
	}

	public void setProprio(String proprio) {
		this.proprio = proprio;
	}

	@Override
	public String toString() {
		return "Caminhoneiro [id=" + id + ", nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + ", possuiVeiculo="
				+ possuiVeiculo + ", cnh=" + cnh + ", veiculo=" + veiculo + ", carga=" + carga + ", proprio=" + proprio
				+ "]";
	}

}
