package com.send.help.sendhelp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ong")

public class Ong {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name="nome", length = 30, nullable = true)
	private String nome;
	@Column(name="cnpj",length = 15, nullable = true)
	private String cnpj;
	@Column(name="objetivo", length = 1000, nullable = true)
	private String objetivo;
	@Column(name="contato", length = 15, nullable = true)
	private String contato;
	@Column(name="endereco", length = 500, nullable = true)
	private String endereco;
	@Column(name="email", length = 50, nullable = true)
	private String email;
	@Column(name="site", length = 50, nullable = true)
	private String site;
}
