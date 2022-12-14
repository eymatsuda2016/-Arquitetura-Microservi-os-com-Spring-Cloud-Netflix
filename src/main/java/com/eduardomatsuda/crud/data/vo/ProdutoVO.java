package com.eduardomatsuda.crud.data.vo;

import java.io.Serializable;

import org.modelmapper.ModelMapper;

import com.eduardomatsuda.crud.entity.Produto;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@JsonPropertyOrder({"id", "nome", "estoque", "preco"})
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode

public class ProdutoVO implements Serializable{

	private static final long serialVersionUID = -9100241351575970876L;

	@JsonProperty("id")
	private Long id;
	
	@JsonProperty("nome")
	private String nome;
	
	@JsonProperty("estoque")
	private Integer estoque;
	
	@JsonProperty("preco")
	private Double preco;

	
	public static ProdutoVO create(Produto produto) {
		return new ModelMapper().map(produto, ProdutoVO.class);
	}

	public Long getId() {
		return null;
	}

}
