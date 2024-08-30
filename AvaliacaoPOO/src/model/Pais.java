package model;

import java.util.ArrayList;
import java.util.List;

public class Pais {
    private String nome;
    private List<Estado> listaDeEstados;

    public Pais(String nome) {
        this.nome = nome;
        this.listaDeEstados = new ArrayList<>();
    }

    public void adicionarEstado(Estado estado) {
        this.listaDeEstados.add(estado);
    }

    public void removerEstado(Estado estado) {
        this.listaDeEstados.remove(estado);
    }

    // Getters e Setters


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Estado> getListaDeEstados() {
        return listaDeEstados;
    }

    public void setListaDeEstados(List<Estado> listaDeEstados) {
        this.listaDeEstados = listaDeEstados;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "nome='" + nome + '\'' +
                ", listaDeEstados=" + listaDeEstados +
                '}';
    }
}
