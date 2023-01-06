CREATE TABLE usuarios
(
    id    BIGINT AUTO_INCREMENT NOT NULL,
    login VARCHAR(100)          NULL,
    senha VARCHAR(255)          NULL,
    CONSTRAINT pk_usuarios PRIMARY KEY (id)
);