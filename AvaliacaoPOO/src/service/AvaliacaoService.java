package service;

import model.Avaliacao;
import model.Local;
import repository.LocalRepository;

public class AvaliacaoService {
    private LocalRepository localRepository;

    public AvaliacaoService(LocalRepository localRepository) {
        this.localRepository = localRepository;
    }

    public void adicionarAvaliacao(Local local, Avaliacao avaliacao) {
        local.adicionarAvaliacao(avaliacao);
        localRepository.editarLocal(local);
    }

    public void removerAvaliacao(Local local, Avaliacao avaliacao) {
        local.removerAvaliacao(avaliacao);
        localRepository.editarLocal(local);
    }

    public void editarAvaliacao(Local local, Avaliacao avaliacaoAntiga, Avaliacao avaliacaoNova) {
        local.removerAvaliacao(avaliacaoAntiga);
        local.adicionarAvaliacao(avaliacaoNova);
        localRepository.editarLocal(local);
    }
}