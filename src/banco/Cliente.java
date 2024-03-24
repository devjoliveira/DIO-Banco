package banco;
public class Cliente {
    private final String nome;
    private final String cpf;
    private final String rg;
    private final String telefone;
    private final String email;
    private final String estado;
    private final String cep;

    public Cliente(String nome, String cpf, String rg, String telefone, String email, String estado, String cep) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.telefone = telefone;
        this.email = email;
        this.estado = estado;
        this.cep = cep;
    }

    // Construtor com parâmetros mínimos
    public Cliente(String nome, String cpf, String email, String telefone) {
        this(nome, cpf, "", telefone, email, "", "");
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getEstado() {
        return estado;
    }

    public String getCep() {
        return cep;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", estado='" + estado + '\'' +
                ", cep='" + cep + '\'' +
                '}';
    }
}

