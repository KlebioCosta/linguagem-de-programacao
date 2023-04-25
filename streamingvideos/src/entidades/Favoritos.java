package entidades;

public class Favoritos {
    private Filmes filmes;
    private Series series;

    public Favoritos(Filmes filmes, Series series) {
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

    @Override
    public String toString() {
        return "Favoritos{" +
                "filmes=" + filmes +
                ", series=" + series +
                '}';
    }
}
