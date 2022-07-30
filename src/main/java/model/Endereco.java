package model;

import java.util.Objects;

import javax.persistence.*;

@Entity
@Table(name="pessoa_end")
public class Endereco {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(length = 30, nullable = false)
	private String cidade;
	
	@ManyToOne
	private Pessoa pessoa;

	public Endereco() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;

		if (obj == this)
			return true;

		if (this.getClass() != obj.getClass())
			return false;

		Endereco endereco = (Endereco) obj;

		if (id == null) {
			if (endereco.id != null)
				return false;
		} else if (!id.equals(endereco.id))
			return false;

		return true;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, cidade);
	}

}
