package entidades;
import java.util.Date;

public class ContaCliente {

    private static int idConta = 1;
    private int numeroConta;
    private Cliente cliente;
    private Favoritos favoritos;
    private VerNovamente vernovamente;

    public ContaCliente(Cliente cliente) {
        this.numeroConta = idConta;
        this.cliente = cliente;
        idConta += 1;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Favoritos getFavoritos() {
        return favoritos;
    }

    public void setFavoritos(Favoritos favoritos) {
        this.favoritos = favoritos;
    }

    public VerNovamente getVernovamente() {
        return vernovamente;
    }

    public void setVernovamente(VerNovamente vernovamente) {
        this.vernovamente = vernovamente;
    }

    @Override
    public String toString() {
        return "ContaCliente{" +
                "numeroConta=" + numeroConta +
                ", cliente=" + cliente +
                ", favoritos=" + favoritos +
                ", vernovamente=" + vernovamente +
                '}';
    }
}
