package com.generation.farmaciapopular.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/*as anotações (após o arroba '@') abaixo indicam que a classe é uma entidade que será
 * mapeada para o banco de dados. Logo abaixo vem o seu tipo. Ou seja, 
 * a classe CATEGORIA se comportará como uma entidade (@Entity) do tipo tabela (@Table)*/

@Entity
@Table (name = "tb_categorias")
public class Categoria {
	
	@Id
	@GeneratedValue (strategy= GenerationType.IDENTITY)
	private Long id;
	
	@NotNull (message = "A descrição do medicamento é obrigatória!")
	private String descMedicamento;

	@OneToMany (mappedBy = "categoria", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties("categoria")
	private List <Produto> produto;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescMedicamento() {
		return descMedicamento;
	}

	public void setDescMedicamento(String descMedicamento) {
		this.descMedicamento = descMedicamento;
	}
	
	public List<Produto> getProduto() {
		return produto;
	}

	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}

}
