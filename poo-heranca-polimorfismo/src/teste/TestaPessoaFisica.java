package teste;

import model.PessoaFisica;

public class TestaPessoaFisica {
    public static void main(String[] args) {

        PessoaFisica pessoaFisica = new PessoaFisica();

        pessoaFisica.setNome("Harley");
        pessoaFisica.setDocumento("05223548921");
        pessoaFisica.setTelefone("4002-8922");
        pessoaFisica.setPeso(84.8);
        pessoaFisica.setAltura(1.71);

        System.out.println("Nome: "+pessoaFisica.getNome());
        System.out.println("Documento: "+pessoaFisica.getDocumento());
        System.out.println("Documento correto? "+pessoaFisica.validaDocumento());
        System.out.println("Telefone: "+pessoaFisica.getTelefone());
        System.out.println("Peso: "+pessoaFisica.getPeso());
        System.out.println("Peso: "+pessoaFisica.getAltura());
    }

}
