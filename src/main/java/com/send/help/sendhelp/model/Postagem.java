    package com.send.help.sendhelp.model;
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
