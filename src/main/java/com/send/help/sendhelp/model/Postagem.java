package com.send.help.sendhelp.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="postagem")
@NoArgsConstructor
public class Postagem {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int id;
    String titulo;
    String descricao;
    @OneToMany
    Usuario autor;
    @ManyToMany
    Ong ong;                            
    @ManyToOne          
    List<Comentario> comentarios;
}
