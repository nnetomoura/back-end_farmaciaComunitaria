package com.generation.farmaciapopular.repository;

/*Observação: a anotação @param é recente. Basicamente é um tipo especial de commit utilizado pelo javadoc
e descreverá o parâmetro que um método pode receber. Nesse caso, o método de busca pelo nome do produto
deverá ser preenchido especificamente com um "nome" sendo um objeto do tipo String. Foi inserida 
para solucionar possíveis problemas de busca nos parâmetros em geral, onde a especificação do seu tipo
tal questão*/

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.farmaciapopular.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	
	//forma usada anteriormente: 
	/*public List <Produto> findAllByNomeProdutoContainingIgnoreCase(String nome);*/
	public List <Produto> findAllByNomeProdutoContainingIgnoreCase(@Param("nome") String nome);

}
