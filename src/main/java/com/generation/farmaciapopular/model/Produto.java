package com.generation.farmaciapopular.model;
import java.text.DecimalFormat;
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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank (message = "O nome do medicamento é Obrigatório!")
	@Size (min = 5, max = 100, message = "O nome do medicamento deve conter no mínimo 5 e no máximo 100 caracteres. ")
	private String nomeProduto;
	
	@Size (max = 1000, message="A descrição do produto deve conter no máximo 1000(um mil) caracteres.")
	private String descricaoProduto;
	
	@NotBlank (message = "O preço do medicamento é obrigatório!")
	private DecimalFormat valorProduto;
	
	@Size (max = 2000)
	private String fotoProduto;
	
	@Size (min = 1, max = 500)
	private String estoqueProduto;
	
	@UpdateTimestamp
	private LocalDateTime dataCadastro;

	@ManyToOne
	@JsonIgnoreProperties ("produto")
	private Categoria categoria;

	
	
	
	
	
	
	
	
	

}
