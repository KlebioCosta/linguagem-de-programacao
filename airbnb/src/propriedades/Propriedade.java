package propriedades;

import entidades.Avaliacoes;
import entidades.Reserva;
import entidades.Reservas;

import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class Propriedade {
    ArrayList <entidades.Reservas> reservas = new ArrayList<Reservas>();
    ArrayList <entidades.Avaliacoes> avaliacoes = new ArrayList<Avaliacoes>();
    private String endereco;
    private int numQuartos;
    private double precos;

    public Propriedade(String endereco, int numQuartos, double precos) {
        this.endereco = endereco;
        this.numQuartos = numQuartos;
        this.precos = precos;
    }


    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNumQuartos() {
        return numQuartos;
    }

    public void setNumQuartos(int numQuartos) {
        this.numQuartos = numQuartos;
    }

    public double getPrecos() {
        return precos;
    }

    public void setPrecos(double precos) {
        this.precos = precos;
    }
}
