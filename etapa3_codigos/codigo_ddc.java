import java.util.Date;

// Classe Cliente
class Cliente {
    private int id_cliente;
    public String nome;
    private String email;
    private String senha;
    private String endereco;
    private int cpf;

    // Construtor
    public Cliente(int id_cliente, String nome, String email, String senha, String endereco, int cpf) {
        this.id_cliente = id_cliente;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.endereco = endereco;
        this.cpf = cpf;
    }

    // Métodos Getters e Setters para id_cliente e cpf (mantendo-os privados)
    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
}

// Classe Funcionario
class Funcionario {
    private int id_funcionario;
    public String nome;
    public String cargo;
    private float salario;

    // Construtor
    public Funcionario(int id_funcionario, String nome, String cargo, float salario) {
        this.id_funcionario = id_funcionario;
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    // Métodos Getters e Setters para os atributos privados
    public int getId_funcionario() {
        return id_funcionario;
    }

    public void setId_funcionario(int id_funcionario) {
        this.id_funcionario = id_funcionario;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}

// Classe Gerente
class Gerente {
    private int id_gerente;
    public String nome; 
    public String filial; 
    private float salario; 

    // Construtor
    public Gerente(int id_gerente, String nome, String filial, float salario) {
        this.id_gerente = id_gerente;
        this.nome = nome;
        this.filial = filial;
        this.salario = salario;
    }

    // Métodos Getters e Setters para os atributos privados
    public int getId_gerente() {
        return id_gerente;
    }

    public void setId_gerente(int id_gerente) {
        this.id_gerente = id_gerente;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}

// Classe Pedido
class Pedido {
    private int id_pedido; 
    public String status;
    public Date data; 

    // Construtor
    public Pedido(int id_pedido, String status, Date data) {
        this.id_pedido = id_pedido;
        this.status = status;
        this.data = data;
    }

    // Métodos Getters e Setters para o atributo privado
    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }
}

// Classe Produto
class Produto {
    private int id_produto; 
    public String nome; 
    public String descricao; 
    public float preco; 

    // Construtor
    public Produto(int id_produto, String nome, String descricao, float preco) {
        this.id_produto = id_produto;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    // Métodos Getters e Setters para o atributo privado
    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }
}

// Classe Estoque
class Estoque {
    private int id_estoque;
    private int quantidade;

    // Construtor
    public Estoque(int id_estoque, int quantidade) {
        this.id_estoque = id_estoque;
        this.quantidade = quantidade;
    }

    // Métodos Getters e Setters (sem alterações)
    public int getId_estoque() {
        return id_estoque;
    }

    public void setId_estoque(int id_estoque) {
        this.id_estoque = id_estoque;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
