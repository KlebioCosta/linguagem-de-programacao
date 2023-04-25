package entidades;

public class Cliente {
    private static int idCliente =  1;
    private String nome;
    private int dataNascimento;
    private int cpf;
    private String email;
    private String senha;
    private String confirmaSenha;
    private String listaFavoritos;

    public Cliente(String nome, int dataNascimento, int cPF, String email, String senha, String confirmaSenha) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
        this.confirmaSenha = confirmaSenha;

        idCliente += 1;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDataNascimento() {

        return dataNascimento;
    }
    public void setDataNascimento() {

        this.dataNascimento = dataNascimento;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
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

    public String getConfirmaSenha() {

        return confirmaSenha;
    }

    public void setConfirmaSenha(String confirmaSenha) {

        this.confirmaSenha = confirmaSenha;
    }


    public String getListaFavoritos() {
        return listaFavoritos;
    }

    public void setListaFavoritos(String listaFavoritos) {
        this.listaFavoritos = listaFavoritos;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", cpf='" + cpf + '\'' +
                ", email='" + email + '\'' +
                ", senha=" + senha +
                ", confirmaSenha=" + confirmaSenha +
                ", listaFavoritos='" + listaFavoritos + '\'' +
                '}';
    }
}
