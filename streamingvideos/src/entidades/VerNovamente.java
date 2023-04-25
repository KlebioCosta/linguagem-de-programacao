package entidades;

public class VerNovamente {
    private Filmes filmes;
    private Series series;

    public VerNovamente(Filmes filmes, Series series) {
        this.filmes = filmes;
        this.series = series;
    }

    public Filmes getFilmes() {
        return filmes;
    }

    public void setFilmes(Filmes filmes) {
        this.filmes = filmes;
    }

    public Series getSeries() {
        return series;
    }

    public void setSeries(Series series) {
        this.series = series;
    }
    public String toString() {
        return "\nFilmes já vistos: " + this.getFilmes() +
               "\nSéries já vistas: " + this.getSeries();
    }
}
