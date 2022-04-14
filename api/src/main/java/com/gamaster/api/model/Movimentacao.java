package com.gamaster.api.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "tb_movimentacao")
public class Movimentacao implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private BigDecimal valor;
	private String descricao;
	private String cartao;
	
	@CreationTimestamp
	@Column(nullable = false, columnDefinition = "datetime")
	private LocalDateTime dataMovimentacao;
	
	public Movimentacao() {
		super();
	}

	public Movimentacao(int id, BigDecimal valor, String descricao, String cartao, LocalDateTime dataMovimentacao) {
		super();
		this.id = id;
		this.valor = valor;
		this.descricao = descricao;
		this.cartao = cartao;
		this.dataMovimentacao = dataMovimentacao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCartao() {
		return cartao;
	}

	public void setCartao(String cartao) {
		this.cartao = cartao;
	}

	public LocalDateTime getDataMovimentacao() {
		return dataMovimentacao;
	}

	public void setDataMovimentacao(LocalDateTime dataMovimentacao) {
		this.dataMovimentacao = dataMovimentacao;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
