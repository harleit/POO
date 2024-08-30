package model;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private List<Local> listaDeLocais;

    public Usuario(String nome) {
        this.nome = nome;
        this.listaDeLocais = new ArrayList<>();
    }

    public void adicionarLocal(Local local) {
        this.listaDeLocais.add(local);
    }

    public void removerLocal(Local local) {
        this.listaDeLocais.remove(local);
    }

    public void editarLocal(Local local) {
        // Implementar lógica de edição
    }

    public List<Local> visualizarLocais() {
        return listaDeLocais;
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
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", listaDeLocais=" + listaDeLocais +
                '}';
    }
}
