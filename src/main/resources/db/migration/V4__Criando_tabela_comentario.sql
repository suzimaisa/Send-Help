CREATE TABLE IF NOT EXISTS comentario (
    id INT AUTO_INCREMENT,
    autor VARCHAR(30) NOT NULL,
    mensagem VARCHAR(1000) NOT NULL,
    id_postagem INT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (id_postagem)
          REFERENCES postagem (id)
          ON UPDATE RESTRICT ON DELETE CASCADE
);