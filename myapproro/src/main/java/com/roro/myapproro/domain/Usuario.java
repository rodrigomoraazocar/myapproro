package com.roro.myapproro.domain;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

@Entity // Para criar a tabela Usuario
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	
	@Id //Para indicar que o Id será a chave primaria
	@GeneratedValue(strategy=GenerationType.IDENTITY)  
	private Integer id;
	
	
	@NotEmpty (message="Campo Nome é mandatório")
	@Length(min=3,max=100, message="O nome deve ter entre 3 a 100 caracteres")
	private String nome;
	
	@NotEmpty (message="Campo Login é mandatório")
	@Length(min=3,max=100, message="O nome deve ter entre 3 a 100 caracteres")
	private String login;
	
	@NotEmpty (message="Campo Senha é mandatório")
	@Length(min=3,max=100, message="O nome deve ter entre 3 a 100 caracteres")
	private String senha;

//alt shift + s 

	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
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

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(id, other.id);
	}

}
