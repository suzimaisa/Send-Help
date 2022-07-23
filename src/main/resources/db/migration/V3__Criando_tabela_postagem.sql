CREATE TABLE IF NOT EXISTS postagem (
    id INT AUTO_INCREMENT,
    titulo VARCHAR(30) NOT NULL,
    descricao VARCHAR(50) NOT NULL,
    comentarios VARCHAR(1500),
    PRIMARY KEY (id)
);
