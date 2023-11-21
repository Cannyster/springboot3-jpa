package com.cannysters.course.entities;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity //Anotação para fazer o mapeamento objeto relacional do JPA
@Table(name = "tb_user") //indicando qual tabela vai ser usada
public class User implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id // anotação para indicar qual será o Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//Anotação Dizendo que o id sera auto gerado pelo banco
	private Long id;
	private String nome;
	private String email;
	private String phone;
	private String password;
	
	public User() {
	}

	public User(Long id, String nome, String email, String phone, String password) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.phone = phone;
		this.password = password;
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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
		User other = (User) obj;
		return Objects.equals(id, other.id);
	}
	

	
}
