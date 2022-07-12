package com.generation.farmaciapopular.model;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


//
/*aqui estão presentes as informações (atributos) da nossa tabela de produtos da farmácia, tendo sido
escolhidos o valor, nome e informação do medicamento. Este último não é obrigagório e por isso não está marcado
com a anotação "@NotBlank". */
@Entity
@Table (name = "tb_produtos")
public class Produto {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank (message = "O nome do medicamento é Obrigatório!")
	@Size(min = 5, max = 100, message = "O nome do medicamento deve conter no mínimo 5 e no máximo 100 caracteres. ")
	private String nomeMedicamento;
	
	@Size (max = 1000)
	private String infoMedicamento;
	
	@NotBlank (message = "O preço do medicamento é obrigatório!")
	private float valorMedicamento;
	
	@UpdateTimestamp
	private LocalDateTime data;

	@ManyToOne
	@JsonIgnoreProperties ("produto")
	private Categoria categoria;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeMedicamento() {
		return nomeMedicamento;
	}

	public void setNomeMedicamento(String nomeMedicamento) {
		this.nomeMedicamento = nomeMedicamento;
	}

	public String getInfoMedicamento() {
		return infoMedicamento;
	}

	public void setInfoMedicamento(String infoMedicamento) {
		this.infoMedicamento = infoMedicamento;
	}

	public float getValorMedicamento() {
		return valorMedicamento;
	}

	public void setValorMedicamento(float valorMedicamento) {
		this.valorMedicamento = valorMedicamento;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	
	
	
	
	
	
	
	

}
