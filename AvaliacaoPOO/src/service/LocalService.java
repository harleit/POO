package service;


import model.Local;
import repository.LocalRepository;

import java.util.List;

public class LocalService {
    private LocalRepository localRepository;

    public LocalService(LocalRepository localRepository) {
        this.localRepository = localRepository;
    }

    public void adicionarLocal(Local local) {
        localRepository.adicionarLocal(local);
    }

    public void removerLocal(Local local) {
        localRepository.removerLocal(local);
    }

    public void editarLocal(Local local) {
        localRepository.editarLocal(local);
    }

    public List<Local> listarLocais() {
        return localRepository.listarLocais();
    }

    public Local buscarLocalPorNome(String nome) {
        return localRepository.buscarLocalPorNome(nome);
    }
}

