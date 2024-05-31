package dominio;

import java.io.Serializable;

import javax.persistence.Entity; // sempre prefira o javax.persistence ao invés do import do hibernate para garantir que o nosso programa estará atendendo às especificações do JPA. Mas, importando o JPA, o hibernate é pego automaticamente, então, don't worry
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pessoa implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String email;
	/*
	 O JPA vai criar uma tabela com o mesmo nome da classe e colunas com os mesmos nomes dos atributos
	 Se eu quiser um nome diferente para alguma coluna eu coloco em cima do atributo: @Column(name="nomecompleto"), ai já não vai ser criado mais com o nome de "nome", mas "nomecompleto" 
	*/
	public Pessoa() {
	}

	public Pessoa(Integer id, String nome, String email) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", email=" + email + "]";
	}

}
