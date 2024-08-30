package model;

import java.util.ArrayList;
import java.util.List;

public class Local {
    private String nome;
    private String endereco;
    private String zona;
    private String cidade;
    private String estado;
    private String pais;
    private List<Avaliacao> avaliacoes;

    public Local(String nome, String endereco, String zona, String cidade, String estado, String pais) {
        this.nome = nome;
        this.endereco = endereco;
        this.zona = zona;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.avaliacoes = new ArrayList<>();
    }

    // Getters e Setters


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public List<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(List<Avaliacao> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }

    public void adicionarAvaliacao(Avaliacao avaliacao) {
        this.avaliacoes.add(avaliacao);
    }

    public void removerAvaliacao(Avaliacao avaliacao) {
        this.avaliacoes.remove(avaliacao);
    }

    @Override
    public String toString() {
        return "Local{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", zona='" + zona + '\'' +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                ", pais='" + pais + '\'' +
                ", avaliacoes=" + avaliacoes +
                '}';
    }
}
