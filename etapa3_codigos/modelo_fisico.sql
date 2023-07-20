CREATE TABLE Cliente (
    id_cliente INTEGER ZEROFILL NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(40) NOT NULL,
    email VARCHAR(30) NOT NULL,
    senha VARCHAR(20) NOT NULL,
    endereco VARCHAR(50) NOT NULL,
    cpf CHAR(11) NOT NULL,
    id_pedido INTEGER
)

CREATE TABLE Gerente (
    id_gerente INTEGER ZEROFILL NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(40) NOT NULL,
    filial VARCHAR(10) NOT NULL,
    salario DECIMAL(13) NOT NULL,
    id_funcionario INTEGER,
    id_pedido INTEGER,
    id_estoque INTEGER
)

CREATE TABLE Estoque (
    id_estoque INTEGER ZEROFILL NOT NULL AUTO_INCREMENT PRIMARY KEY,
    quantidade INTEGER NOT NULL
)

CREATE TABLE Pedido (
    id_pedido INTEGER ZEROFILL NOT NULL AUTO_INCREMENT PRIMARY KEY,
    status VARCHAR(10) NOT NULL,
    data DATETIME NOT NULL
)

CREATE TABLE PedidoProduto (
    id_pedido INTEGER,
    id_produto INTEGER,
    FOREIGN KEY (id_pedido) REFERENCES Pedido (id_pedido)
)

CREATE TABLE Produto (
    id_produto INTEGER ZEROFILL NOT NULL AUTO_INCREMENT PRIMARY KEY,
    preco DECIMAL(15) NOT NULL,
    nome VARCHAR(30) NOT NULL,
    descricao VARCHAR(50) NOT NULL
)

CREATE TABLE ProdutoEstoque (
    id_estoque INTEGER,
    id_produto INTEGER,
    FOREIGN KEY (id_estoque) REFERENCES Estoque (id_estoque),
    FOREIGN KEY (id_produto) REFERENCES Produto (id_produto)
)

CREATE TABLE Funcionario (
    id_funcionario INTEGER ZEROFILL NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(40) NOT NULL,
    cargo VARCHAR(30) NOT NULL,
    salario DECIMAL(12) NOT NULL,
    id_pedido INTEGER,
    FOREIGN KEY (id_pedido) REFERENCES Pedido (id_pedido)
)

ALTER TABLE Cliente ADD FOREIGN KEY (id_pedido) REFERENCES Pedido (id_pedido)
ALTER TABLE Gerente ADD FOREIGN KEY (id_funcionario) REFERENCES Funcionario (id_funcionario)
ALTER TABLE Gerente ADD FOREIGN KEY (id_pedido) REFERENCES Pedido (id_pedido)
ALTER TABLE Gerente ADD FOREIGN KEY (id_estoque) REFERENCES Estoque (id_estoque)
ALTER TABLE PedidoProduto ADD FOREIGN KEY (id_produto) REFERENCES Produto (id_produto)
