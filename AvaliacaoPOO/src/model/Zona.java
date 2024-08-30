package model;

import java.util.ArrayList;
import java.util.List;

public class Zona {
    private String nome;
    private List<Local> listaDeLocais;

    public Zona(String nome) {
        this.nome = nome;
        this.listaDeLocais = new ArrayList<>();
    }

    public void adicionarLocal(Local local) {
        this.listaDeLocais.add(local);
    }

    public void removerLocal(Local local) {
        this.listaDeLocais.remove(local);
    }

    // Getters e Setters


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Local> getListaDeLocais() {
        return listaDeLocais;
    }

    public void setListaDeLocais(List<Local> listaDeLocais) {
        this.listaDeLocais = listaDeLocais;
    }

    @Override
    public String toString() {
        return "Zona{" +
                "nome='" + nome + '\'' +
                ", listaDeLocais=" + listaDeLocais +
                '}';
    }
}
