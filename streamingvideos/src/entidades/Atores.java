package entidades;

import java.awt.*;
import java.util.Date;

public class Atores {
    private String nome;
    private Date nascimento;
    private String nacionalidade;

    public Atores(String nome, Date nascimento, String nacionalidade, Image foto) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.nacionalidade = nacionalidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    @Override
    public String toString() {
        return "Atores{" +
                "nome='" + nome + '\'' +
                ", nascimento=" + nascimento +
                ", nacionalidade='" + nacionalidade + '\'' +
                '}';
    }
}
