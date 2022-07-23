package com.send.help.sendhelp.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    @Column(name = "nome")
    public String nome;
    @Column(name = "email")
    public String email;
    @Column(name = "senha")
    public String senha;


}
