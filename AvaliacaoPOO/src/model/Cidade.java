package model;

import java.util.ArrayList;
import java.util.List;

public class Cidade {
    private String nome;
    private List<Zona> listaDeZonas;

    public Cidade(String nome) {
        this.nome = nome;
        this.listaDeZonas = new ArrayList<>();
    }

    public void adicionarZona(Zona zona) {
        this.listaDeZonas.add(zona);
    }

    public void removerZona(Zona zona) {
        this.listaDeZonas.remove(zona);
    }

    // Getters e Setters


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Zona> getListaDeZonas() {
        return listaDeZonas;
    }

    public void setListaDeZonas(List<Zona> listaDeZonas) {
        this.listaDeZonas = listaDeZonas;
    }

    @Override
    public String toString() {
        return "Cidade{" +
                "nome='" + nome + '\'' +
                ", listaDeZonas=" + listaDeZonas +
                '}';
    }
}
