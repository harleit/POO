package teste;

import model.PessoaJuridica;

public class TestaPessoaJuridica {
    public static void main(String[] args) {

        PessoaJuridica pessoaJuridica = new PessoaJuridica();

        pessoaJuridica.setNome("Harley");
        pessoaJuridica.setDocumento("1452568793251a");
        pessoaJuridica.setTelefone("4002-8922");
        pessoaJuridica.setAliquota(15.8);

        System.out.println("Nome: "+pessoaJuridica.getNome());
        System.out.println("Documento: "+pessoaJuridica.getDocumento());
        System.out.println("Documento correto? "+pessoaJuridica.validaDocumento());
        System.out.println("Telefone: "+pessoaJuridica.getTelefone());
        System.out.println("Aliquota: "+pessoaJuridica.getAliquota());
    }
}
