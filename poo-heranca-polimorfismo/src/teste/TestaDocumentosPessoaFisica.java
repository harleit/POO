package teste;

import model.PessoaFisica;
import model.ValidarDocumentosPessoasFisica;

import java.util.List;
import java.util.ArrayList;

public class TestaDocumentosPessoaFisica {

    public static String geraDocumentoAleatorio(int tamanho){

        return ("62"+String.valueOf(
                Math.random()*10).substring(2,(tamanho-1))
                +(Math.floor(Math.random()*10)%2==0 ? 'A' : '1'));
    }

    public static void main(String[] args) {

        List<PessoaFisica> pessoasFisicas = new ArrayList<>();



        for (int i = 0; i<100; i++) {

            PessoaFisica pf = new PessoaFisica();
            pf.setNome("Pessoa "+(i+1));
            pf.setDocumento(geraDocumentoAleatorio(11));
            pf.setPeso(84.5);
            pf.setAltura(1.95);

            pessoasFisicas.add(pf);

        }

        //Executar o objeto validador
        ValidarDocumentosPessoasFisica validador =
                new ValidarDocumentosPessoasFisica();

        for (PessoaFisica p: pessoasFisicas){
            validador.addPessoaFisica(p);
        }

        //Mostrar os validos
        System.out.println("************MOSTRAR OS VALIDOS******************");
        for (PessoaFisica p:validador.getValidos()){

            System.out.println(p.getNome());
            System.out.println(p.getDocumento());
            System.out.println(p.getPeso());
            System.out.println(p.getAltura());

        }
        //Mostrar os invalidos

        System.out.println("************MOSTRAR OS INVALIDOS******************");
        for (PessoaFisica p:validador.getInvalidos()){

            System.out.println(p.getNome());
            System.out.println(p.getDocumento());
            System.out.println(p.getPeso());
            System.out.println(p.getAltura());

        }
        //backup
//        for (PessoaFisica p: pessoasFisicas){
//
//            System.out.println(p.getDocumento());
//            System.out.println(p.getPeso());
//            System.out.println(p.getAltura());
//
//        }
    }
}
