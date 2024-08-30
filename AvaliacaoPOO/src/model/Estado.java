package model;

import java.util.ArrayList;
import java.util.List;

public class Estado {
    private String nome;
    private List<Cidade> listaDeCidades;

    public Estado(String nome) {
        this.nome = nome;
        this.listaDeCidades = new ArrayList<>();
    }

    public void adicionarCidade(Cidade cidade) {
        this.listaDeCidades.add(cidade);
    }

    public void removerCidade(Cidade cidade) {
        this.listaDeCidades.remove(cidade);
    }

    // Getters e Setters


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Cidade> getListaDeCidades() {
        return listaDeCidades;
    }

    public void setListaDeCidades(List<Cidade> listaDeCidades) {
        this.listaDeCidades = listaDeCidades;
    }

    @Override
    public String toString() {
        return "Estado{" +
                "nome='" + nome + '\'' +
                ", listaDeCidades=" + listaDeCidades +
                '}';
    }
}
