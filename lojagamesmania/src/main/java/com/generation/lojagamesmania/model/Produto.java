package com.generation.lojagamesmania.model;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O nome é obrigatório")
	@Size(min = 5, max = 30, message = "O atributo nome deve conter no mínimo 5 e no máximo 30 caracteres")
	private String nome;
	
	@NotNull
	private int classificacaoetaria;
	
	@NotNull
	private String descricao;
	
	@NotNull
	private int quantidade;
	
	@NotBlank(message = "A plataforma é obrigatória")
	@Size(min = 1, max = 30, message = "O atributo plataforma deve conter no mínimo 5 e no máximo 30 caracteres")
	private String plataforma;
	
	
	@Digits(fraction = 2, integer = 3)
	private BigDecimal preco;
	
	@DateTimeFormat(pattern = "yyyy/MM/dd hh:mm:ss a")
	private Date datalancamento;
	
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Usuario usuario;

	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
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


	public int getClassificacaoetaria() {
		return classificacaoetaria;
	}


	public void setClassificacaoetaria(int classificacaoetaria) {
		this.classificacaoetaria = classificacaoetaria;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public int getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}


	public String getPlataforma() {
		return plataforma;
	}


	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}


	public BigDecimal getPreco() {
		return preco;
	}


	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}


	public Date getDatalancamento() {
		return datalancamento;
	}


	public void setDatalancamento(Date datalancamento) {
		this.datalancamento = datalancamento;
	}


	public Categoria getCategoria() {
		return categoria;
	}


	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}	
	
}
