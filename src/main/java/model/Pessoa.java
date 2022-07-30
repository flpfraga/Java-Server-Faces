package model;

import java.util.Objects;

import javax.persistence.*;


@Entity
public class Pessoa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(length = 30, nullable = false)
	private String nome;
	@Column(length = 100, nullable = false)
	private String password;

	public Pessoa() {
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj == null)
			return false;

		if (obj == this)
			return true;

		if (this.getClass() != obj.getClass())
			return false;

		Pessoa pessoa = (Pessoa) obj;

		if (id == null) {
			if (pessoa.id != null)
				return false;
		} else if (!id.equals(pessoa.id))
			return false;

		return true;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id, nome);
	}

}
