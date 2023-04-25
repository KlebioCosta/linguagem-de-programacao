package entidades;

public class Series {
    private String titulo;
    private String diretor;
    private int classificacao;
    private String genero;
    private String sinopse;
    private int anoLancamento;

    public Series(String titulo, String diretor, int classificacao, String genero, String sinopse, int anoLancamento) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.classificacao = classificacao;
        this.genero = genero;
        this.sinopse = sinopse;
        this.anoLancamento = anoLancamento;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    @Override
    public String toString() {
        return "Series{" +
                "titulo='" + titulo + '\'' +
                ", diretor='" + diretor + '\'' +
                ", classificacao=" + classificacao +
                ", genero='" + genero + '\'' +
                ", sinopse='" + sinopse + '\'' +
                ", anoLancamento=" + anoLancamento +
                '}';
    }
}
